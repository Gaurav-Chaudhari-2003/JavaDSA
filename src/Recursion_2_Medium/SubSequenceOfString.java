package Recursion_2_Medium;
public class SubSequenceOfString {

    static void subSequenceOfString(String string, int index, String newString){
        if (index == string.length()){
            System.out.println(newString);
            return;
        }

        subSequenceOfString(string, index+1, newString+string.charAt(index));
        subSequenceOfString(string, index+1, newString);
    }

    public static void main(String[] args) {
        subSequenceOfString("abc", 0, "");
    }
}
