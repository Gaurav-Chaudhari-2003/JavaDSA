package android.oop2;

public class Main {
    public static void main(String[] args) {
        Bird crow = new Bird("crow", "Black", 2, true, 2);
        System.out.println(crow.getName());
        crow.eat("Banana");
        System.out.println("Wings = " + crow.getWings());
        crow.fly();
        crow.fly(50);
    }
}
