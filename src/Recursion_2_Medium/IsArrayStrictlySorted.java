package Recursion_2_Medium;

public class IsArrayStrictlySorted {
    static void isArrayStrictlySorted(int[] arr, int index){
        if(index == arr.length-1){
            System.out.println("The array is strictly sorted.");
            return;
        }
        if (arr[index] < arr[index+1]){
            index++;
            isArrayStrictlySorted(arr, index);
        } else{
            System.out.println("The array is not strictly sorted!");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7};
        isArrayStrictlySorted(arr, 0);
    }
}
