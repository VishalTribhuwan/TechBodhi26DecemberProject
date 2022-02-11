package Inheritence;

public class SingleInHeritence {
	
	float salary = 80000;
	
	void abc()
	{
		System.out.println("Parent class Method");
	}

}

// InHeritence:- Its is used for code Reuseability & method OverRidding. (extends & implements keyword (OverRiding)).

// eg:- Flipkart Login 10 Line code & we reuse these 10 Line code again	.......It will be ReUseable using InHeritence method.

// Types of Inheritence:- 1) Single Inheritence  2) Multilevel Inheritence  3) Hierarchical Inheritence

// Q. Concept of MultipleInHeritence possible in Java??

// Ans. Through Class is not possible, through Interface is possible. Eg- A extends B, C (Its nt possible in java)

// Class- Ambiguity....... Interface- We provides its implementation in its implemented class (Interface ka only name hota h (add,sub), hm koi Implementation provide nhi krte h

// Eg- B add, C add, A extends B, C  add (So its ambiguity, JVM gets confused, ki konsi add ko call krna h)