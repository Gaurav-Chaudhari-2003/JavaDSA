package android.oop3;

public class Engine {
    private String model;
    private int rmp;

    public Engine(String model, int rmp) {
        this.model = model;
        this.rmp = rmp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRmp() {
        return rmp;
    }

    public void setRmp(int rmp) {
        this.rmp = rmp;
    }
}
