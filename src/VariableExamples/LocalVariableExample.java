package VariableExamples;

public class LocalVariableExample {
		
		String InstatnceVariable = "This is Instance Variable"; // This is Instance Variable 
		
	public void firstmethod()
	
	{
	String LocalVariable = "This is Local Variable";   // This is local variable as it is inside the method, Constructor or blocks
	
	// Access modifier can not assign for local variable (Public, Private, Protected &  Default)
	// Public String abc1 ="access modifier can not assign for local variable";
	// Static keyword can not be used for local variable
	// Static String abc ="static can not used for local variable";
	// Value should be assign before first use of local variable
	// String NoAssignValue;
	// System.out.println(NoAssignValue);
	
		System.out.println(LocalVariable);
		}
	
		public static void main(String args[]) {
			
			LocalVariableExample vishal = new LocalVariableExample();
			System.out.println(vishal.InstatnceVariable);
			vishal.firstmethod();
		}
}

// Variable:- Variable is the name of a reserved area allocated in memory. Combination of 'Vary+able' means its value can be changed.
// Eg:- int data=50; // Here data is variable. It can be change like. int data=50+10;

// Local Variables:-
// Declaration- Its is defined inside method, constructor or blocks.
// Scope- Inside method, constructor or blocks not outside.
// When Variables Gets Allocated- When method, constructor or block gets executed, variables allocates memory, When gets exits, variables destroyed.
// Stored Memory- Stack Memory.
// Default Value- Doesn't have any default values, value should be provided before use.
// Access Specifier- Can not be used before Local Variables.