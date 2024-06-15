package android.interface_and_abstractClass.interfaceSS;

public class FossilFuelCar implements CarInterface, TestInterface{
    private String name;

    public FossilFuelCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("from where the start() is called: " + this);
        System.out.println("Fuel Engine car is started.");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " fuel car is moving at " + speed + " km/h");

    }

    @Override
    public void testInterface(String name) {
        // can be implemented more than one interfaces in a single class
    }
}
