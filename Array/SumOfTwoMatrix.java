package Array;
import java.util.*;
public class SumOfTwoMatrix {

	public static void main(String[] args) 
	{
		int [][]a=new int [2][2];
		int [][]b=new int [2][2];
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first array:");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Second Array Element:");

		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition of matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c=a[i][j]+b[i][j];
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
	}

}
