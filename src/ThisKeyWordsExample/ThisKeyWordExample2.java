package ThisKeyWordsExample;

public class ThisKeyWordExample2 {      // this keyword fr Simple Method
	
	void method1()
	{
		System.out.println("Hello");
	}
	void method2()
	{
		System.out.println("method 2");
		this.method1();                // this keyword use nhi kiya toh bhi chalega
		method1();                     // This is same as this.method1
	}
	
	     public static void main(String args[]) {
	    	 
		 ThisKeyWordExample2 th3 = new ThisKeyWordExample2();
		 th3.method2();
		
	}
		
	}


