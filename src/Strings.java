import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder string = new StringBuilder(sc.nextLine());

        for (int i = 0; i < string.length()/2; i++){
            char temp = string.charAt(i);
            string.setCharAt(i, string.charAt(string.length() - i -1));
            string.setCharAt(string.length() - i-1, temp);
        }

        System.out.println(string);

    }
}
