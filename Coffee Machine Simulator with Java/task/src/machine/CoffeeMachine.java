package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cups = sc.nextInt();
            System.out.printf("For %d cups of coffee you will need:\n", cups);
            calculator(cups);
        }
    }

    public static void calculator(int cups) {
        int water = 200;
        int milk = 50;
        int coffee = 15;

        System.out.printf("%d ml of water\n%d ml of milk\n%d g of coffee beans",
                water * cups, milk * cups, coffee * cups);
    }
}
