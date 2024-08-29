package Array;

import java.util.Scanner;

public class TransposeArray {

	public static void main(String[] args) {
		int [][]a=new int [2][2];
		Scanner sc=new Scanner (System.in);
		System.out.println("ENter Array Element:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int b[][]=new int [a.length][a.length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
				b[i][j]=a[j][i];
			}
			
		}
		System.out.println("Transpose");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
