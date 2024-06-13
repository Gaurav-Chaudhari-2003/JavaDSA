import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 5, 6, 3};
        //          {0, 1, 2, 3, 4, 5}
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i<arr.length; i++){
            int smallestIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[smallestIndex]){
                    smallestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
