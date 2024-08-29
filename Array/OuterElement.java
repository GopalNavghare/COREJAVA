package Array;

import java.util.Scanner;

public class OuterElement {

	public static void main(String[] args) 
	{
		int a[][]=new int  [3][3];
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
		System.out.println("outer Element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==0||j==0||i==a.length-1||j==a.length-1)
				{
					System.out.print(a[i][j]+" ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
