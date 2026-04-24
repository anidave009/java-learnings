package project.LooseCoupling;

public class CreditCardPayment implements Payment {

 public void pay(int amount){
       System.out.println("Payment using CreditCard , amount " + "amount ");
   }

   public void dontPay(int amount){
       System.out.println("Testing Function");
   }

}
