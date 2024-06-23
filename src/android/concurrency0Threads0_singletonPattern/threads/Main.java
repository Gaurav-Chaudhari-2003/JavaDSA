package android.concurrency0Threads0_singletonPattern.threads;
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<=5; i++){
                    try {
                        Thread.sleep(2000);
                        System.out.println("Printing " + i + " no. worker thread.");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();
        for (int i = 0; i<=5; i++){
            try {
                Thread.sleep(2000);
                System.out.println("Printing " + i +  " no. main thread.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
