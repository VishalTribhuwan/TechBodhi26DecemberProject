package Inheritence;

public class SingleInHeritenceImplementation extends SingleInHeritence {
	
	float bonus = 40000;
	
	void cde()
	{
		System.out.println("Child class Method");
	}
	
	public static void main(String args[]) {
		
		SingleInHeritenceImplementation sh = new SingleInHeritenceImplementation();
		System.out.println("sh.salary");
		System.out.println("sh.bonus");
		
		sh.abc();
		sh.cde();
	}

}
