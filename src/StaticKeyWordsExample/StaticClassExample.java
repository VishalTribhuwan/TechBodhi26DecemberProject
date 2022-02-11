package StaticKeyWordsExample;

public class StaticClassExample {        // Outer class kbhi bhi Static nhi ho skti, Inner class hi Static ho skti h
	
	static String abc = "Hello Alexa";
	String cde ="Hello Google";
	
	static class InnerclassStatic       // InnerClass hi static ho skti h
	{
		static void print()             // static method
		{
			System.out.println(abc);   // Able to call to "abc" bcoz woh static h
		//  System.out.println(cde);  // can not access the outer class "cde" in static
		}
		
		void method1()
		{
			System.out.println("method1");
		}
		
		public static void main(String args[]) {
			
			StaticClassExample.InnerclassStatic.print(); // Outer ClassName.Inner ClassName. MethodName....(Static class ke static method ko call dena h)
			StaticClassExample.InnerclassStatic in = new StaticClassExample.InnerclassStatic();
			in.method1();
			
			StaticClassExample st2 = new StaticClassExample();
			System.out.println(st2.cde);
		}		
		
		}
	}
	


