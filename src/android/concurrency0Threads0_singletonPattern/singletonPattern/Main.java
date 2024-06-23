package android.concurrency0Threads0_singletonPattern.singletonPattern;

public class Main {
    public static void main(String[] args) {
        Database database1 = Database.getInstance("Gaurav");
        Database database2 = Database.getInstance("Jay");
//        Database testDataBase = new Database("Jay");          // because we declared the constructor as private access modifier
        System.out.println(database1.toString());
        System.out.println(database2.toString());           // this will also print the database1 name as "Gaurav"
    }
}
