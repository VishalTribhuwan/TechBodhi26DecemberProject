package StaticKeyWordsExample;

public class StaticMethodExample {  // If method is static then using Class name.method name it will be call
	                                // Static k andar static
	                                // Non static k andar Dono, static & non static
	int a = 10;
	static int b = 20;
	
	static void abc()
	{
	 // System.out.println(a);      // static method can not access in non static method
		System.out.println(b);
	}
	
	void cde()                      // non static method can access in both static & non static variable
	{
		System.out.println(a);
		System.out.println(b);
	}
	 public static void main(String args[]) {
	  // System.out.println(a);    // can not access as main method is also static
		 StaticMethodExample sm1 = new StaticMethodExample();
		 System.out.println(sm1.a);
		 System.out.println(b);
		 
		 StaticMethodExample.abc();
	 //  cde();                    // not possible as cde is non static (Simple method)
		 sm1.cde();
	
	}

}
