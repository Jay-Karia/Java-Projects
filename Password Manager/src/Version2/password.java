import java.util.Objects;
import java.util.Scanner;
import java.io.*;
// Not working
public class password {
    public static void main(String[] args) throws IOException {
        System.out.println("\nWelcome to Password Manager Developed -- By Jay (v-2.0)");

        println("\n1) Set your Custom Directory\n2) Keep it Default");
        String cDir = null;
        Scanner Sel = new Scanner(System.in);
        String s = Sel.next();
        if (s.equals("1")) {
            println("Selected: 1) Custom Directory");
            Scanner custom = new Scanner(System.in);
            cDir = custom.nextLine() + "\\";
            System.out.println("You Directory is set to: " + cDir);
        } else if (s.equals("2")) {
            println("\nSelected: 2) Default Directory");
            cDir = new java.io.File(".").getCanonicalPath() + "\\";
            System.out.println("Default Directory is set: " + cDir);
        }

        println("\nWhat do you want to Do?\n1) Enter a New Password\n2) Retrieve Your Password\n3) Delete your Password");
        String sel;
        Scanner selection = new Scanner(System.in);
        sel = selection.nextLine();
        switch (sel) {
            case "1" -> {
                println("\nSelected: 1) Enter a new Password");
                println("\nEnter your True Information");

                println("\nEnter your name");
                Scanner name = new Scanner(System.in);
                String n = name.nextLine();

                println("\nEnter your Message");
                Scanner mess = new Scanner(System.in);
                String message = mess.nextLine();

                println("\nYour Password");
                Scanner pass = new Scanner(System.in);
                String password = pass.nextLine();
                boolean valid;
                println("Confirm your Password");
                do {
                    valid = true;
                    Scanner newPass = new Scanner(System.in);
                    String newPassword = newPass.nextLine();

                    if (Objects.equals(password, newPassword)) {
                        println("\nPassword is Set!");
                        println("One last Step to go!\n");
                        println("Enter the Security Key for your Password");
                        Scanner security = new Scanner(System.in);
                        String key = security.nextLine();
                        /*Setting a Password*/
                        println("\nEnter your False information");

                        println("Enter your false name");
                        Scanner fName = new Scanner(System.in);
                        String fN = fName.nextLine();

                        println("\nEnter your false message");
                        Scanner fMessage = new Scanner(System.in);
                        String fM = fMessage.nextLine();

                        println("\nEnter your false password");
                        Scanner fPass = new Scanner(System.in);
                        String fP = fPass.nextLine();

                        println("\nEnter your false security key");
                        Scanner fKey = new Scanner(System.in);
                        String fK = fKey.nextLine();

                        String[] originalValues = {n, message, password, key, cDir};
                        // Make a File Object
                        File file = new File(originalValues[4] + fK + ".txt");

                        String[] fakeValues = {fN, fM, fP, fK};
                        encode(fakeValues, cDir);
                    } else {
                        println("Your password doesn't match! Try again");
                        valid = false;
                    }
                } while (!valid);
            }
            case "2" -> {
                println("\nSelected: 2) Retrieve Your Password");
                println("\nEnter the Security Key to retrieve your password\n");
                Scanner sec = new Scanner(System.in);
                String newSec = sec.nextLine();
                try {
                    File f = new File(cDir + newSec + ".txt");
                    BufferedReader br = new BufferedReader(new FileReader(f));
                    String str;
                    while ((str = br.readLine()) != null) {
                        System.out.println(str);
                    }
                    br.close();

                } catch (Exception i) {
                    println("Could not get your Password!! Sorry");
                }
            }
            case "3" -> {
                println("Selected: 3) Delete your Password");
                println("\nEnter the Security Key to delete your password");
                Scanner del = new Scanner(System.in);
                String newDel = del.nextLine();
                try {
                    File delFile = new File(cDir + newDel + ".txt");
                    delFile.delete();
                    println("\nYour Password is Successfully Deleted!");
                } catch (Exception e) {
                    println("Could not Delete your Password! Sorry");
                }
            }
        }
    }

    public static void println(String str) {
        System.out.println(str);
    }

    public static void encode(String[] fakeValues, String Directory) throws IOException {
        File file = new File(Directory + fakeValues[3] + ".txt");
        Writer writer;
        try {
            writer = new FileWriter(file);
            writer.write("Name: " + fakeValues[0] + 
                         "\nMessage: " + fakeValues[1] + 
                         "\nPassword: " + fakeValues[2] +
                         "\nSecurity Key: " + fakeValues[3]);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            println("An Error Occurred while storing your Password! Sorry");
        }
    }

    public static void decode(String[] originalValues, String fakeKey) {

        String directory = originalValues[4];

        // Writing Original values
        File file = new File(directory + fakeKey + ".txt");
        try {
            Writer writer = new FileWriter(file);
            writer.write("Name: " + originalValues[0] + "\nMessage: " + originalValues[1] + "\nPassword: " + originalValues[2] + "\nSecurity Key: " + originalValues[3]);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            println("An Unexpected Error Occurred! Sorry");
        }
    }
}
