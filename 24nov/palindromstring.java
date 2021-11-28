 import java.util.Scanner;

public class palindromstring {

    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String check = "";

        for (int x = s.length() - 1; x >= 0; x--) {

            check += s.charAt(x);

        }

        if (check == s)

            System.out.println(" palindrome string");

        else
        
            System.out.println(" Not palindrome string ");

            sc.close();
            
    }

}
