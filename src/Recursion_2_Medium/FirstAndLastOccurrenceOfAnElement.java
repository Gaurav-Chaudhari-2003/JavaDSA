package Recursion_2_Medium;

public class FirstAndLastOccurrenceOfAnElement {

    static int first = -1;
    static int last = -1;
    public static void firstAndLastOccurrenceOfAnElement(String string, int index, char character){
        if (string.charAt(index) == character){
            if (first == -1){
                first = index;
            }
            last = index;
        }
        if (index == string.length()-1){
            return;
        }else {
            firstAndLastOccurrenceOfAnElement(string, index+1, character);
        }
    }

    public static void main(String[] args) {
        String s = "ssfsacaffkdjavnlja";
        //          0123456789012345678
        firstAndLastOccurrenceOfAnElement(s,0, 'a');
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
