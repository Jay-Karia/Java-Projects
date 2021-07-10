import java.util.Scanner;
public class about {
    public static void main(String[] args) {
        print("Hello, and Welcome to my program where you will get enough knowledge of myself(Jay)");
        print("\nEnter what do you want to know about me");
        print("""
                1) Full Name
                2) Birth Year
                3) Birth Date
                4) Family
                5) Age
                6) Favorite Color
                7) Favorite Outdoor Game
                8) Languages Jay Knows
                9) Most Loved Language
                10) Programming Career Started
                11) First Learned Language
                12) Recent Learned Language
                13) Year When Jay Learned Languages\n""");
        Scanner sc = new Scanner(System.in);
        String select = sc.next();
        if (select.equals("1")) {
            String full_name = "Jay Sanjay Karia";
            print("1) Full Name: " + full_name);
        } else if (select.equals("2")) {
            String birth_year = "2007";
            print("2) Birth Year: " + birth_year);
        } else if (select.equals("3")) {
            String birth_date = "02-07-2007";
            print("3) Birth Date" + birth_date);
        } else if (select.equals("4")) {
            String family = "Jay, Sanjay, Moksha, Mannan, and Manasi";
            print("4) Family" + family);
        } else if (select.equals("5")) {
            int age = 14;
            print("5) Age" + age);
        } else if (select.equals("6")) {
            String fav_color = "Black";
            print("6) Favorite Color: " + fav_color);
        } else if (select.equals("7")) {
            String fav_game = "Cricket";
            print("7) Favorite Outdoor Game: " + fav_game);
        } else if (select.equals("8")) {
            String lang = "HTML, CSS, Java, JavaScript, and Python";
            print("8) Languages Jay Knows: " + lang);
        } else if (select.equals("9")) {
            String loved_lang = "Java";
            print("9) Most Loved Language: " + loved_lang);
        } else if (select.equals("10")) {
            String career = "2018";
            print("10) Programming Career Started: " + career);
        } else if (select.equals("11")) {
            String first = "HTML";
            print("11) First Learned Language: " + first);
        } else if (select.equals("12")) {
            String recent = "Python";
            print("12) Recent Learned Language: " + recent);
        } else if (select.equals("13")) {
            String learned = """
                    HTML        -- 2018
                    CSS         -- 2018
                    Java        -- 2021
                    JavaScript  -- 2021
                    Python      -- 2021
                    """;
            print("13) Year When Jay Learned Language:\n " + learned);
        }

    }

    public static void print(String str) {
        System.out.println(str);
    }
}
