package Array;

public class UniquePair {

	public static void main(String[] args) {
		int[] a={1,2,3}; 
		int[]b=new int[a.length];
		 int index=0; // 0
		
		 for(int i=0;i<a.length;i++)   // i=0; 0<2
		 {
			 int cnt=0;  //cnt=0
			 for(int j=0;j<i;j++) //j=0;0<0
			 {
				 if(a[i]==a[j])            
				 {
					 cnt++;
				 }
			 }
			 if(cnt==0) //t
			 {
			      b[index++]=a[i];//b[
			 }
		 }
		 
		 for(int i=0;i<index;i++)
		 {
			 for(int j=0;j<index;j++)
			 {
				 System.out.println(b[i]+ " "+b[j]);
			 }
		 }
		
	}

}
