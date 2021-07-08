import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nJava Guess Game - by Jay");
        Scanner name = new Scanner(System.in);
        Scanner name02 = new Scanner(System.in);
        Scanner name03 = new Scanner(System.in);
        Scanner name04 = new Scanner(System.in);
        Scanner name05 = new Scanner(System.in);

        System.out.println("\nEnter player 1 name");
        String name1 = name.next();
        System.out.println("Player 1 name is: "+name1);

        System.out.println("\n\nEnter player 2 name");
        String name2 = name02.next();
        System.out.println("Player 2 name is: "+name2);

        System.out.println("\n\nEnter player 3 name");
        String name3 = name03.next();
        System.out.println("Player 3 name is: "+name3);

        System.out.println("\n\nEnter player 4 name");
        String name4 = name04.next();
        System.out.println("Player 4 name is: "+name4);

        System.out.println("\n\nEnter player 5 name");
        String name5 = name05.next();
        System.out.println("Player 5 name is: "+name5);

        System.out.println("\n\nComputer has selected a number from 0 to 9.");
        System.out.println("Try to guess that number");

        Scanner guess = new Scanner(System.in);
        Scanner guess01 = new Scanner(System.in);
        Scanner guess02 = new Scanner(System.in);
        Scanner guess03 = new Scanner(System.in);
        Scanner guess04 = new Scanner(System.in);

        System.out.println("\n\n"+name1+ ", select a number from 0 to 9");
        int guess1= guess.nextInt();
        System.out.println(name1+ " has guessed "+guess1);

        System.out.println("\n\n"+name2+ ", select a number from 0 to 9");
        int guess2= guess01.nextInt();
        System.out.println(name2+ " has guessed "+guess2);

        System.out.println("\n\n"+name3+", guess a number");
        int guess3 = guess02.nextInt();
        System.out.println(name3+ " has guessed "+guess3);

        System.out.println("\n\n"+name4+", guess a number");
        int guess4 = guess03.nextInt();
        System.out.println(name4+ " has guessed "+guess4);

        System.out.println("\n\n"+name5+", guess a number");
        int guess5 = guess04.nextInt();
        System.out.println(name5+ " has guessed "+guess5);

        int[] rands = {guess1, guess2, guess3, guess4, guess5};
        Random generator = new Random();
        int randomIndex = generator.nextInt(5);
        int comp = rands[randomIndex];
        System.out.println("Computer guessed: " + comp + "\n\n");

        if (guess1 == comp) {
            System.out.println("Congrats! "+name1+ ", you guessed the number correct!");
        } else {
            System.out.println(name1+" guessed the number wrong!");
        }
        if (guess2 == comp) {
            System.out.println("Congrats! "+name2+ ", you guessed the number correct!");
        } else {
            System.out.println(name2+" guessed the number wrong!");
        }
        if (guess3 == comp) {
            System.out.println("Congrats! "+name3+ ", you guessed the number correct!");
        } else {
            System.out.println(name3+" guessed the number wrong!");
        }
        if (guess4 == comp) {
            System.out.println("Congrats! "+name4+ ", you guessed the number correct!");
        } else {
            System.out.println( name4+" guessed the number wrong!");
        }
        if (guess5 == comp) {
            System.out.println("Congrats! "+name5+ ", you guessed the number correct!");
        } else {
            System.out.println( name5+" guessed the number wrong!");
        }


        System.out.println("\nComputer guessed:"+comp);
    }
}
