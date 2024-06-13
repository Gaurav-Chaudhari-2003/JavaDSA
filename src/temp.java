import java.util.Arrays;

public class temp {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 5, 6, 3};
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i<arr.length; i++){
            int smallest = arr[i], j;
            for (j = i-1; j>=0; j--){
                if (arr[j]>smallest){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = smallest;
        }

        System.out.println(Arrays.toString(arr));
    }

    //O(n-1 * n-1(1|2|...|n)  ==> O(n^2)
}




/*
        for (int k = 0; k<4; k++){
            for (int i = 1; i<arr.length; i++){
                int smallest = i-1, j;
                for (j = i-1; j>=0; j--){
                    if (arr[j]<arr[smallest]){
                        arr[j+1] = arr[j];
                    }else{
                        break;
                    }
                }
                int temp = arr[smallest];
                arr[smallest] = arr[j+1];
                arr[j+1] = temp;
            }
        }
*/