package Recursion_2_Medium;

public class ReverseString {

    public static void reverseString(String string, int index){
        if (index == 0){
            System.out.print(string.charAt(index));
            return;
        }
        System.out.print(string.charAt(index));
        reverseString(string, index-1);
    }

    public static void main(String[] args) {
        reverseString("Gaurav", 5);
    }
}
