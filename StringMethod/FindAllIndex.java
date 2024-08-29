package StringMethod;

public class FindAllIndex {

	public static void main(String[] args) 
	{
		String s1="pdkfjpdfp";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='p')
			{
				System.out.println(i);
			}
			
		}
//		int index=s1.indexOf('f'); //indexOfMEthod
//		System.out.println(index);

	}

}
