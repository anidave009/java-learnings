package multithreading;

public class multithreading {
    static int availableSeats=1;
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        // User A trying to book


        Thread userA = new Thread(() -> {
            synchronized (lock){
            System.out.println("User A checking seats...");
            if (availableSeats > 0) {
                // Simulate some processing time (network delay etc)
                try { Thread.sleep(100); } catch (Exception e) {}
                availableSeats--;
                System.out.println("User A booked! Seats left: " + availableSeats);
            } else {
                System.out.println("User A: No seats available");
            }
        }});

        // User B trying to book
        Thread userB = new Thread(() -> {
            synchronized (lock){
            System.out.println("User B checking seats...");
            if (availableSeats > 0) {
                // Simulate some processing time
                try { Thread.sleep(100); } catch (Exception e) {}
                availableSeats--;
                System.out.println("User B booked! Seats left: " + availableSeats);
            } else {
                System.out.println("User B: No seats available");
            }
        }});

        userA.start();
        userB.start();

        userA.join();
        userB.join();
    }
}

//ways to avoid race condition
// 1. synchronised.
//2 AtomicInteger
//Only useful for simple number operations like counter++.
//Not useful for ticket booking scenario because we need to check AND book together.

//3. Rentrant lock Why finally? If an error happens inside, lock still gets released. Without finally, lock stays grabbed forever and other threads wait forever.
