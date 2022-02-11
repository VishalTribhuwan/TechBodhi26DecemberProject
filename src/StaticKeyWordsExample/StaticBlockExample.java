package StaticKeyWordsExample;

public class StaticBlockExample { // It is rarely used by Automation Tester

	static // static block executes before main method, 
	{
		System.out.println("Static block is invoked"); // Variables me +2 hokr aana chahhiye before main method pr jaye, we use static
	}
	
	public static void main(String args[]) {
		
		System.out.println("Hello Main");
	}
}

// Any action on variables like Addition, Deletn, extra kuch call krna h, we not allow calls through constructor it takes extra memory, so we use static