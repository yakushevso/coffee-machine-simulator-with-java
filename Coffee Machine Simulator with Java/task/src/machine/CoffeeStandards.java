package machine;

public enum CoffeeStandards {
    ESPRESSO(250, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6);

    final int water;
    int milk;
    final int beans;
    final int price;

    CoffeeStandards(int water, int milk, int beans, int price) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.price = price;
    }

    CoffeeStandards(int water, int beans, int price) {
        this.water = water;
        this.beans = beans;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }
}
