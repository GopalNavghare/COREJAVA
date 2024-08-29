package StringMethod;

public class FIndindexnumberOfString {

	public static void main(String[] args) 
	{
		
		String str="hello";
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
				System.out.println(ch[i]+" "+i);
		}
		
		System.out.println("single  index number  "+str.indexOf('e'));
		
	}

}
