import java.util.Scanner;

public class Parallel {

    public void Booking() {
        Scanner input = new Scanner(System.in);
        String[] menuItem = { "Jollof", "Ghob3", "Waakye", "Banku" };
        int[] order = { 1, 2, 3, 4 };
        double[] price = { 45.5, 25.5, 35.6, 55.5 };

        for (int i = 0; i < menuItem.length; i++) {
            System.out.println(order[i] + " " + menuItem[i]);
        }

        System.out.println(" ");

        int guestOrder = input.nextInt();

        if (guestOrder == 1) {
            System.out.println("Menu: " + menuItem[0]);
            System.out.println("Price: Ghc " + price[0]);
            System.out.println("Do you want to precede with your order ?");
            String proceed = input.next();
            if (proceed.equalsIgnoreCase("yes")) {
                System.out.println("Your order is being processed, plese wait for a while.");
            } else if (proceed.equalsIgnoreCase("no")) {
                System.out.println("Please you can choose a different menu");
                Booking();
            } else {
                System.out.println("Invalid input, please enter 'yes' or 'no'");
            }
        } else if (guestOrder == 2) {
            System.out.println("Your  " + menuItem[1]);
            System.out.println("Price: Ghc " + price[1]);
            System.out.println("Do you want to precede with your order ?");
            String proceed = input.next();
            if (proceed.equalsIgnoreCase("yes")) {
                System.out.println("Your order is being processed, plese wait for a while.");
            } else if (proceed.equalsIgnoreCase("no")) {
                System.out.println("Please you can choose a different menu");
                Booking();
            } else {
                System.out.println("Invalid input, please enter 'yes' or 'no'");
            }
        } else if (guestOrder == 3) {
            System.out.println("Your " + menuItem[2]);
            System.out.println("Price: Ghc " + price[2]);
            System.out.println("Do you want to precede with your order ?");
            String proceed = input.next();
            if (proceed.equalsIgnoreCase("yes")) {
                System.out.println("Your order is being processed, plese wait for a while.");
            } else if (proceed.equalsIgnoreCase("no")) {
                System.out.println("Please you can choose a different menu");
                Booking();
            } else {
                System.out.println("Invalid input, please enter 'yes' or 'no'");
            }
        } else if (guestOrder == 4) {
            System.out.println("Your " + menuItem[3]);
            System.out.println("Price: Ghc " + price[3]);
            System.out.println("Do you want to precede with your order ?");
            String proceed = input.next();
            if (proceed.equalsIgnoreCase("yes")) {
                System.out.println("Your order is being processed, plese wait for a while.");
            } else if (proceed.equalsIgnoreCase("no")) {
                System.out.println("Please you can choose a different menu");
                Booking();
            } else {
                System.out.println("Invalid input, please enter 'yes' or 'no'");
            }
        } else if (guestOrder < 1 || guestOrder > 4) {
            System.out.println("Please the menu you ordered is not availabele!!");
            System.out.println("Pease check inside the menu list for the available menu. Thank You.");
            Booking();
        }
        input.close();
    }

    public static void main(String[] args) {
        /*
         * int[] pam = {2,3,4,5};
         * for(int i = 0;i < pam.length;i++){
         * System.out.println(pam[i]);
         * }
         * 
         * 
         * String[] firstName = {"Mike","Jude","Mark"};
         * String[] lastName = {"Jackson","Blake","Dhan"};
         * int [] ages = {34,32,45};
         * for(int a = 0; a < firstName.length;a++){
         * for(int i = a + 1;i < firstName.length;i++){
         * System.out.println(firstName[i] + " " + lastName[i]);
         * 
         * 
         * 
         * 
         * }
         * }
         */
        System.out.println("Welcome to Bush Kay Chop Bar");
        System.out.println("Please what would you like to have?");

        Parallel myOrder = new Parallel();
        myOrder.Booking();

    }

}
