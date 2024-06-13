package android.oop1;

public class Main {
    public static void main(String[] args) {
        Phone iphone = new Phone("iphone 15", 11, 2, 45);
        System.out.println(iphone.getName());
        iphone.playMusic("Baby");
        iphone.playMusic("Ain't no sunshine");
        // private methods can be accessed by their own class.


        // for polymorphism
        Phone pixel = new Phone("Pixel", 10);
        System.out.println(pixel.getName());
        System.out.println(pixel.getScreenSize());
    }
}
