package android.concurrency0Threads0_singletonPattern.singletonPattern;

public class Database {
    private String name;
    private static Database instance;

    public static synchronized Database getInstance(String name){
        if (null == instance){
            instance = new Database(name);
        }
        return instance;
    }

    private Database(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String text = "Database class\nName: " + this.name;
        return text;
    }
}