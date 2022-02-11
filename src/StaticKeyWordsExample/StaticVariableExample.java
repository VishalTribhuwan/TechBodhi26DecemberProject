package StaticKeyWordsExample;

public class StaticVariableExample {
	
 //int count=0;
	
   static int count;          // Static:- Memory Management, It is used wth Variable, block, method & class
	                          // We used static Variable Eg. previously in CollegeName eg.
	                          // When our class is loading at that time memory will allocates to Static Variable
	                          // When we create a Instance of class at that time memory will allocates to Instance Variable
	StaticVariableExample()   // It is default constructor, There is no parameters, Class name & Method name is same, Explicitly no any Retun type
	{                         // When we creates Instance of class at that time Constructor will call
		count++;
	}
	
	void getcount()
	{
		System.out.println("Value of counter:" + count);
	}
	public static void main(String args[]) {
		
		StaticVariableExample st1 = new StaticVariableExample();
		st1.getcount();
		
		StaticVariableExample st2 = new StaticVariableExample();
		st2.getcount();
		
		StaticVariableExample st3 = new StaticVariableExample();
		st3.getcount();
	}

}
