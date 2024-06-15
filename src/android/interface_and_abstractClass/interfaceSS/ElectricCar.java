package android.interface_and_abstractClass.interfaceSS;

public class ElectricCar implements CarInterface{

    public ElectricCar(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("from where the start() is called: " + this);
        System.out.println("Electricity flow started...");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " electric car is moving at " + speed + " km/h");

    }

}
