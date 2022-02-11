package Polymorphism;

public class MethodOverloading { // Method Overloading (Compile time Polymorphism)....Eg:- Calculator.
	
	public float add(int a, int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	public float add(float a, float b, float c)
	{
		System.out.println(a+b+c);
	    return a+b+c;
	}
	
	//public int add(float a, float b, float c) 
	// We can not acheive the concept overloading by changing the return type(int, float) of a method due to ambiguity. JVM gets confused
		
	//System.out.println(a+b+c);
    //return a+b+c;
	
	public float add(float a, float b)
	{
		System.out.println(a+b);
		return a+b;
	}
	
	public static void main(String args[]) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.add(5, 15.2f, 13.3f);  // Compile time Polymorphism:-It itself indicated return type before compiling the program (add)
		mo.add(12, 14);              
		mo.add(10.2f, 14.3f, 16.4f);
	}
	}
// Polymorphism:- Poly- Many, Morphism- Forms

// We can perform single action in different ways in polymorphism

// Method Overloading (Compile time Polymorphism)....Eg:- Calculator.

// If in class you have a method with same name (add), with diff signature, arguments or diff types of arg (int, float) that is called "Method Overloading".

// Method Overriding (Run time Polymorphism)

// If in a child class method with the same name of parent class bt specific implementation

// We can not acheive the concept overloading by changing the return type(int, float) of a method due to ambiguity JVM gets confused

// Same name

// with same class

// Different arguments- 1) No of Argmnts  2) Types of Argmnts  3) Sequence of Argmmnts