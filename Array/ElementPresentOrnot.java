package Array;

public class ElementPresentOrnot {

	public static void main(String[] args) {
	int []a={15,45,78,45,5,56,898,9};
	boolean result=false;
	int num=5;
	for(int i=0;i<a.length;i++)
	{
		if(num==a[i])
		{
			result=true;
			break;
		}
	} 
	if(result)
		System.out.println("Num is present  in array");
	else
		System.out.println("Num not present  in array");

}
}