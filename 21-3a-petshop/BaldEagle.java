//Since the BaldEagle is a bird, it is a pet therefore it extends Bird
public class BaldEagle extends Bird
{

	private int weight;
	//global variables for the class to be defined by the subsequent methods
	private int height;
	
	public BaldEagle(String petName, int birdWeight, int birdHeight,
			boolean canFly) 
	{
		super(petName, birdWeight, birdHeight, canFly);
		weight = birdWeight;
	    height = birdHeight;
	}

	public int setHeight() 
	{
		
		return height;
	}
	 
	public int setWeight()
	{
	    return weight;
	  
	}
	
	public boolean canFly()
	{
		return true;
	}
	
	public String toString()  
	{
		return (super.toString() + " is a BaldEagle(Bird), weighing " + weight + " pounds");
	}
	
	public String speak() 
	{
		
		return "SSSSwwwwaaaaa";
	}

	
	public String move() 
	{
		
		return "Fa-fun fa-fun fa-fun";
	}

	
	
}
