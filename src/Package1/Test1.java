package Package1;

public class Test1 {
	
	public String nonStatic ="ns";                   // This is non static Methods (Nt using Static KeyWord)
	public static String staticString = "ss";        // This is static method (using static keyWord)

	public void method1NonStatic()                            
	{
		Test1 t1 = new Test1();
		System.out.println("This in mehtod 1 non static"+ t1.nonStatic);
	}
	
	public static void method2Static()                        
	{
		System.out.println("This in mehtod 2 static"+ Test1.staticString);
	}
	
		public static void main(String args[])
	{
			Test1 t1 = new Test1();
			t1.method1NonStatic();
			
			Test1.method2Static();

}
}
