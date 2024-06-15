package android.interface_and_abstractClass.interfaceSS;

public interface CarInterface {

    //Abstract Methods
    void start();
    void move(int speed);


    // there cant be private or static abstract methods in interface
    //but you can create private or static methods but you need to code body of the method
    private void newPrintName(String name){
        System.out.println();
    }
    static void new2PrintName(String name){
        System.out.println();
    }
}
