package SuperKeyWordExamples;

public class SuperVariable1Implementation extends SuperVariable1 {
	
	String abc ="I am in a Child class";
	
	void display()
	{
		System.out.println(abc);
		System.out.println(super.abc); // Using Super keyword we access parent class variable (abc)
	}                                  // same as Method OverRiding
	
	    public static void main(String args[]) {
	
	    SuperVariable1Implementation sp = new SuperVariable1Implementation();
	    sp.display();
	}
	
}
