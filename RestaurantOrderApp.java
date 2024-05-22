import java.util.Scanner;

public class RestaurantOrderApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample menu items and prices (modify as needed)
        String[] menuItems = {"Pizza (Margherita)", "Pasta (Alfredo)", "Salad (Caesar)", "Drink (Soda)"};
        double[] prices = {10.99, 8.50, 7.25, 1.50};

        // Order storage and tracking
        String[] order = new String[menuItems.length];
        int orderCount = 0;
        double total = 0.0;

        // Display menu
        System.out.println("Welcome to Our Restaurant!");
        displayMenu(menuItems, prices);//NO Idea here

        // Take orders
        while (true) {
            System.out.println("\nWhat would you like to order? (Enter a number from 1 to " + menuItems.length + " or 'q' to quit): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("q")) {
                break; // Exit loop if user enters 'q'
            }

            int itemIndex;
            try {
                itemIndex = Integer.parseInt(choice) - 1; // Convert user input to index (0-based)
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'q'.");
                continue; // Skip to next iteration if input is not a number
            }

            if (itemIndex >= 0 && itemIndex < menuItems.length) {
                // Valid item selection
                order[itemIndex] = menuItems[itemIndex];
                orderCount++;
                total += prices[itemIndex];
                System.out.println(order[itemIndex] + " added to your order.");
            } else {
                System.out.println("Invalid item number. Please choose from the menu.");
            }
        }

        // Print order summary
        if (orderCount > 0) {
            System.out.println("\nYour Order:");
            for (int i = 0; i < order.length; i++) {
                if (order[i] != null) {
                    System.out.println(order[i] + " - $" + String.format("%.2f", prices[i]));
                }
            }
            System.out.println("Total: $" + String.format("%.2f", total));
        } else {
            System.out.println("You haven't placed any orders.");
        }

        scanner.close();
    }

    public static void displayMenu(String[] items, double[] prices) {
        System.out.println("\nMenu:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - $" + String.format("%.2f", prices[i]));
        }
    }
}