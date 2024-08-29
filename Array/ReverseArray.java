package Array;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int[]a= {1,23,4,5,62};
		
		int i=0;
		int j=a.length-1;
		
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
//		for(int value:a)
//		{
//		 	System.out.print(value+" ");
//		}
	}

}
