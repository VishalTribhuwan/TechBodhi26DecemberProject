package VariableExamples;

public class InstanceVariableExample {

	public String var1;           // Instance variable......var1 anywhere access within a project, we can use Access Mod in Instance Var
	
	private int var2;             // Instance variable......var2 Used within a particular class, nt outside bcoz its (Private)
	
	public void method1(String abc1)  // method1 used anywhere within a project bcoz its (Public)
	
	{
		var1 = abc1;
	}
	
	void method2(int abc2)       // This method access within a particular package
	{
		var2 = abc2;
	}
	
	void method3()
	{
		System.out.println(var1);
		System.out.println(var2);
	}
	
	public static void main(String[] args) {
	
		InstanceVariableExample iv = new InstanceVariableExample();
		iv.method1("Vishal");
		iv.method2(450000);
		iv.method3();
	}
}

// Instance Variable:-
// Declaration- It is defined Inside the class but outside the method, constructor or blocks.
// Scope- Inside all methods, blocks & constructors within a class (not inside the Static method).
// When Variables Get Allocated- When object is created variables allocated; Obj gets destroyed variables releases memory.
// Stored Memory- Heap Memory.
// Default Values- They have default values like- int-0, boolean-false, object-null.
// Access Specifiers- Can be used. (Public, Private, Protected & Default).
// How to Access:- Simple Method- It can be called directly.  Static Method- InstanceVariableExample iv = new InstanceVariableExample();// iv.method 1,2,3
// Instance Variable having more scope than Local variable
