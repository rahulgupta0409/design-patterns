package singleton_design_pattern;


public class SingletonMultithreadingTest {

    public static void main(String[] args) {

        Runnable task = () -> Singleton.getInstance().displayMethod();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);
        Thread t5 = new Thread(task);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // wait for all thread to complete
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }
}


/*
    OUTPUT:
    Singleton design pattern...
    Singleton design pattern...
    Singleton design pattern...
    Singleton design pattern...
    Singleton design pattern...
    Thread Name: Thread-3
    Thread Name: Thread-1
    Thread Name: Thread-4
    Thread Name: Thread-0
    Thread Name: Thread-2
    Time: 2025-05-19T00:25:32.394944500
    Time: 2025-05-19T00:25:32.394944500
    Time: 2025-05-19T00:25:32.394944500
    Time: 2025-05-19T00:25:32.394944500
    Time: 2025-05-19T00:25:32.394944500
 */
