package ConstructorExamples;

public class DefaultConstructorExample3 {
	
	int a=5;  // a=5 is static variable, If we are not passing any value in it, then Default Const Assign value is Background
	String Vishal;
	
	void display()
	{
		System.out.println(a +" "+ "Vishal");
	}

	public static void main(String[] args) {
		
		DefaultConstructorExample3 ds1 = new DefaultConstructorExample3();
		DefaultConstructorExample3 ds2 = new DefaultConstructorExample3();
		
		ds1.display();
		ds2.display();		

	}

}
