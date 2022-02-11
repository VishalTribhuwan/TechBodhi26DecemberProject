package ConstructorExamples;

public class DefaultConstructorExample2 {
	
	int id;        // id is static variable, we are not passing any value in it, Default Const Assign value is Background
	String name;  // Compiler provided the default value in background
	
		void display()
	{
		System.out.println(id +" "+name);
	}
	
		public static void main(String[] args) {

			DefaultConstructorExample2 ds1 = new DefaultConstructorExample2();
			DefaultConstructorExample2 ds2 = new DefaultConstructorExample2();
			
			ds1.display();
			ds2.display();
					
	}

}
