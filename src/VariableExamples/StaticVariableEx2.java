package VariableExamples;

public class StaticVariableEx2 {
	
	int a = 10;
	static int b = 20;
	
	public static void main(String args[]) {
		
		StaticVariableEx2 abc = new StaticVariableEx2();
		System.out.println(abc.a);
		System.out.println(abc.b);
		
		abc.a = 1000;
		abc.b = 2000;
		System.out.println(abc.a);
		System.out.println(abc.b);
		
		StaticVariableEx2 efg = new StaticVariableEx2();      // Java by Deepak
		System.out.println(efg.a);
		System.out.println(efg.b);
		}

}
