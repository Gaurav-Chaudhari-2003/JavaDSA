package android.concurrency0Threads0_singletonPattern.singletonPattern;

public class Database {
    private String name;
    private static Database instance;

    public static synchronized Database getInstance(String name){
        /*
            xThe synchronized keyword in Java is a way to ensure that only one thread can access a shared resource at a time.
        This is important because when multiple threads access and modify a shared resource simultaneously, it can lead
        to inconsistent data and unexpected results, a situation commonly known as a race condition.
        */
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
        return "Database class\nName: " + this.name;
    }
}
