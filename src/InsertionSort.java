import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //          {0, 1, 2, 3, 4, 5}
        int[] arr = {4, 7, 2, 5, 6, 3};
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i<arr.length; i++){
            int currentNum = arr[i];
            int j;
            for (j = i-1; j>=0; j--){
                if (currentNum < arr[j]){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = currentNum;
        }
        System.out.println(Arrays.toString(arr));
    }
}
