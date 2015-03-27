//Cat is a pet, Kitty is also a pet
//Kitty is a type of cat therefore, it extends cat

public class Kitty extends Cat
{

	private int weight; //global variables for the class to be defined by the subsequent methods
	 
	private int height;
	public Kitty(String petName, int catWeight, int catHeight) 
	{
		super(petName, catWeight, catHeight);
		weight = catWeight;
	    height = catHeight;
	}

	public String speak()  // overwrites speak in Cat
	{
		return "purrrrrrr";
	}

	
	public String move() // overwrites move in Cat
	{
		return "click-clack";
	}

	 public int setWeight() // overwrites setWeight in Cat
	  {
	    return weight;
	  }
	
	public int setHeight() // overwrites setHeight in Cat
	{
		return height;
	}
	
	public String toString()  
	{
		return (super.toString() + " is a Kitty(cat), weighing " + weight + " pounds");
	}
}
