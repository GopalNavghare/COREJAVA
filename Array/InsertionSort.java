package Array;

public class InsertionSort 
{

	public static void main(String[] args) 
	{
	    int []a= {3,2,6,5,8};
	    for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i;
			while(j>0&&a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;			
			}
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
