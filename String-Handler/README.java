package main.userInterfaces;

public interface README {
     static void readMe() throws InterruptedException {
        Runnable Intro = new Runnable() {
            @Override
            public void run() {
                System.out.println("""
                -----------------------------------------
                Introduction
                -----------------------------------------
                
                Welcome to Java String Handler -- By Jay (v1.0)
                
                You can now perform any tasks on your String!
                You just need to write your String in the program
                and it will suggest you some operations on your String
                Type the shortcuts given below to do particular operation
                """);
            }
        };

        Thread intro = new Thread(Intro);
        intro.start();

        Runnable Short = new Runnable() {
            @Override
            public void run() {
                System.out.println("""
                        ---------------------------------------------
                        Shortcuts:
                        ---------------------------------------------
                        
                        1) Delete a Character    ---   "1", "DC", "d"
                        2) Find a Character      ---   "2", "FC", "f"
                        3) Index of a Character  ---   "4", "IN", "n"
                        """);
            }
        };

        Thread shortcuts = new Thread(Short);
        Thread.sleep(1000);
        shortcuts.start();

        Runnable desc = new Runnable() {
            @Override
            public void run() {
                System.out.println("""
                        ---------------------------------------------
                        Description of the Operations:
                        ---------------------------------------------
                        
                        1) Delete a Character:
                        The program will ask you a index and it will delete a character at the
                        given index by the user
                        
                        2) Find a Character
                        The program will return a character a given index by the user
                        
                        3) Index of a Character
                        It will return a index of the character given by the user

                        """);
            }
        };

        Thread description = new Thread(desc);
        Thread.sleep(2000);
        description.start();

        Runnable key = new Runnable() {
            @Override
            public void run() {
                System.out.println("""
                        --------------------------------------------------
                        Keywords
                        --------------------------------------------------
                        
                        1) .readme => To print this message
                        2) .load => To load the main program
                        3) .exit => To exit the program
                        
                        -------------------------------------------------
                        -------------------------------------------------
                        -------------------------------------------------

                        """);
            }
        };

        Thread keywords = new Thread(key);
        Thread.sleep(3000);
        keywords.start();
    }
}
