import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Welcome to Astrologer's Stars -- By Jay
                                
                Enter the numbers of rows:
                """);
        Scanner select = new Scanner(System.in);
        int num = 0;
        String num_of_rows = null;
        try {
            num_of_rows = select.next();
            num = Integer.parseInt(num_of_rows);
            System.out.println("Number of rows: " + num_of_rows);
        } catch (NumberFormatException ne) {
            num = num_of_rows.length();
            System.out.println("Number of rows: " + num);
        }
        System.out.println("Enter True or False");
        Scanner bool = new Scanner(System.in);
        String str = bool.next();
        boolean valid = Boolean.parseBoolean(str);
        System.out.println("True or False: " + valid + "\n");
        if (valid) {
            for (int i = 0; i <= num; i++) {
                String string = "*";
                System.out.println(string.repeat(num - (num - i)));
            }
        } else {
            for (int i = 0; i <= num; i++) {
                String string = "*";
                System.out.println(string.repeat(num - i));
            }
        }
    }
}
