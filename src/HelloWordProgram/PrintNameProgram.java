package HelloWordProgram;

public class PrintNameProgram {
	
	public static void main(String args [])
	{
		
		System.out.println("This is Vishal Tribhuwan");


	  PrintNameProgram vt = new PrintNameProgram();
	  vt.add();
	  vt.substract(50, 10);
      System.out.println(vt.substract(50, 10));	  
    //System.out.println("a");
	    
	}

	public void add() {

		System.out.println("This is addition Method");
	}
	
	public int substract(int a, int b)
	{
		int c = a-b;
		return c;
	}
}

