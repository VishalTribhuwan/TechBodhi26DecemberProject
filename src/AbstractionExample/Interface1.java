package AbstractionExample;

public interface Interface1 {
	
//  int x;         //Compile time error----interface variables must be initialized at the	
	int a=10;     // same as-----public static final int a=10;.....Value does not changed
	
	public void method1();      // -----Same as public abstract void method1(); (JVM converted its)
	public void method2();     //-------Same as public abstract void mehtod2(); (JVM converted its)
}

// Main Roles of Interface are:- 100% abstraction & Multiple Inheritence Achievement, Bcoz Interface methods is by default abstract & public.

// Using Interface keyword.

// Multiple Inheritence Acheivement:- For code re-usability & overridding, Parent class property used by child class 

// Types of Inheritence- 1. Single Inheritence 2. Multiple Inheritence 3. Hierarchical Inheritence

// Multiple Inheritence:- Class C extends Class B, Class A it is not possible in Java through class bcoz In Class B there is Add method & same in Class B So, JVM gets confused konsi class K method ko call dun A class ki ya B class ki??

// In Interface there is only method name available & its abstract, Uska koi bhi Implementation Dtls nhi hota h, usko hum jha extends (Inherits) kr rhe h, wha dtls provide krenge, So there is no problem of Ambiguity in Interface.

// Multiple Inheritence:- Concept to Mul Inhr in Java is possible through Interface bt not possible through Class

// Variables are by default converted into public static final. 

// eg:- int a  -JVM converts it into public static final.........int a=10;........Value does not changed

