import java.util.Scanner;

public class DistanceConvert {
    public static void main(String[] args) {
        System.out.println("Welcome to Distance Converter -- By Jay");
        System.out.println("\n" + "Enter a number");

        double userNum;

        boolean valid;

        do {
            valid = true;
            Scanner Num1 = new Scanner(System.in);
            try {
                userNum = Num1.nextDouble();
                break;
            } catch (Exception a) {
                System.out.println("It should be a number!");
                valid = false;
            }
        } while(true);

        String Unit1;
        boolean Valid;
        boolean NewValid;

        System.out.println("Enter the unit of " + userNum);

        do {
            Valid = true;
            Scanner unit1 = new Scanner (System.in);
            Unit1 = unit1.next();
             if (Unit1.equals("meter")) {
                 System.out.println("Enter a unit to be converted into");
                 do {
                     NewValid = true;
                     String Unit2;
                     Scanner unit2 = new Scanner (System.in);
                     Unit2 = unit2.next();

                      if (Unit2.equals("meter")) {
                          System.out.println("Meter: " + userNum);
                          System.out.println("Converted to Meter: " + userNum);
                          Valid = false;
                          NewValid = false;
                          break;
                      }
                 } while (false);
             }
        } while (false);
    }
}
