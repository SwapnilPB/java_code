package javaprac;

public class App {

    private int count = 0;

    public synchronized void increament() {
        count++;
    }

    public static void main(String[] args) {
        com.swap.App1 app = new com.swap.App1();
        //app.doWork();
        app.main();
    }

    private void doWork() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increament();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increament();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("count : " + count);
    }
}
