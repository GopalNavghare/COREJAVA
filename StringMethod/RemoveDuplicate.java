package StringMethod;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String s1="abcdabcde";
		int count =0;
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				count++;
				System.out.print(s1.charAt(i));
			}
		}
		System.out.println("\n"+count);

	}

}
