package Sorting;

import java.util.Arrays;
public class usingMethodSorting 
{

	public static void main(String[] args) 
	{
		int []a={11,23,45,34,42};
		System.out.println(Arrays.toString(a));
		for(int i=1;i<a.length;i++)
		{
			int j=i-1;
			for(;j>=0;j--)
			{
				if(a[j]<a[i])
					break;
			}
		    RightRotate(a,j+1,i);
		}
		System.out.print(Arrays.toString(a));
	}
	  public static void RightRotate(int a[],int s,int e)
	  {
			int temp=a[e];
			for(int i=e;i>s;i--)
			{
				a[i]=a[i-1];
			}
			a[s]=temp;
	  }
}	