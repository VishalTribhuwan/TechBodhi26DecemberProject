package Polymorphism;

public class MethodOverRiding1Implementation extends MethodOverRiding1 {
	
	int speedlimit = 150;  // over riding can not acheived on variables (........)
	
	void abc()
	{
		System.out.println("extended class");
	}
	void cde()
	{
		System.out.println(speedlimit);
		System.out.println(super.speedlimit);  // Accessing the superclass methods, constructor, variable used superkeyword
	}
	
	public static void main(String args[]) {
		
		MethodOverRiding1 mr = new MethodOverRiding1Implementation(); // dynamic method dispatch (Run time)
		System.out.println(mr.speedlimit);
		mr.abc();
		
		MethodOverRiding1Implementation mr1 = new MethodOverRiding1Implementation();
		System.out.println(mr.speedlimit);
		mr1.abc();
		
	}

}
