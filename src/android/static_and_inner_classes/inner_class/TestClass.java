package android.static_and_inner_classes.inner_class;

public class TestClass {
    private int age;
    private String color;

    public TestClass(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public class TestInnerClass{
        private String name;

        public TestInnerClass(String name) {
            this.name = name;
        }

        public void printAge(){
            System.out.println("Age: " + age);
            // private variables of the outer class can also be accessed by the inner class methods.
            // but the outer class should not be private class and can't be static
        }
    }


}
