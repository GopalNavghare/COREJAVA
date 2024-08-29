package Array;

import java.util.*;

public class setap {

	public static void main(String[] args) 
	{
	 TreeMap<Integer, String> tm=new TreeMap<Integer, String>();

		tm.put(22, "twotwo"); 
		tm.put(43, "fourtyThree");

		tm.put(1, "one"); 
		tm.put(9, "nine");

		tm.put(5, "five");
		
		//tm.get(tm);
		System.out.println(tm);
		 Set<Integer>keys=tm.keySet();

		     for(Integer x:keys) 
			System.out.println(x);
	}

}
