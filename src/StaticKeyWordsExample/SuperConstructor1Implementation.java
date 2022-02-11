package StaticKeyWordsExample;

public class SuperConstructor1Implementation extends SuperConstructor1 {
	
	SuperConstructor1Implementation(int c)
	{
		//super(); //_ _ JVM will give call to parent constructor implicitly if parameterised constuctor is not used 
		super(12);
		System.out.println("child class parameterised constructor");
		
	}
	
	public static void main(String[] args) {
		
		SuperConstructor1Implementation scm = new SuperConstructor1Implementation(5);
	}
	
	}
