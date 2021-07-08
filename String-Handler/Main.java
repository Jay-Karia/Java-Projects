package main;

import main.fxInterfaces.index;
import main.userInterfaces.README;
import main.userInterfaces.Display;
import main.userInterfaces.option;

import main.fxInterfaces.delete;
import main.fxInterfaces.find;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class Main {
    static BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
    static String str = null;
    private static int InputMismatchException;

    public static void main(String[] args ) throws InterruptedException, IOException {


        option.opt();

        Scanner select = new Scanner(System.in);
        String Select = null;

        System.out.println("Enter a String");

         str =  string.readLine();
        System.out.println("Your String: " + str );
        System.out.println("String Length: " + (str.length() -1 ) + "\n");

        do {
            System.out.println("Enter a shortcut or Type '.exit' to exit the program");
            Select = select.next();
            if (Select.equals("1") || Select.equals("DC") || Select.equals("d")) {
                delete.deleteChar(str);
                break;
            } else if (Select.equals("2") || Select.equals("FC") || Select.equals("f")) {
                find.findChar(str);
                break;
            } else if (Select.equals("3") || Select.equals("IN") || Select.equals("n")) {
                index.indexof(str);
                break;
            }
        } while (!Select.equals(".exit"));
    }
}
