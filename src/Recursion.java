//x^n, stack top = n
//public class Recursion {
//    public static int printNumber(int num, int power, int counter){
//        System.out.println(++counter);
//        if (power == 1){
//            return num;
//        }
//        return num * printNumber(num, power-1, counter);
//    }
//    public static void main(String[] args) {
//        System.out.println(printNumber(5, 3, 0));
//    }
//}


//x^n, stack top = log(n)
public class Recursion {

    public static int printNumber(int num, int power, int counter){
        System.out.println(++counter);
        if (num == 0){
            return 0;
        }
        if (power == 0){
            return 1;
        }
        if (power%2 == 0){
            return printNumber(num, power/2, counter) * printNumber(num, power/2, counter);
        } else {
            return num * printNumber(num, power/2, counter) * printNumber(num, power/2, counter);
        }
    }
    public static void main(String[] args) {
//        System.out.println("Enter the number");
        System.out.println(printNumber(2, 23, 0));
    }
}
