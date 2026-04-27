package multithreading;

public class multithreading {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("During execution: " + Thread.currentThread().getState());
            } catch (Exception e) {}
        });

//        System.out.println("Before start: " + t.getState());
//        t.start();
//        Thread.sleep(500); // main sleeps a bit, letting t go into sleep
//        System.out.println("While sleeping: " + t.getState()); // TIMED_WAITING


        Thread t1=new Thread(()->{
            System.out.println("t1 is running");
        });
        t1.start();
        t1.join();
        System.out.println("T1 state : " + t1.getState());//terminated

    }
}