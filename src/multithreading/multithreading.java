package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class multithreading {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for(int i=1;i<=10;i++){
            int taskNumber=i;
            pool.submit(()->{
                System.out.println("Task " + taskNumber + " running on " + Thread.currentThread().getName());
            });
        }
        pool.shutdown();
    }
}

//thread pool of 3 threads , we submit 10 tasks which are picked by 3 thread.
//in random order from queue.
//pool shutdown by completing all tasks. It doesnot return anyvalue till now .
//for that future, completable is used.

