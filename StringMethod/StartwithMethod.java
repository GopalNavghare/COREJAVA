package StringMethod;

public class StartwithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         String s="HefShine";      //with method
//		boolean res=s.startsWith("Hef");
//		System.out.println(res);
//		
		
		String s1="Hefshine";
		String s2="Hefs";
		if(s2.length()<s1.length())
		{
			int i=0;
			int cnt=0;
		
			while(i<s2.length())
			{
				if(s2.charAt(i)==s1.charAt(i))
				{
					cnt++;
				}
				i++;
			}
			if(cnt==s2.length())
				System.out.println(true);
				
			else
				System.out.println(false);
			
		}
		else
			System.out.println(false);
		
	}

}
