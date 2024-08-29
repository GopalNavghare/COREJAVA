package AkshaySir;

import java.util.Scanner;

public class rangeForEvenOodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a range : ");
		int Start=sc.nextInt();
		int End=sc.nextInt();
	
		for(int i=Start;i<=End;i++)
		{
			if(i%2==0)
				
			{
				System.out.println("Even Number: "+i);
				
			}
			else
			{
				System.out.println("Odd Number : "+i);
			}
			
			
		}
	}

}
