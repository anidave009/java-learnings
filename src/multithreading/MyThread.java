package multithreading;

public class MyThread extends Thread {
    private String task;

    public MyThread(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println("task1");
    }
}
