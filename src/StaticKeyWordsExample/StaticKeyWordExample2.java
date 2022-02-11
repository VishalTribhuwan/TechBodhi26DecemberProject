package StaticKeyWordsExample;

public class StaticKeyWordExample2 {
	
	int empid;
	String name;
	String company="BFL";
	
	StaticKeyWordExample2(int empid, String name)
	{
		this.empid=empid;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(empid+" "+name+" "+company);
	}
	public static void main(String args[]) {
		
		StaticKeyWordExample2 e1 = new StaticKeyWordExample2(101, "Avianash");
		e1.display();
		
		StaticKeyWordExample2 e2 = new StaticKeyWordExample2(102, "Vishal");
		e2.display();		
	}
// Java by Deepak
}
