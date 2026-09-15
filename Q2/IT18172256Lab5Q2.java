import java.util.Scanner;

public class IT18172256Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int members = input.nextInt();

        if (members < 0) {
            System.out.println("Input must be a number 0 or greater");
            return;
        }

        // Cap anything 5 or more to case 5, so switch can handle it
        int switchValue = (members >= 5) ? 5 : members;

        System.out.println();

        switch (switchValue) {
            case 0:
                System.out.println("No Prize");
                break;
            case 1:
                System.out.println("Prize is a : Pen");
                break;
            case 2:
                System.out.println("Prize is a : Umbrella");
                break;
            case 3:
                System.out.println("Prize is a : Bag");
                break;
            case 4:
                System.out.println("Prize is a : Travelling Chair");
                break;
            case 5:
                System.out.println("Prize is a : Headphone");
                break;
        }
    }
}