package ThisKeyWordsExample;

public class ThisKeyWordExample1 { // Current class k Local & Instance Variable me differentiate krne k liye this use krte h
	
	int rollNo;                    // Instance Variable
	String name;                   // Instance Variable
	float fee;                     // Instance Variable
	
	ThisKeyWordExample1(int rollNo, String name, float fee) // Parameterised Constructor (Local Variable)
	{
		this.rollNo=rollNo;        // Diff btwn Local & Instance Variable of Current class
		this.name=name;           // this jiske k samne hota h woh Instance Variable ko call deta h
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollNo+" "+name+" "+fee);
	}
	
	public static void main(String args[]) {
		
		ThisKeyWordExample1 th1 = new ThisKeyWordExample1(123,"Vishal",1246656f);
		ThisKeyWordExample1 th2 = new ThisKeyWordExample1(456,"Karan",4546465f);
		th1.display();
		th2.display();
	}

}
