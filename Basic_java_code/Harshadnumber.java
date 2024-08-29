package AkshaySir;

public class Harshadnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=161;
		int rem=0;
		int sum=0;
		int temp=num;
		
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println(temp%sum);
		if(temp%sum==0)
			System.out.println("Harshad number");
		else
			System.out.println("Not a Harshad number");
	

	}

}
