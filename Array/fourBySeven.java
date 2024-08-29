package Array;

public class fourBySeven {

	public static void main(String[] args) 
	{
     int a[][]= {{1,2,3,4,3,4,5},{1,2,3,4,6,54,3},{1,2,3,4,53,4,3},{1,2,3,4,34,34,34}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			} 
			System.out.println();
		}
	}

}
 