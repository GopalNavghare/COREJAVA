package Array;

import java.util.Scanner;

public class MAtrixfromUser {

	public static void main(String[] args) 
	{
		//int a[][]=new int [10][10];
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("Enter No of Row:");
		m=sc.nextInt();
		System.out.println("Enter No of Column:");
		n=sc.nextInt();
		
		int b[][]=new int[m][n];
		System.out.println("Enter Element:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
