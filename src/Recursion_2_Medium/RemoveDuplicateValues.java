package Recursion_2_Medium;

import java.util.Arrays;

public class RemoveDuplicateValues {

    static boolean[] map = new boolean[26];

    static void removeDuplicateValues(String string, int index, String newString) {
        if (index == string.length()-1){
            System.out.println(newString);
            return;
        }
        if (!map[string.charAt(index) - 'a']){
            newString+=string.charAt(index);
            map[string.charAt(index) - 'a'] = true;
            removeDuplicateValues(string, ++index, newString);
        }else {
            removeDuplicateValues(string, ++index, newString);
        }
    }


    public static void main(String[] args) {
        removeDuplicateValues("aabbccddabcd", 0, "");

    }
}
