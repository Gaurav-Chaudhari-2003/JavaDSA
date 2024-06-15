package android.interface_and_abstractClass.abstractClass;

public abstract class TestAbstractClass {
    public abstract void printName(String name);
    public void print(String text){
        System.out.println(text);
    }

    private String name;

    public TestAbstractClass(String name) {
        this.name = name;
    }
}
