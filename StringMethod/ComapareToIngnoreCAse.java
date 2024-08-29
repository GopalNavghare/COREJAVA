package StringMethod;

public class ComapareToIngnoreCAse {

	public static void main(String[] args) {
		String s1="pdkfjpdfp";
		String s2="PDkfJpd";
		
		int result=s1.compareToIgnoreCase(s2); 
		System.out.println(result);
		
	}

}
