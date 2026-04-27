package multithreading;

public class multithreading {
    public static void main(String[] args) {

        // 1. Using Thread class
        MyThread myThread = new MyThread("task1");
        myThread.start();

        // 2. Using Runnable (separate task)
        Thread t1 = new Thread(new MyThreadOne());
        t1.start();

        // 3. Anonymous Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous runnable running");
            }
        };
        new Thread(r1).start();
    }

}
//    Thread t4=new Thread(){
//        @Override
//        public void run() {
//            System.out.println("thread t4 is being executed");
//        }
//    };
//    t4.start();
//}