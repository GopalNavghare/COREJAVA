package Array;

//import java.util.Arrays;

public class EvenOddCount {

	public static void main(String[] args)
	{
		int a[]= {12,23,42,1,32};
		
		int Evencnt=0;
		int Oddcnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
				Evencnt++;
			}
			else
			{
				Oddcnt++;
		 	}
		}
		int EvenIndex=0;
		int Oddindex=0;
		
		int Even[]=new int [Evencnt];
		int Odd[]=new int [Oddcnt];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				Even[EvenIndex]=a[i];
				EvenIndex++;
			}
			else
			{
				Odd[Oddindex]=a[i];
				Oddindex++;
			}
		}
		for(int i=0;i<Even.length;i++)
		{
			System.out.print(Even[i]+" ");
		}
		System.out.println();
		for(int i=0;i<Odd.length;i++)
		{
			System.out.print(Odd[i]+" ");
		}
//		System.out.println(Arrays.toString(Even));
//		System.out.println(Arrays.toString(Odd));
	}

}
