package strings;

public class StringPractise {
    public static void main(String[] args) {

       String a = "Ravi";

        String b = "Ra" + "vi";

        String c = "Ra";

        String d = c + "vi";//false , it checks at runtime so creates 3 objects , c , vi , d
        //if it was String d="Ra" + "vi" ->true becuse compile time check

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
    }
}
