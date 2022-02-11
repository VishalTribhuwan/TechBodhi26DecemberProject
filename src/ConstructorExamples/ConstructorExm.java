package ConstructorExamples;

public class ConstructorExm {
	
	private String nonStatic ="ns";                    // non static variable
	 
	private static String staticString ="ss";          // static variable
	
	public ConstructorExm() {                          // user defined constructor
		nonStatic = "ns this";
	}
	public ConstructorExm(String xyz) {                // parameterized constructor
		staticString = xyz;
	}
	
	public void PrintMyContent() {
		System.out.println(nonStatic);
	}
	
	public void PrintMyContent1() {
		System.out.println(staticString);
	}
	
	public static void main(String args[]) {
		ConstructorExm t1 = new ConstructorExm();
		t1.PrintMyContent();
		
		ConstructorExm t2 = new ConstructorExm();
		t2.PrintMyContent();
	}

}
