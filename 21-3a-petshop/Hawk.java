//Hawk is a pet, due to the fact that it is a bird
//But hawk extends Bird
public class Hawk extends Bird
{

	private int weight;
	//global variables for the class to be defined by the subsequent methods
	private int height;
	 
	public Hawk(String petName, int birdWeight, int birdHeight, boolean canFly) 
	{
		super(petName, birdWeight, birdHeight, canFly);
		weight = birdWeight;
	    height = birdHeight;
	}
	
	public boolean canFly() // overwrites canFly in Bird
	{
		return true;
	}
	
	public String toString()  // overwrites toString in Bird
	{
		return (super.toString() + " is a Hawk(Bird), weighing " + weight + " pounds");
	}
	
	public String speak()  // overwrites speak in Bird
	{
		
		return "SSSSwwwwaaaaa";
	}

	
	public String move() // overwrites move in Bird
	{
		
		return "Fa-fun fa-fun fa-fun";
	}

	
	public int setHeight() // overwrites setHeight in Bird
	{
		
		return height;
	}
	 
	public int setWeight()// overwrites setWeight in Bird
	{
	    return weight;
	  
	}
	

}
