package fourpillars;

public class Encapsulation {
    String username;
    private int balance;

    public Encapsulation(String username,int balance) {
        this.username = username;
        this.balance = balance;
        System.out.println("Current Balance: " + this.balance);
    }

     int deposit(int amount) {//this can be accessed because it is package-private.
        this.balance += amount;
        System.out.println("Deposited "+amount+" balance "+this.balance);
        return balance;
    }
    public int withdraw(int amount) {
        this.balance -= amount;
        System.out.println("Withdraw "+amount+" balance "+this.balance);
        return balance;
    }
}
