//import java.util.Scanner;
//
//public class BitManipulation {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num, pos, operation;
//        System.out.print("Enter the number: ");
//        num = sc.nextInt();
//        System.out.print("Enter the position: ");
//        pos = sc.nextInt();
//        System.out.print("Enter operation (clear = 0, set = 1) : ");
//        operation = sc.nextInt();
//        int bitMask = 1<<pos;
//
//        //check bit
//        System.out.print("Operation: ");
//        checkBit(bitMask, num);
//        System.out.println(" -> " + operation);
//
//        if(operation == 1){
//            // set operation
//            System.out.println("New number: " + (num | bitMask));
//        } else {
//            // clear operation
//            System.out.println("New number: " + (~(bitMask) & num));
//        }
//
//    }
//
//    private static void checkBit(int bitMask, int num) {
//        if ((bitMask&num) != 0) {
//            System.out.print("1");
//        }  else {
//            System.out.print("0");
//        }
//    }
//}

import java.util.Scanner;
public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if ((num & (num-1)) == 0){
            System.out.println("The number is power of 2.");
        } else {
            System.out.println("The number is not power of 2.");
        }
    }
}
