package constructors;

public class ConstructorDemo {
    String name;
    int age;

    public ConstructorDemo(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println(name);
        System.out.println(age);
    }
}
