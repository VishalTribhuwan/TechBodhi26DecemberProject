package ExceptionHandling;

public class UnCheckedException1 {   // It will give Exception on Rune time nt on compile time
	
	public static void main(String args[]) {
		
		 try {       // Withthout try catch program will run
			
			int arr[] = {1,2,3,4,5};      // arr [] used for storing no of data 
			System.out.println(arr[7]);
		}
		
		  catch(ArrayIndexOutOfBoundsException e)
		{
			  System.out.println("The specified index does not exist" +"in array. Please correct the error");
		}
		 
		}
}