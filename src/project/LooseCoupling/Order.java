package project.LooseCoupling;

 public class Order {
    Payment payment;

   public Order(Payment payment){
        this.payment=payment;
    }

    public void placeOrder(int amount){
       payment.pay(amount);
    }
}