import java.util.Scanner;

public class interchange {
    private static Scanner num2;
    private static Scanner num1;

    public static void main(String[] args) {
        try {
        System.out.println("Enter number 1: ");
        num1 = new Scanner(System.in);
        int n1 = num1.nextInt();
        System.out.println("Number 1: " + n1);

        System.out.print("\nEnter number 2: ");
        num2 = new Scanner(System.in);
        int n2 = num2.nextInt();
        System.out.println("Number 2: " + n2);

        int d = n1-n2;
        if (n1 > n2) {
            n1 = n2;
        int diff = Math.abs(d);
            n2 = n1 + diff; 
        } else {
            n1 = n2;
        int diff = Math.abs(d); 
            n2 = n1 - diff; 
        }

        System.out.println("\nNumber 1: " + n1);
        System.out.println("Number 2: " + n2 + "\n");
        } catch (Exception ex) {
            System.out.println("It should be a number!");
            System.out.println("Program Quitted!");
        }
    }
}