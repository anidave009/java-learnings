package fourpillars;

public class FourPillarsMain {
    public static void main(String[] args) {
        Encapsulation user1=new Encapsulation("Aniket",20000);
        //now because of encapsultaion one cannot do something like
        // user1.balance=90000;bcs the field is private //achieved through access modifier
        //one has to go through provided getters/setters/methods

        user1.withdraw(5000);
        user1.deposit(5000);
        //one has to use defined methods/ways  to change the state of data/

        //using public , protected , default(private-package) as accesstype we can change the state.only private allows us to not change.
        user1.username="Aniket";
        //bcs username is public accessType.
    }
}
