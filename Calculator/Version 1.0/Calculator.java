import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        System.out.println("Welcome to Java calculator -- by Jay" + "\n");
        System.out.println("+ : Addition");
        System.out.println("- : Subtraction");
        System.out.println("/ : Division");
        System.out.println("* : Multiplication");
        System.out.println("% : Modulus" + "\n");

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
               } else System.out.println("It should be an expression!");

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
        System.out.println("\n" + "More Coming Soon on Advanced Version!");


    }
}
