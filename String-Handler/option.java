package main.userInterfaces;

import java.util.Scanner;

public interface option {
    static void opt() throws InterruptedException {
        System.out.println("""
                
                Type '.readme' to open README text
                Type '.load' to load the program

                """);

        String option = null;
        Scanner opt = new Scanner(System.in);
        do {
            option = opt.next();
            if (option.equals(".readme")) {
                README.readMe();
            } else if (option.equals(".load")) {
                Display.dis();
                break;
            } else System.out.println("It should be a valid Keyword");

        } while(!option.equals(".load") || !option.equals(".readme"));

    }
}
