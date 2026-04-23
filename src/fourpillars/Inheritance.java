package fourpillars;

public class Inheritance {
    protected String username;

    public Inheritance(String username){
        this.username = username;
        System.out.println("Parent Constructor Called");
    }

    void walk(){System.out.println(username + " is walking");}
    void run(){
        System.out.println(username + " is running");
    }

}

