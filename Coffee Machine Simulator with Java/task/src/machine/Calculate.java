package machine;

public class Calculate {
    public int calculate(int water, int milk, int coffee) {
        int count = 0;

        while (water >= 200 && milk >= 50 && coffee >= 15) {
            int WATER = 200;
            water -= WATER;

            int MILK = 50;
            milk -= MILK;

            int COFFEE = 15;
            coffee -= COFFEE;

            count++;
        }

        return count;
    }

    public void estimate(int water, int milk, int coffee, int need) {
        int calc = calculate(water, milk, coffee);

        if (calc == need) {
            System.out.println(Messages.I_CAN_MAKE);
        } else if (calc > need) {
            System.out.printf(Messages.I_CAN_MAKE_MORE.toString(), calc - need);
        } else {
            System.out.printf(Messages.I_CAN_NOT_MAKE.toString(), calc);
        }
    }
}
