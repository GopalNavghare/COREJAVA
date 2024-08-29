package StringMethod;

public class FindIndexGivenString {

	public static void main(String[] args) {
		String s1="hellz";
		
		int index=3;
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==index)
			{
				System.out.println(ch[i]);
			}
			
		}
		if(index>s1.length())
			System.out.println("out of range");
	
		//System.out.println(str.charAt(2));
		
	}

}
