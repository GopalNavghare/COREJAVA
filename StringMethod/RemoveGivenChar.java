package StringMethod;

public class RemoveGivenChar {

	public static void main(String[] args) {
		String s1="HAllo";
		char ch='H';
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			
			if(ch!=s1.charAt(i))
			{
			    s2=s2+s1.charAt(i);
			}
			
		}
		System.out.println(s2);
		
	}

}
