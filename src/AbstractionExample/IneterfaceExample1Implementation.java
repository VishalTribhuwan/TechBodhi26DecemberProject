package AbstractionExample;

public class IneterfaceExample1Implementation implements IneterfaceExample1 {

	@Override
	public void method1() {

		System.out.println("method1");
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}

	public static void main(String args []) {
		
		// int a=20;.................can not change the value as it is final
			
		IneterfaceExample1 if1 = new IneterfaceExample1Implementation();
		System.out.println(a);
		if1.method1();
		if1.method2();
		
	}
}
