package multithreading;

public class multithreading {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("T1 → " + i);
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("T2 → " + i);
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        });

        t1.start();
        t2.start();
    }
}

//program 1
//randomised order , coz it depends on core which is picking it up.
//for (int i = 1; i <= 5; i++) {
//int threadNumber = i;
//Thread t = new Thread(() -> {
//    System.out.println("Thread " + threadNumber + " running");
//});
//    t.start();
//}

//program 2 : all threads execute at same time .
// for (int i = 1; i <= 5; i++) {
//int threadNumber = i;
//Thread t = new Thread(() -> {
//    try {
//        Thread.sleep(1000);
//        System.out.println("Thread " + threadNumber + " done after sleeping");
//    } catch (Exception e) {}
//});
//            t.start();
//        }


//program 3
//Thread t1=new Thread(()->{
//    try {
//        Thread.sleep(3000);
//        System.out.println("thread1");
//    } catch (InterruptedException e) {}
//});
//
//Thread t2=new Thread(()->{
//    try {
//        Thread.sleep(1000);
//        System.out.println("thread2");
//    } catch (InterruptedException e) {}
//});
//
//        t1.start();
//        t2.start();
//        t1.join();//main is waiting for t1 to awake.
//        t2.join();//main is waiting for t2 to awake.
//
//        System.out.println("All Threads Done, main continues");
//