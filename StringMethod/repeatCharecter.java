package StringMethod;

public class repeatCharecter {
public static void main(String[] args) {
	String s1="hello";
	
	String s2="";
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		s2=s2+ch+ch;
	}
	System.out.println(s2);
}
}
