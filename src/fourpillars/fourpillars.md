1.What is Encapsulation?

Wrapping data (fields) and methods together in a class, and restricting direct access to the fields from outside.

Two steps to achieve it:

Make fields private
Provide public getters and setters to access/modify them

Some important questions.
Basic

What is encapsulation?
How do you achieve encapsulation in Java?
What is the difference between private, public, and protected?
What are getters and setters?


Tricky / Conceptual

Can we have encapsulation without getters and setters?
Is a class with all public fields encapsulated?
What is the difference between encapsulation and abstraction?
Can a private field be accessed outside the class? (answer — yes, via reflection)
Why not just make everything public and skip getters/setters?
Can we have a getter without a setter? When would you do that? (read-only field)


Practical

How do you make a class immutable using encapsulation?
What happens if you don't use encapsulation in large projects?
How does encapsulation help in maintainability?


Related to Constructor

Can we use a constructor instead of setters? What's the difference?


2 .Abstraction

Hiding internal complexities , developer doesnot know about pay() method complexity,
like network check , balance check etc.
He just uses payment.pay()
abstract classes and interface are two ways to achieve it.

3 . Inheritance
Check my code.with commit -"inheritance"

important inheritance questions.
Q9. Can you instantiate an abstract class?
Q10. What is the difference between method overriding and method hiding?
Q11. Can a child class have a different access modifier than the parent method when overriding?

Level 3 — Hard
Q12. What is the difference between IS-A and HAS-A relationship?
Q13. What happens when you assign a child object to a parent reference? (Upcasting)
Q14. What is downcasting and when can it throw an exception?
Q15. If parent and child both have the same method, which one gets called when using parent reference pointing to child object?
Q16. Can constructors be inherited in Java?
Q17. What is covariant return type in method overriding?
