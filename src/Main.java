import fourpillars.Encapsulation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation("Krishna",30000);
    }
}

// the intention behind this design is that the reference variable type remains
//unchanged. Only the actual object is changed. This is also an implementation
//of runtime polymorphism.