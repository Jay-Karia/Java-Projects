package main.fxInterfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface delete {
    static void deleteChar(String str) {
        System.out.println("Delete A Character: ");
        boolean delete = true;
        Scanner dl = new Scanner(System.in);
        int del = 0;
        String message = null;

        do {
//            delete = true;
            System.out.println("\nEnter any index from your String");
            try {
                del = dl.nextInt();
                message = "Character to be deleted at Index: " + del;
                System.out.println( message + "\n");
                StringBuilder buffer = new StringBuilder(str);
                buffer.deleteCharAt(del);
                String string = buffer.toString();
                System.out.println("Final String: " + string);
                break;

            }   catch (StringIndexOutOfBoundsException bx) {
                System.out.println("Your number should be within: " + (str.length() - 1));
//                delete = false;
//                break;
            } catch (InputMismatchException ix) {
                System.out.println("Oops, An Error Occured!!!");
                break;
            }

        } while (delete == true);
    }
    }
