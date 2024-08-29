package AkshaySir;

import java.util.Arrays;

public class seperateevenodd {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
	    int b[]=new int[a.length];
//		first way
//				int even=0;
//				int odd=a.length-1;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2!=0)
//			{
//				b[odd++]=a[i];
//			}
//			else
//			{
//				b[even++]=a[i];
//			}
//		}
//		System.out.println(Arrays.toString(b));
//		
//		Second way
//		int index=0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2!=0)
//			{
//				b[index++]=a[i];
//			}
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==0)
//			{
//				b[index++]=a[i];
//			}
//		}
//		System.out.println(Arrays.toString(b));
		
	    //third way
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]%2!=0)
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}
