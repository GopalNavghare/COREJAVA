package Sorting;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int []a= {33,78,90,20,5,50,40};

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int num:a)
		{
			System.out.print(num+" ");
		}
	}

}
