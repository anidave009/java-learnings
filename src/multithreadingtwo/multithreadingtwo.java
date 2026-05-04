package multithreadingtwo;

public class multithreadingtwo {
    public static void simulateHeavyTask(){
        Thread t1=new Thread(){
            public void run(){
                try {
                    Thread.sleep(4000);
                    System.out.println("Done Simulating");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        t1.start();
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting Execution , simulating heavy task with synchronous work");
        simulateHeavyTask();
        Thread t2=new Thread(){
            public void run(){
                System.out.println("Done Simulating, doesn't wait for other thread");
            }
        };
        t2.start();
    }
}
