package Array;

import java.util.Scanner;

public class SumOFDiagonal {

	public static void main(String[] args) 
	{
		int a[][]=new int  [2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
					System.out.print(a[i][j]+" ");	
			}
			System.out.println();
			
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i][a.length-i-1];
		}
		System.out.println("Sum :"+sum);
	}

}
