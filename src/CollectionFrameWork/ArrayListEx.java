package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String args[]) {
		
		List<String> ar= new ArrayList<String>();
// List is Interface so we can not create the instance of Interface, List se related method ko hum uski implemented class k throgh call krenge object banake
	
		ar.add("Vishal");
		ar.add("Nilesh");
		ar.add("Karan");
		ar.add("Vishal");
		ar.add("Karan");
		//ar.add(10);   //<String> is a generic. Only accepting String values
		ar.add("-------------------");
		
		// First way iterator
		Iterator<String> it = ar.iterator();
		
		 while(it.hasNext())
		 {
		 	System.out.println(it.next());
		 }
	
		// Second way for each loop
	    for(String ab:ar)
	    {
         System.out.println(ab);
         
         }
	    
	    // Third way for loop
	    System.out.println("Traversing list through for loop");
	    for(int i=0;i<ar.size();i++)
	    {
	    	System.out.println(ar.get(i));
	    }
         

		
		
		
	}

}
