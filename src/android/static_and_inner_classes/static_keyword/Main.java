package android.static_and_inner_classes.static_keyword;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass(10, "white");
        testClass.setName("Gaurav");
        System.out.println(testClass.getName());
//        TestClass.name = "Jay";


        TestClass testClass2 = new TestClass(10, "white");
        testClass2.setName("Jay");
        System.out.println(testClass2.getName());
        System.out.println(testClass.getName());
        System.out.println(TestClass.getName());
    }
}
