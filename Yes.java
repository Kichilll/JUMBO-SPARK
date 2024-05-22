import java.util.Scanner;

public class Yes {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String processOrder;
        processOrder =  sc.nextLine();
sc.close();
        switch (processOrder) {
            case "YES":
            System.out.println("Your order is being processed,please it will take a while.");
                break;

            case "yes":
            System.out.println("Your order is being processed,please it will take a while.");    
            break;

            case "Yes":
            System.out.println("Your order is being processed,please it will take a while.");    
            break;


            case "No":
            System.out.println("Please you can choose a different menu.");
            break;

            case "NO":
            System.out.println("Please you can choose a different menu.");
            break;

            case "no":
            System.out.println("Please you can choose a different menu.");
            break;

        
            default:
            System.out.println("Pardon me, can you repeat yourself .");
                break;
        }
    }
}