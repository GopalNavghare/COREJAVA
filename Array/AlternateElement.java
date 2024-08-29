package Array;

public class AlternateElement {

	public static void main(String[] args) {
		
		int []a= {1,2,3,5,4};
		System.out.println("First logic");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Second Logic");
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
			
		}
	}

}
