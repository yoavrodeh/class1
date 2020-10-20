# OOP in JAVA
@title[OOP]

## Introduction


---
### Today
1. A little about Java.
1. How it is like C.
1. Java Arrays and Strings.
1. Classes and objects.
  + Field variables and methods,
  + `public` and `private` modifiers,
  + `toString()`, `this`.
1. Encapsulation and object oriented programming.




---
### Resources
+ [Object Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)
+ [Basic Java + Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)
+ [Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
+ [Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html)



---
### Java is:
+ Object oriented
+ Concurrent
+ Portable
+ Efficient
+ Has a huge library and set of tools
+ One of the most popular programming languages in the world


---
### Java Virtual Machine
+ Java programs compile to **bytecode**, which 
  is similar to machine language but is machine independent.
+ It is executed by a Java Virtual Machine (JVM), which is different for each system.
+ Just-in-time compilers improve performance by compiling bytecode to machine code in real time.

![compile](https://docs.oracle.com/javase/tutorial/figures/getStarted/getStarted-compiler.gif)


---
![James Gosling](https://www.azquotes.com/picture-quotes/quote-java-is-c-without-the-guns-clubs-and-knives-james-gosling-59-63-02.jpg)



---
Just like C:
@code[java code-max code-noblend](src/Basic.java)
Well, almost..



---
### For now,
Just use without understanding:
```java code-noblend
public class ClassName {
	public static void main(String[] args) {
		// Your code here.
	}
}
```
For printing, using `System.out.println(...)`.



---
### Unlike C
+ Java uses **references** and not pointers. 
  + References cannot be manipulated arithmetically, and are typed.
  + May (or may not) be implemented as pointers.
+ Conditions must be boolean, so `if(x)` won't work if `x` is `int` or a reference.
+ Variables are instantiated with default values. 
  + Numbers as 0.
  + References as `null`. 



---
### Java Arrays
1. Instantiation is different than C.
1. Arrays have a length property `a.length`. 
1. Special way to go over values in an array.
1. Just like C, 
  + Cannot change the size of an array.
  + Array variables are references.



---
### Enhanced For Loop
If `a` is an array of type `Type`, then you can use
```java code-noblend
for (Type t : a)
    // use t
```
This is short for:
```java code-noblend
for (int i = 0; i < a.length; i++) {
    Type t = a[i];
    // use t
}
```
Use it when you can! it is shorter and clearer.




---
@code[java code-max code-noblend](src/Arrays.java)
@[4-7](Different ways to instantiate an array. Java sets a default value of 0.)
@[9-14](Pretty much like C.)
@[16-18](This is new.)
@[20-24](An array variable is a reference.)
@[26-34](2D arrays are arrays of arrays. Why use first method at all?)



---
## Question

If `a` is an array of ints, how can you increase its size?


---
## Answer
```java code-noblend
int[] b = new int[a.length * 2];
for (int i=0; i<a.length; i++)
	b[i] = a[i];
a = b;
```


---
### Java Strings
Strings are not just char arrays
+ They are a special kind of a class (so what is that?)
+ They have **methods**, such as: `charAt(int i), length(), indexOf(char c)`
+ Many more methods can be found [here](https://docs.oracle.com/javase/9/docs/api/java/lang/String.html).



---
@code[java code-max code-noblend](src/StringExample.java)
@[1-11](the `+` operator works nicely on strings)
@[13-16](some common string **methods**)
@[18-29](`split` is useful, but complex)


---
### The `+` Operator
1. `+` of two strings concatenates them and returns a new string.
1. When doing `+` of a string and a non-string variable, java first creates a string representing the variable. 

@css[fragment](*More on that later...*)

---
# Classes
## and Objects
  
  
---
A class is like a struct typedef:
@code[java code-max code-noblend](src/Class1.java)
+ `x` and `y` are **fields** of `Class1`.
+ We will discuss what `public` is soon.




---
@code[java code-max code-noblend](src/MainForClass1.java)

1. Use `new` to create a new **instance** of a class (an **object**). It returns a reference to it.
1. There is only . which acts like -> in C. 


---
### Methods

functions that are part of the class, and when called by an instance of the class, can access its fields.


---
@code[java code-max code-noblend](src/Class2.java)

This class has two methods. Instead of using the variables of an object directly, we can call its methods.

@css[fragment](*Let's see how it is used:*)



---
@code[java code-max code-noblend](src/MainForClass2.java)
@[3-14](The methods are called on the instance `a`, and so accesses its `x` and `y`)
@[16-22](The result)



---
@code[java code-max code-noblend](src/Class3.java)
It is similar to the previous class, except it has a **constructor**. This is a special method, that can be called automatically when creating a new instance.



---
@code[java code-max code-noblend](src/MainForClass3.java)
+ It is much simpler to create new instances using a constructor.
+ Again, notice, how `sum()` accesses the fields of the instance it is invoked on.



---
### Constructors
+ The method name is the name of the class.
+ Does not have a return value (not even `void`).
+ If you don't write **any** constructor, Java adds an invisible empty constructor.
```java code-noblend
public YourClass() {
}
```






---
*its time for some theory...*
1. Data combined with algorithms for it form **Objects**.
1. Object communicate with each other using their **interface** (their public methods) in different ways.
1. **Encapsulation** is critical.
  + Creates a clear definition of what is the interface.
  + Lets us change the implementation of one object without changing others.   




---
### Encapsulation
1. Methods and variables can be 
  + **public**, can be accessed from anywhere.
  + **private**, can be accessed from methods inside the class only.
1. Preferably, fields are private, and accessed via controlled public methods. Why?
  + To protect integrity. 
  + To expose only the **interface** and not the **implementation**.
  

---
@code[java code-max code-noblend](src/Vector.java)
@[1-12](accessing private variables through public methods lets us protect them)
@[14-16](This one is important)
@[18-25](An argument to a method can be a `Vector`. We can access its private fields even though it belongs to another object!)
@[27-34](First version changes the object, and second returns a new one.)


---
@code[java code-max code-noblend](src/MainForVector.java)
We cannot use `v1.x` or `v1.y` here!


---
### `toString()` 
+ Automatically called in `print` and `println`.
+ When any object is added to a String, Java first calls the object's `toString()`.
+ It's recommended to write one in your classes.
+ If you don't, a default `toString()` is used (try it and see). 


---
## Exercise

Write a `Student` class, having the following methods:
```java code-noblend
public Student(String name1, long id1);
public String toString();
public void addCourse();
public void removeCourse();
```
A student will only remember the **number** of courses it has, and so `addCourse()` increases this number by 1, and `removeCourse()` decreases it by 1. 

*Here is an example of using this class:*




---
@code[java code-max code-noblend](src/MainForStudent.java)
 
@css[fragment](*and the solution:*)




---
@code[java code-max code-noblend](src/Student.java)
@[1-9]
@[11-21]


---
### `this`
The `this` keyword has a few uses:
+ When a method argument name *shadows* a field of the class. This is common in constructors and setters.
+ To call another constructor from within a constructor. This has to be the **first line** of the calling constructor. 
+ To get a reference to the current object (we won't see this right now).



---
@code[java code-max code-noblend](src/Vector2.java)


---
@code[java code-max code-noblend](src/MainForStringStack.java)

`StringStack` is a good example for OOP. It is an object that has a **state** that can change. 

Here we see how to use it. 
*Let's write it:*



---
@code[java code-max code-noblend](src/StringStack.java)
@[1-11](`current` holds index of the first **empty** slot.)
@[13-24](Note the use of the `null` keyword.)



---
### Conventions 
+ variables, classes and methods are all in **CamelCase**.
+ Classes start with a capital letter. variables and methods don't.
+ Declare variables where you need them. 



---
### Primitive types
+ `boolean` : \{`true`, `false`\}
+ `char` : A unicode character.
+ integers: `byte`, `int`, `short`, `long`
+ floating point: `float`, `double`

Any other variable is a reference to an object, i.e., an instance of a class.


---
### Garbage Collection
Did you notice we do not have to free what we allocate with `new`?

Java does it for us! 


---
## Exercise
Define a `Matrix` class, which is a 2x2 matrix which has two private variables, and a few methods:
```java code-noblend
private Vector v1, v2; 

public Matrix(Vector v1, Vector v2);
public void multByConstant(double c);
public Matrix add(Matrix other);
```
For `multByConstant`, first add such a method to `Vector`.

*see the solution in package `ex`*