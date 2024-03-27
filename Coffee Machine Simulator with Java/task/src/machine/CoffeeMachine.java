package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffee;
    private int cups;
    private int money;

    public CoffeeMachine(int water, int milk, int coffee, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cups = cups;
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void request() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(Messages.ACTION);
            String action = sc.next();

            switch (action) {
                case "buy" -> {
                    System.out.println(Messages.BUY);
                    int type = sc.nextInt();
                    buy(type);
                }
                case "fill" -> {
                    System.out.println(Messages.ADD_WATER);
                    int water = sc.nextInt();

                    System.out.println(Messages.ADD_MILK);
                    int milk = sc.nextInt();

                    System.out.println(Messages.ADD_COFFEE);
                    int coffee = sc.nextInt();

                    System.out.println(Messages.ADD_CUPS);
                    int cups = sc.nextInt();

                    fill(water, milk, coffee, cups);
                }
                case "take" -> {
                    System.out.printf(Messages.TAKE.toString(), this.getMoney());
                    take();
                }
            }
        }
    }

    public void printResource() {
        System.out.printf(Messages.RESOURCE.toString(),
                getWater(), getMilk(), getCoffee(), getCups(), getMoney());
    }

    public void buy(int type) {
        switch (type) {
            case 1 -> {
                setWater(this.water - 250);
                setCoffee(this.coffee - 16);
                setMoney(this.money + 4);
                setCups(this.cups - 1);
            }
            case 2 -> {
                setWater(this.water - 350);
                setMilk(this.milk - 75);
                setCoffee(this.coffee - 20);
                setMoney(this.money + 7);
                setCups(this.cups - 1);
            }
            case 3 -> {
                setWater(this.water - 200);
                setMilk(this.milk - 100);
                setCoffee(this.coffee - 12);
                setMoney(this.money + 6);
                setCups(this.cups - 1);
            }
        }
    }

    public void fill(int water, int milk, int coffee, int cups) {
        setWater(this.water + water);
        setMilk(this.milk + milk);
        setCoffee(this.coffee + coffee);
        setCups(this.cups + cups);
    }

    public void take() {
        setMoney(0);
    }
}
