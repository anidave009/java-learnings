package multithreading;

public class multithreading {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("task1");
        myThread.start();
        //it creates an internal thread.
        //run method is a normal method call.

        MyThreadOne myThreadOne = new MyThreadOne();
        //you are passing a runnable object here.
        Thread t1 = new Thread(myThreadOne);
        t1.start();
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