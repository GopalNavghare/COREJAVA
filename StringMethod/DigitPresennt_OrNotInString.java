package StringMethod;

public class DigitPresennt_OrNotInString {

	public static void main(String[] args) {
		String s1="112";
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
			{
				count++;
			}
		}
		if(count==s1.length())
		{
			System.out.println("Digit present "+count);
		}
		else
			System.out.println("not present ");
	}

}
