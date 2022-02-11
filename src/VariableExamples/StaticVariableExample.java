package VariableExamples;

public class StaticVariableExample {
	
	int rollNumber;
	String name;
	static String collegename = "Vivekanand College Aurangabad"; // Its Static variable used fr memory mngmnt. Its execute only once when class is loading
	
	StaticVariableExample(int r, String n) // When Class name & Method name is same then its Constructor, there is no Return type
	{
		rollNumber = r;
		name = n;
	}
	
	void ToPrint() {
		
		System.out.println(rollNumber);
		System.out.println(name);
		System.out.println(collegename);
	}

	public static void main(String args[]) {
		
		StaticVariableExample st1 = new StaticVariableExample(123456, "Vishal"); // If arguments is available in constructor then need to assign value while calling in main method.
		StaticVariableExample st2 = new StaticVariableExample(456789, "Karan");
		
		st1.ToPrint();
		st2.ToPrint();
	}
}

// Static Variable:-
// Declaration- It is defined with static keyword in a class but outside a method, constructor or blocks.
// Scope- Similar to Instance variable i.e. inside a method, constr or blocks including static method, const or blocks.
// When Variables Gets Allocated- When we run a program & .classfile is loaded, variable allocated. When class file gets unloaded variables gets destroyed.
// Stored Memory- Non-Heap Memory or static memory.
// Default Values- Similar to Instance variable. int-0, boolean-false, object-null.
// Access Specifier- Can be used. (Public, Private, Protected & default).
// How to Access- 1) Directly 2) By using classname A.b 3) By using object ref name
// Static Variable we can used in simple method as well
// Static Variable having more scope than Local variable
