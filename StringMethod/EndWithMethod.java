package StringMethod;

public class EndWithMethod {

	public static void main(String[] args) {
		
//		    String s1="pdkfjpdfp";
//		    
//			boolean res=s1.endsWith("dfp");
//			System.out.println(res);
			String s1="Hefshine";
			//System.out.println(s1.length());
			String s2="";
			//System.out.println(s2.length());
			int cnt=0;
			if(s2.length()<s1.length())
				System.out.println(false);
			else
			{
				int i=s1.length()-1;  //6
				int j=s2.length()-1; //1
				
			
				for(int k=0;k<s2.length();k++)//k=0;0<3;
				{
					if(s1.charAt(i)!=s2.charAt(j))// e!=t
					{
						cnt++; //1
					}
					i--;
					j--;
				}
				if(cnt==0)
					System.out.println(true);
					
				else
					System.out.println(false);
				
			}
			
	}

}
