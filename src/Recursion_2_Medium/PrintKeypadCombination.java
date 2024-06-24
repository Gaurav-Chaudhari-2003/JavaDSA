package Recursion_2_Medium;

public class PrintKeypadCombination {

    static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    static void printKeypadCombination(String string, int index, String combination){
        if (index == string.length()){
            System.out.println(combination);
            return;
        }

        char currentChar = string.charAt(index);
        String mapping = keypad[currentChar-'0'];
        for (int i = 0; i<=mapping.length()-1; i++){
            printKeypadCombination(string, index+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        printKeypadCombination("67", 0, "");
    }
}
