package SuperKeyWordExamples;

public class SuperMethod1Implementation extends SuperMethod1 {

	void display()
	{
		System.out.println("Child/derived class method");
	}
	
	void print()
	{
		super.display();
		display();
	}
	
	public static void main(String args[]) {
		
		SuperMethod1Implementation sm = new SuperMethod1Implementation();
		sm.print();
	}
}
