package Recursion_2_Medium;

import java.util.HashSet;

public class SubSequenceOfUniqueString {
    static void subSequenceOfUniqueString(String string, int index, String newString, HashSet<String> set){
        if (index == string.length()){
            if (!set.contains(newString)){
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }

        subSequenceOfUniqueString(string, index+1, newString+string.charAt(index), set);
        subSequenceOfUniqueString(string, index+1, newString, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        subSequenceOfUniqueString("Gau", 0, "", set);
    }
}
