package theFirstArrayList;

import java.util.ArrayList;

public class theFirstArrayListPractise {
	
	public static void main(String[] args)
	{
		
		/*ArrayList <Integer> theList = new ArrayList<Integer>();
		
		theList.add(325);
		
		theList.add(212);
		
		theList.add(101);
		
		theList.add(77);
		
		theList.add(66);
		
		theList.set(2,1225);
		
		theList.remove(3);
		
		/*for(Integer number : theList)
		{
			System.out.println(number);
		}
		*/
		
		//System.out.println(theList.get(2));
		//System.out.println(theList.remove(3));
		//theList.size();  (same as the .length for other object)
		
		ArrayList<String> band = new ArrayList<String>();

		
		band.add("Lindsey");
	  	band.add("Mick");
		band.add("Stevie");
		band.add("Peter");
		band.remove(3);
		band.add(2, "Christine");


		System.out.println(band);

		
	}
}
