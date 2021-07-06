package main.fxInterfaces;

import java.util.Scanner;

public interface index {
    public static void indexof(String str) {
        System.out.println("Index of Character: " + "\n");
        boolean index = true;
        String message = null;
        String ch = null;
        Scanner ind = new Scanner(System.in);
        System.out.println("Enter any character from your String");
        ch = ind.next();

        do {
            if (ch.length() == 1) {
                System.out.println("Index to be found of: " + ch);
                StringBuilder build = new StringBuilder(str);

                int indexOf = build.indexOf(ch);
                System.out.println("\n" + "Index: " + indexOf);
                break;
            } else {
                System.out.println("Oops, An Error Occured!!!");
                break;
            }
        } while (index == true);

    }
}
