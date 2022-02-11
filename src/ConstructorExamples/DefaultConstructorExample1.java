package ConstructorExamples;

public class DefaultConstructorExample1 {  // When Class Name & Method Name is same, then its called as Constructor
	
		DefaultConstructorExample1()	// There is no value in Bracket,so Its Default Constructor
	{
		System.out.println("I am a Default Consturctor");
	}

	public static void main(String[] args) {

		DefaultConstructorExample1 ds = new DefaultConstructorExample1();
	}

}
