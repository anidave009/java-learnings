package multithreading;

import java.util.concurrent.*;

public class multithreading {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService pool = Executors.newFixedThreadPool(2);
    for(int i=0;i<4;i++){
        int task = i;
        pool.submit(() -> {
            System.out.println("Task " + task + " → " + Thread.currentThread().getName());
        });
    }
    Runnable runnable=()->{
        System.out.println("Jai Shree Ram");
    };
    pool.submit(runnable);
    pool.shutdown();
    }
}

//ExecutorService pool=Executors.newFixedThreadPool(5);
//Callable<Integer> task=()->{
//    Thread.sleep(1000);
//    return 40;
//};
//
//Future<Integer> future=pool.submit(task);
//Integer result =future.get();
//        System.out.println("result:"+result);
//        pool.shutdown();