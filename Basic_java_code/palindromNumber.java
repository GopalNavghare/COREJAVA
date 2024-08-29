package AkshaySir;

public class palindromNumber {

	public static void main(String[] args)
	{
		
		 int num=454;
		 int temp =num;
		 int sum=0;
		 int rem=0;
		 
		 while(num>0)
		 {   
			 rem=num%10;
			 sum=(sum*10)+rem;
		     num=num/10;
		 }
		 if(temp==sum)
		 {
			 System.out.println(temp+" is palindrom number");
		 }
		 else
		 {
			 System.out.println(temp+" is not palindrom number");
		 }

	}

}
