package practise;

public class Practise {
    public static void main(String[] args) {
        AnonymousInterface obj=new AnonymousClass();
        obj.method();
//        this was before anonymous class came into picture, when we need to use method
//        from Ainterface we create a separate class and then use the method from creating
//        object from that class.
//

        AnonymousInterface obj2=new AnonymousInterface() {
            public void method() {
                System.out.println("Anonymous method");
            }
        };
        obj2.method();
        //this is anonymous class in working. it is exactly doing the same thing from code 5-6
        //so we didnot create another class and then call method from that object .


       //more optimised , use lambda
        // Lambda — clean (only works if AnonymousInterface is functional interface)
       AnonymousInterface obj3= () -> System.out.println("Anonymous method");
       obj3.method();
    }
}
