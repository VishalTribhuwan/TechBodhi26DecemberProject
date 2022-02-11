package VariableExamples;

public class LocalVariableEx1 {
	
	int a = 10;                      // Instance Variable
	static int b = 20;               // Static Variable, we can used it in simple method as well

	
	void add()
	{
		int c = 30, d;               // Local Variable, It is accessible only this method
		d = a+b+c;
		System.out.println(d);
	}
	
	void mul()
	{
		int e = 40, f;               // Local Variable
		f = a*b*e;
		System.out.println(f);
	}
	
	public static void main(String args[]) {  // Java by Deepak
		
		LocalVariableEx1 vishal = new LocalVariableEx1();
		vishal.add();
		vishal.mul();
		
	}
}
