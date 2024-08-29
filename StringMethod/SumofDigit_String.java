package StringMethod;

public class SumofDigit_String {

	public static void main(String[] args) 
	{
		String s1="01bc3";
		int sum=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='1'&&s1.charAt(i)<='9')
			{
			 	int num=s1.charAt(i)-48;
				sum=sum+num;
			}
		}
		System.out.println(sum);
	}

}