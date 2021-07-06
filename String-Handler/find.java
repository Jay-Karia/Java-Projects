package main.fxInterfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface find {
    public static void findChar(String str) {

        System.out.println("Find a Character: \n");
        boolean find = true;
        Scanner fn = new Scanner(System.in);
        int fin = 0;
        String message = null;

        do {
            System.out.println("Enter any index from your String");
            try{
                fin = fn.nextInt();
                message = "Character to be Found At: " + fin;
                System.out.println(message + "\n");
                StringBuilder buid = new StringBuilder(str);
                char string = buid.charAt(fin);
//                String string = buid.toString();
                System.out.println("Character at " + fin + ": " + string);
                break;

            } catch (StringIndexOutOfBoundsException exc) {
                System.out.println("Your number should be within: " + (str.length() - 1));
            } catch (InputMismatchException e) {
                System.out.println("Oops, An Error Occured!!!");
                find = false;
            }

        } while(find == true);
    }
}
