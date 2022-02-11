package ConditionalStatements;

import java.util.Scanner;

public class IfElseOddEvenExample {

	public static void main(String args[])  {
		
		Scanner sc = new Scanner(System.in);  // sc=Reference  new=Object //Scanner(class):-used fr taking Run time out frm usr......

		System.out.println("enter a number");
		int number = sc.nextInt();
		
		if (number%2==0)  // 14/2= Remainder =0
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		}
		
	}
	
