package AbstractionExample;

public interface IneterfaceExample1 {

	int a = 50;                // same as-----public static final int a=10;.....Value does not changed
	
	public void method1();     // -----Same as public abstract void method1(); (JVM converted its) 
	public void method2();     //-------Same as public abstract void mehtod2(); (JVM converted its)
	
		
	}
