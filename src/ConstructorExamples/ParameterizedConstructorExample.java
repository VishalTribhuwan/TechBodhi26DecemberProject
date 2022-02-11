package ConstructorExamples;

public class ParameterizedConstructorExample {
	
	int id;             // id is Instance Variable........(Inside the class)
	String name;        // 'name' is Instance Variable 
	
	ParameterizedConstructorExample(int i, String n) // Value assigning in Bracket, so it is Parameterized Constructor
	{
		id = i;
		name = name;
	}
		
	void display()
	{
		System.out.println(id +" "+ name);
	}
	
	public static void main(String[] args) {

		ParameterizedConstructorExample pm1 = new ParameterizedConstructorExample(12345, "Vishal");
		ParameterizedConstructorExample pm2 = new ParameterizedConstructorExample(67890, "Karan");
		 
		pm1.display();
		pm2.display();
	}

}
