package fourpillars;

public class FourPillarsMain {
    public static void main(String[] args) {
        Inheritance obj=new InheritanceChild("Shri Krishna");
        obj.run();
        obj.walk();
        //even though object is of type Child i can only call methods which
        //are in parent or common to both parent and child.
//        Output:Parent Constructor Called
//        Child Constructor
//        Shri Krishna InheritanceChild.run
//        Shri Krishna is walking

        Inheritance obj2=new Inheritance("Shri Ram");
        //here reference and object both are of type parent.
//        Parent Constructor Called
//        Shri Ram is running
//        Shri Ram is walking
        obj2.run();
        obj2.walk();
    }
}
