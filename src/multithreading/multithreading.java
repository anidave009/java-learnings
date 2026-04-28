package multithreading;

import java.util.concurrent.*;

public class multithreading {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
     ExecutorService pool=Executors.newFixedThreadPool(3);
     for(int i=0;i<10;i++){
         int task=i;
         Runnable r=()->{
           try {
               Thread.sleep(2000);
               System.out.println("Request"+ task+"Handled By "+Thread.currentThread().getName());
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
         };

         pool.submit(r);
     }
     pool.shutdown();
    }
}


//Task 1: Task 1 — Basic pool
//Create a thread pool of 3 threads. Submit 9 tasks. Each task prints its task number and which thread is running it. Observe which thread handles which task.

//code :
//ExecutorService executorService = Executors.newFixedThreadPool(3);
//        for(int i=1;i<=9;i++){
//        int task=i;
//        executorService.submit(()->{
//        System.out.println("task : " +task + " handled by "+Thread.currentThread().getName() );
//        });
//        }
//        executorService.shutdown();

//Output: task : 2 handled by pool-1-thread-2
//task : 1 handled by pool-1-thread-1
//task : 3 handled by pool-1-thread-3
//task : 4 handled by pool-1-thread-3
//task : 6 handled by pool-1-thread-2
//task : 7 handled by pool-1-thread-3
//task : 5 handled by pool-1-thread-1
//task : 9 handled by pool-1-thread-3
//task : 8 handled by pool-1-thread-2


//Task 2 — Get results back
//Create a pool of 2 threads. Submit 5 Callable tasks, each returning its task number multiplied by 10. Collect all results using Future and print the sum.
//public class multithreading {
//    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        ExecutorService pool = Executors.newFixedThreadPool(2);
//        Integer totalSum=0;
//        for(int i=1;i<=5;i++){
//            int task=i;
//            Callable<Integer> obj=()-> task*10;
//            Future<Integer> result=pool.submit(obj);
//            totalSum+=result.get();
//        }
//        System.out.println("Total Sum: "+totalSum);
//        pool.shutdown();
//    }
//}

//Output :  Total Sum: 150


//Task 3 — Simulate real world
//Simulate a web server. Create a pool of 3 threads. Submit 10 requests. Each request sleeps for a random time (simulate processing) then prints "Request X handled by thread Y". Observe the order.

//Code : in main function

//output: 3 requests were handled , others waited for 2 seconds and then again 3 . Period
//Request0Handled By pool-1-thread-1
//Request1Handled By pool-1-thread-2
//Request2Handled By pool-1-thread-3
//Request4Handled By pool-1-thread-2
//Request3Handled By pool-1-thread-1
//Request5Handled By pool-1-thread-3
//Request7Handled By pool-1-thread-3
//Request8Handled By pool-1-thread-2
//Request6Handled By pool-1-thread-1
//Request9Handled By pool-1-thread-3

//when i used 'i' of loop in lambda it said to make it final .
//learning: Lambda cannot use a variable that keeps changing. Copy i into a new variable that never changes. Lambda captures that safe copy instead.
