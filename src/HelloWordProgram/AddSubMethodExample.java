package HelloWordProgram;

public class AddSubMethodExample {
	
	public static void main(String args[])
	{
		System.out.println("This is Add & Substract Method Example");
		
		AddSubMethodExample vishal = new AddSubMethodExample();
		vishal.add(10, 5);
		System.out.println(vishal.add(10, 5));
		// int a = vishal.add(10, 5);
		vishal.substract();
	}

	public int add(int a, int b) {
		
           int c = a+b;
           return c;
	}

	public void substract() {

		System.out.println("This is substract Method");

}
	}
