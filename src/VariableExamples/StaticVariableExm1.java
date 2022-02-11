package VariableExamples;

public class StaticVariableExm1 {
	
	int rollNumber;
	String name;
	static String companyName ="Bajaj Finserv";     // comapnyName is common, so used as Static
	
	StaticVariableExm1(int r, String n)
	{
		rollNumber = r;
		name = n;
	}
	void ToPrint()
	{
		System.out.println(rollNumber);
		System.out.println(name);
		System.out.println(companyName);
	}
	
	public static void main(String args[]) {
		
		StaticVariableExm1 st1 = new StaticVariableExm1(12345,"Vishal");
		StaticVariableExm1 st2 = new StaticVariableExm1(56789,"Karan");
		st1.ToPrint();
		st2.ToPrint();
	}
	
}
