package Recursion_2_Medium;

public class MoveAllCharacterXToLastOfTheString {

//    static StringBuilder newString = new StringBuilder();
    static int count = 0;
    static void moveAllCharacterXToLastOfTheString(String string, int index, char character, StringBuilder newString){
        if (index == string.length()){
            while(count!=0){
                newString.append(character);
                count--;
            }
            System.out.println(newString);
            return;
        }
        if (string.charAt(index) == character){
            count++;
        } else {
            newString.append(string.charAt(index));
        }
        moveAllCharacterXToLastOfTheString(string, index+1, character, newString);
    }
    public static void main(String[] args) {
        moveAllCharacterXToLastOfTheString("kjafhjnakjafbajldha", 0, 'a', new StringBuilder());

    }
}
