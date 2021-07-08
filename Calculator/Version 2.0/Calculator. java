import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Welcome to Advanced Java Calculator -- by Jay" + "\n");

        System.out.print("+ : Addition" + "\t" + "\t");       System.out.print(" ^ : Square" + "\t");  System.out.println("        $ : Minimum");
        System.out.print("- : Subtraction" + "\t" + "\t");    System.out.print(" ! : Cube" + "\t");         System.out.println("       () : Round");
        System.out.print("/ : Division" + "\t" + "\t");       System.out.println("^^ : Square root");
        System.out.print("* : Multiplication" + "\t"); System.out.println("!! : Cube root");
        System.out.print("% : Modulus" + "\t" + "\t");        System.out.println("     & : Maximum" + "\n");

        System.out.println("Enter a number");
        boolean valid = true;
        double userNum1;

        do {
            Scanner User1 = new Scanner(System.in);

            try {
                userNum1 = User1.nextDouble();
                System.out.println(userNum1);
                break;
            } catch (Exception a) {
                System.out.println("It should be a number!");
                valid = false;
            }
        } while (true); // first number

        String expression;
        boolean NewValid;
        boolean newValid;
        boolean NEWValid;
        boolean NEWVAlid;
        boolean NEWVALID;
        boolean vaLID;
        boolean square;
        boolean cube;
        boolean MAX;
        boolean MIN;

        NewValid = true;

        boolean VALID;
        System.out.println("\n" + "Enter a expression");

        do {

            VALID = true;
            Scanner exp = new Scanner(System.in);
            expression = exp.next();

            if (expression.equals("+")) {
                VALID = false;
                break;
            } else if (expression.equals("-")) {
                VALID = false;
                break;
            } else if (expression.equals("*")) {
                VALID = false;
                break;
            } else if (expression.equals("/")) {
                VALID = false;
                break;
            } else if (expression.equals("%")) {
                VALID = false;
                break;
            } else if (expression.equals("^")) {
                VALID = false;
                break;
            } else if (expression.equals("!")) {
                VALID = false;
                break;
            } else if (expression.equals("^^")) {
                VALID = false;
                break;
            } else if (expression.equals("!!")) {
                VALID = false;
                break;
            } else if (expression.equals("()")) {
                VALID = false;
                break;
            } else if (expression.equals("$")) {
                VALID = false;
                break;
            } else if (expression.equals("&")) {
                VALID = false;
                break;
            } else System.out.println("Enter a expression!");

        } while (true); // of expressions
        if (expression.equals("+")) {
            System.out.println("\n" + "Enter a second number" + "\n");
            double userNum2;

            newValid = true;

            do {
                Scanner Num2 = new Scanner(System.in);
                try {
                    userNum2 = Num2.nextDouble();
                    double sum = userNum1 + userNum2;
                    System.out.println(userNum1 + " + " + userNum2 + " = " + sum);
                    break;
                } catch (Exception t) {
                    System.out.println("It should be a number");
                    newValid = false;
                }
            } while (true);
        }  // if +
        if (expression.equals("-")) {
            System.out.println("\n" + "Enter a second number");

            NEWValid = true;

            do {
                double userNum3;
                Scanner Num3 = new Scanner(System.in);
                try {
                    userNum3 = Num3.nextDouble();
                    double Sum = userNum1 - userNum3;
                    System.out.println(userNum1 + " - " + userNum3 + " = " + Sum);
                    break;
                } catch (Exception z) {
                    System.out.println("It should be a number");
                    NEWValid = false;
                }
            } while (true);
        }  // if -
        if (expression.equals("*")) {
            System.out.println("Enter a second number");
            double userNum4;

            NEWVAlid = true;

            do {
                Scanner Num4 = new Scanner(System.in);
                try {
                    userNum4 = Num4.nextDouble();
                    double SUm = userNum1 * userNum4;
                    System.out.println(userNum1 + " * " + userNum4 + " = " + SUm);
                    break;
                } catch (Exception g) {
                    System.out.println("It should be a number");
                    NEWValid = false;
                }
            } while (true);
        } // if *
        if (expression.equals("%")) {
            System.out.println("Enter a second number");
            double userNum5;

            NEWVALID = true;

            do {
                Scanner Num5 = new Scanner(System.in);
                try {
                    userNum5 = Num5.nextDouble();
                    double SUM = userNum1 % userNum5;
                    System.out.println(userNum1 + " % " + userNum5 + " = " + SUM);
                    break;
                } catch (Exception j) {
                    System.out.println("It should be a number");
                    NEWVALID = false;
                }
            } while (true);
        } // if %
        if (expression.equals("/")) {
            System.out.println("Enter a second number");
            double userNum5;

            vaLID = true;

            do {
                Scanner Num6 = new Scanner(System.in);
                try {
                    userNum5 = Num6.nextDouble();
                    double SUM = userNum1 / userNum5;
                    System.out.println(userNum1 + " / " + userNum5 + " = " + SUM);
                    break;
                } catch (Exception j) {
                    System.out.println("It should be a number");
                    NEWVALID = false;
                }
            } while (true);
        } // if /
        if (expression.equals("^")) {
            do {
                square = true;
                double Square;
                Square = userNum1 * userNum1;
                System.out.println("The square of " + userNum1 + " is " + Square);
                square = false;
                break;
            } while(true);
        } // if ^ Square
        if (expression.equals("!")) {
            do {
                cube = true;
                double Cube;
                Cube = userNum1 * userNum1 * userNum1;
                System.out.println("The cube of " + userNum1 + " is " + Cube);
                cube = false;
                break;
            } while(true);
        } // if ! Cube
        if (expression.equals("^^")) {
            do {

                double Root1;
                Root1 = Math.sqrt(userNum1);
                System.out.println("The square root of " + userNum1 + " is " + Root1);

                break;
            } while(true);
        } // if ^^ Square root
        if (expression.equals("!!")) {
            do {

                double Root2;
                Root2 = Math.cbrt(userNum1);
                System.out.println("The cube root of " + userNum1 + " is " + Root2);

                break;
            } while(true);
        } // if !! Cube root
        if (expression.equals("()")) {
            do {

                double Round;
                Round = Math.round(userNum1);
                System.out.println("The round of " + userNum1 + " is " + Round);

                break;
            } while(true);
        } // if () Round
        if (expression.equals("&")) {
            System.out.println("\n" + "Enter a second number");
            double maxi;

            MAX = true;

            do {
                Scanner Max = new Scanner(System.in);
                try {
                    maxi = Max.nextDouble();
                    double max = Math.max(userNum1, maxi);
                    System.out.println("The maximum value is " + max);
                    break;
                } catch (Exception r) {
                    System.out.println("It should be a number");
                    MAX = false;
                }
            } while (true);
        }  // if & Maximun
        if (expression.equals("$")) {
            System.out.println("\n" + "Enter a second number");
            double min;

            MIN = true;

            do {
                Scanner Min = new Scanner(System.in);
                try {
                    min = Min.nextDouble();
                    double mini =Math.min(userNum1, min);
                    System.out.println("The minimum value is " + mini);
                    break;
                } catch (Exception h) {
                    System.out.println("It should be a number");
                    MIN = false;
                }
            } while (true);
        }  // if $ Minimum
    }
}
