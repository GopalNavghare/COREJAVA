package AkshaySir;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int count=0;
		
		for( int i=1; i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}}
			System.out.println(count);
		
		
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}

}
