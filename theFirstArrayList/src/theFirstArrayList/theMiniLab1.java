package theFirstArrayList;

import java.util.ArrayList;

public class theMiniLab1 {
	public static void main(String[] args)
	{
		
		System.out.println(theFactors(24));
		
		ArrayList <Integer> b = new ArrayList <Integer> ();
		
		b.add(6);
		b.add(7);
		b.add(96);
		b.add(31);
		b.add(47);
		b.add(21);
		
		System.out.println(keepComposite(b));
		
	}
	
	public static ArrayList<Integer> theFactors(Integer a)
	{
		
		ArrayList <Integer> factors = new ArrayList <Integer> ();
		
		if(a < 3)
		{
			
			return factors;
			
		}
		
		else
		{
			for(int i = 2; i < a ; i++)
		    {
			
			    if(a%i == 0)
			    {
				
				     factors.add(i);
				 
			    }
			   
		    }
			
			return factors;
		}
	
	}
	
	public static ArrayList<Integer> keepComposite(ArrayList b)
	{
		
		ArrayList <Integer> onlyComp = new ArrayList <Integer> ();
		
		for(int i = 0; i < b.size(); i++)
		{
			
			Integer check = (Integer) b.get(i);
			
			if(theFactors(check).size() >= 1)
			{	
				
				onlyComp.add(check);
				
			}
			
		}
		
		return onlyComp;
		
	}
	
}
