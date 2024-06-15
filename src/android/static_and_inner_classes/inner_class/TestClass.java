package android.static_and_inner_classes.inner_class;

public class TestClass {
    private int age;
    private String color;

    private class TestInnerClass{
        private String name;

        public TestInnerClass(String name) {
            this.name = name;
        }

        private void printAge(){
            System.out.println("Age: " + age);
            // private variables of the outer class can also be accessed by the inner class methods.
            // but the outer class should not be private class and can't be static
        }
    }


}
