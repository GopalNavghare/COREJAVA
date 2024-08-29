package Array;
import java.util.*;
public class SumAndAverageOfMatrix {

	public static void main(String[] args)
	{
		int a[][]= new int  [4][4];

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element:");
		for(int i=0;i<=a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}


