package ExceptionHandling;

public class ExceptionHandlingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] marks = {90, 95, 98};
		
		try {
			
			System.out.println(marks[5]);
		}
		catch(Exception exception) {
			
		}
		
		System.out.println("My name is Vishal"); // ApnaCollege Example
	}

}

// Exception:- Exception is an event that distrubs the normal flow of the program

// Exception Handling:- It is a mechanism to handle runtime errors such as ClassNotFound, IO, SQL, Remote etc.

// Types of Exception:- 1. Checked Exception  2. Un-Checked Exception  3. Error

// Checked Exception- It is also called as "Compile Time Exception", Warns us at compile time 

// Un-Checked Exception- It is alos called as "Run Time Exception", Our program gets compile bt when we try to run it then exception occures

// Error- We are nt handling Error, when it occurs our program abruptly get closed