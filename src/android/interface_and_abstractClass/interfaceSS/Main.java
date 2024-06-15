package android.interface_and_abstractClass.interfaceSS;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(20);

        // the list in java is also an interface
//        List<String> names = new ArrayList<>();

        System.out.println();
        CarInterface fossilCarInterface = new FossilFuelCar("Mercedes");
        fossilCarInterface.start();
        fossilCarInterface.move(50);

    }
}
