package StringMethod;

public class LowerToupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="welcome";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				ch= (char) (ch-32);
			}
			s2=s2+ch;
		}
		System.out.println(s2);
	}

}
