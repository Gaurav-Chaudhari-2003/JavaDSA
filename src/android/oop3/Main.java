package android.oop3;

public class Main {
    public static void main(String[] args) {
//        Engine engine = new Engine("Renault", 8000);
        Car mercedes = new Car("Mercedes Avatar", "Black", 2, new Engine("Renault", 8000));
        System.out.println(mercedes.getName());
        // press ctrl+q on after hovered on getEngine() method.
        System.out.println("Engine model: " + mercedes.getEngine().getModel());
        System.out.println("Engine model: " + mercedes.getEngine().getRmp());

//        Car tata = null;
//        if (tata!=null){
//            tata.getName();
//        }else {
//            System.out.println("The car is null");
//        }

//        final int a = 5;
//        a = a+1;  //cant be changed

        final Engine engine = new Engine("Renault", 8000);
//        engine = new Engine("Renault", 3000);
        engine.setRmp(10000);

    }
}
