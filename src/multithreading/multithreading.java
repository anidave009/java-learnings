package multithreading;

public class multithreading {
    static int availableSeats=1;
    public static void main(String[] args) throws InterruptedException {
        // User A trying to book
        Thread userA = new Thread(() -> {
            System.out.println("User A checking seats...");
            if (availableSeats > 0) {
                // Simulate some processing time (network delay etc)
                try { Thread.sleep(100); } catch (Exception e) {}
                availableSeats--;
                System.out.println("User A booked! Seats left: " + availableSeats);
            } else {
                System.out.println("User A: No seats available");
            }
        });

        // User B trying to book
        Thread userB = new Thread(() -> {
            System.out.println("User B checking seats...");
            if (availableSeats > 0) {
                // Simulate some processing time
                try { Thread.sleep(100); } catch (Exception e) {}
                availableSeats--;
                System.out.println("User B booked! Seats left: " + availableSeats);
            } else {
                System.out.println("User B: No seats available");
            }
        });

        userA.start();
        userB.start();

        userA.join();
        userB.join();
    }
}


//Thread t1=new Thread(()->{
//    for(int i=0;i<1000;i++){
//        counter++;
//    }
//});
//
//Thread t2=new Thread(()->{
//    for(int i=0;i<200000;i++){
//        counter++;
//    }
//});
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Final counter: " + counter);