package practiseExcHg;

import exceptions.Arithmetic;

public class UsefulClass {
    private int amount;

    public UsefulClass(int amount) {
        this.amount = amount;
    }

    public void jamaKaro(int amount){
        this.amount += amount;
    }

    public void paisaKato(int amount) throws ArithmeticException{
        if(amount < this.amount){
        this.amount -= amount;
        }
        else throw new ArithmeticException();
    }

    public int interestKato(){
        if(this.amount <= 0){
            throw new ArithmeticException();
        }
        return amount/0;
    }

    public void amountDikhao(){
        System.out.println("Current Amount: " + this.amount);
    }
}
