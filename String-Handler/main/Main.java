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

        label:
        do {
            System.out.println("Enter a shortcut or Type '.exit' to exit the program");
            Select = select.next();
            switch (Select) {
                case "1", "DC", "d" -> delete.deleteChar(str);
                case "2", "FC", "f" -> find.findChar(str);
                case "3", "IN", "n" -> index.indexof(str);
            }
        } while (!Select.equals(".exit"));
    }
}