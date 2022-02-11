package ThisKeyWordsExample;

public class ThisKeyWordExample3 { 
	
	ThisKeyWordExample3()      // Default Constructor
	{
		this(5);
		System.out.println("Default Constructor");
	}
	
	ThisKeyWordExample3(int a){  // Parameterised Constructor
	//  this();
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		
		ThisKeyWordExample3 th = new ThisKeyWordExample3();
	}

}

// Ek constuctor ko dusre constructor me call dena h toh this keyword ka use krenge