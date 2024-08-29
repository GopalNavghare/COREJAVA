package StringMethod;

public class frequencyOfChar 
{
		public static void main(String[] args) 
		{
			String s1="abcd";
			
			for(int i=0;i<s1.length();i++)
			{
				int count=0;
				for(int j=0;j<i;j++)
				{
					if(s1.charAt(i)==s1.charAt(j))
					{
						count++;
					}
				}
				
				if(count==0)
				{
					int cnt=0;
					for(int j=0;j<s1.length();j++)
					{
						
						if(s1.charAt(i)==s1.charAt(j))
						{
							cnt++;
						}
					}
					System.out.println(s1.charAt(i)+" "+cnt);
				}
			}
		}
	
}
