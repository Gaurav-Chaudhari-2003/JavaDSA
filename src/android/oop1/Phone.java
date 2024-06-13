package android.oop1;

public class Phone {
    private String name;
    private int screenSize, memoryRam, camera;

    public Phone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

    public Phone(String name, int screenSize) {
        this.name = name;
        this.screenSize = screenSize;
    }

    protected void playMusic(String trackName) {
        System.out.println("Playing " + trackName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
    // getters and setters are used to encapsulation


    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }
}