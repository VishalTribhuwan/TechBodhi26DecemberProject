package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException1 {
	
	public static void main(String args[]) {
		
		FileInputStream fs = null;
		
		try  // When we know that here exception will occures, that time we will use try....try k sath catch & finally use hota hi h
		{
		//  fs= new FileInputStream(""C:\\Sticky Notes\\A.txt"); // Compile time error
			fs= new FileInputStream("C:\\Sticky Notes\\A.txt");
			
		} catch (FileNotFoundException fnfe)  // User ne Exception kr liya toh catch use krenge
		{
			System.out.println("The specified file is not "+ " present at the given path");
		}
		
		int k;
		try {
			while((k = fs.read())!= -1) // we are not sure abt count, then we use while or do while loop
			{
				System.out.println((char)k);
			}
			fs.close();
		}catch(IOException ioe) {    // File Read ka access na ho toh catch use krna h    
			
			System.out.println("I/O error occured: "+ioe);
				
			}
		}
		
		
	}

