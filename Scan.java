import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name.");
        String fname;
        fname = sc.nextLine().toUpperCase();
        System.out.println("My name is "+ fname);

    }
}
