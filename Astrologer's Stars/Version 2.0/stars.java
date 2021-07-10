import java.util.Scanner;
public class stars {
    public static void main(String[] args) {
        print("Welcome to Astrologer's Stars v2.0 -- By Jay\n");
        print("Enter the symbol to be printed");
        Scanner scan = new Scanner(System.in);
        String symbol = scan.next();
        print("Your Symbol: " + symbol);
        print("\nEnter number of rows");
        Scanner select = new Scanner(System.in);
        int num = 0;
        String num_of_rows = null;
        try {
            num_of_rows = select.nextLine();
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
                System.out.println(symbol.repeat(num - (num - i)));
            }
        } else {
            for (int i = 0; i <= num; i++) {
                System.out.println(symbol.repeat(num - i));
            }
        }
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
