package Array;

public class remove1from2array 
{
	public static void main(String[] args) 
	{
		 int[] a ={ 1,1,1,1,1,2,2,3,4,4,4,4};	 
		 int[] b= { 1,2,4};
		 int[]num={ 1,2,4};
		 for(int j=0;j<num.length;j++)
		 {
			 int cnt=0;
			 for(int i=0;i<a.length;i++)
			 {
				 if(a[i]==num[j])
				 {
				     cnt++;
	 			 }
			 }
			 if(cnt>2)
			 {
			    cnt=2;
			 }
			 b=new int[a.length-cnt];
			 int index=0;
			 int cnt2=0;
			 for(int i=0;i<a.length;i++)
			 {
				 if(a[i]!=num[j] || cnt2==2)
				 {
					 b[index++]=a[i]; 
				 }
				 else
				 {
					 cnt2++;
				 }
			 }
			 a=b;
		 }
		 for(int i=0;i<b.length;i++)
		 {
		 System.out.print(b[i]+" ");
		 }
	}
}
