package android.static_and_inner_classes.static_keyword;

public class TestClass {
    // common for all TestClass objects
    private static String name;
    int age;
    String skinColor;

    public TestClass(int age, String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }

    public static String getName() {
        return name;
    }

    public void test(){}

    public static void setName(String name) {
        // common for all TestClass objects
        TestClass.name = name;
//        test();
//        non-static method test() cannot be referenced from a static context
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
