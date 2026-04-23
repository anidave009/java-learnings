package fourpillars;

public class InheritanceChild extends Inheritance{

    InheritanceChild(String username){
        super(username);
        System.out.println("Child Constructor");
    }

    @Override
    protected void run() {
        System.out.println(super.username + " InheritanceChild.run");
    }

    public void dance(){
        System.out.println(super.username + " InheritanceChild.dance");
    }
}
