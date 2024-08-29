package Array;

public class FindMinElement {

	public static void main(String[] args) {
		
		int a[]= {11,25,58,64,1};
		
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
