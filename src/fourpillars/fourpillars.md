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
