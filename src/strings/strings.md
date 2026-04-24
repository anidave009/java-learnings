Q1. What is the difference between == and .equals() for Strings?

Q2. What is String pool and where does it live?

Q3. What is the output?

javaString a = "Ravi";

String b = "Ravi";

String c = new String("Ravi");

System.out.println(a == b);

System.out.println(a == c);

System.out.println(a.equals(c));

Q4. Is String mutable or immutable? What happens when you do this —

javaString s = "Hello";

s.concat(" World");

System.out.println(s);

Medium

Q5. What is the output and why?

javaString a = "Ravi";

a = a + " Kumar";

System.out.println(a);

How many String objects are created here?

Q6. What is the difference between String, StringBuilder, and StringBuffer?

Q7. What is the output?

javaString s = "Hello World";

System.out.println(s.substring(6));

System.out.println(s.replace("World", "Java"));

System.out.println(s);

Q8. What is the output and why?

javaString a = new String("Ravi");

String b = new String("Ravi");

System.out.println(a == b);

System.out.println(a.equals(b));

Q9. Can we use String in switch statement?

Hard

Q10. What is the output and why?

javaString a = "Ravi";

String b = "Ra" + "vi";

String c = "Ra";

String d = c + "vi";


System.out.println(a == b);

System.out.println(a == d);

Q11. What is intern() method in String?

Q12. What is the output?

javaStringBuilder sb = new StringBuilder("Hello");

sb.append(" World");

sb.append(" Java");

System.out.println(sb);

System.out.println(sb.length());

System.out.println(sb.reverse());

Q13. How many String objects are created?

javaString s = new String("Hello");

Q14. What is the output and why?

javaString s = "Hello";

s.replace("Hello", "World");

System.out.println(s);

StringBuilder sb = new StringBuilder("Hello");

sb.replace(0, 5, "World");

System.out.println(sb);

Q15. Why is String a good choice for HashMap key?W