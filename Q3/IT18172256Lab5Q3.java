import java.util.Scanner;

public class IT18172256Lab5Q3 {
    static final double ROOM_CHARGE_PER_DAY = 48000.00;
    static final int MIN_DAY = 1;
    static final int MAX_DAY = 31;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1: within range
        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2: start before end
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int daysReserved = endDate - startDate;

        double discountRate;
        if (daysReserved >= 5) {
            discountRate = 0.20;
        } else if (daysReserved >= 3) {
            discountRate = 0.10;
        } else {
            discountRate = 0.0;
        }

        double totalBeforeDiscount = daysReserved * ROOM_CHARGE_PER_DAY;
        double totalAmount = totalBeforeDiscount - (totalBeforeDiscount * discountRate);

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}