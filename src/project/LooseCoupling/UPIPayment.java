package project.LooseCoupling;

public class UPIPayment implements Payment {

  public void pay(int amount) {
        System.out.println("Paid using UPI: " + amount);
    }

}