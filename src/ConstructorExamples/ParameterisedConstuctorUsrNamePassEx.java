package ConstructorExamples;

public class ParameterisedConstuctorUsrNamePassEx {
	
	int id;
	String name;
	
	ParameterisedConstuctorUsrNamePassEx(int i, String n)
	{
		id = i;
		name = name;		
	}
	
	void dispaly()
	{
		System.out.println(id +" "+ name);
	}
	
	public static void main(String args[]) {
		
		ParameterisedConstuctorUsrNamePassEx pm1 = new ParameterisedConstuctorUsrNamePassEx(1235, "Vishal");
		ParameterisedConstuctorUsrNamePassEx pm2 = new ParameterisedConstuctorUsrNamePassEx(6789, "Karan");
		
		pm1.dispaly();
		pm2.dispaly();
		
	}

}
