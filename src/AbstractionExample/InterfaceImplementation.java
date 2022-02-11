package AbstractionExample;

public class InterfaceImplementation implements Interface1 { // We used implements keyword when our child is interface

	@Override
	public void method1() {
		System.out.println("method1");
		
	}

	@Override
	public void method2() {
		System.out.println("method2");
		
	}

	public static void main(String args[]) {
		
	//	a = 20;-------can not change the value as it is final in previous (Interface1 class)
		
		Interface1 if1 = new InterfaceImplementation();
		System.out.println(a);
		if1.method1();
		if1.method1();
		
	}
}
