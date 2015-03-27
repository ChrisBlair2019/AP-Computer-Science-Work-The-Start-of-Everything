//Bird is a type of Pet therefore, it extends AbstractPets
//Bird extends AbstrPets by defining the abstract methods as concrete
public class Bird extends AbstrPets
{

	private int weight;
	//global variables for the class to be defined by the subsequent methods
	private int height;
	 
	public Bird(String petName, int birdWeight, int birdHeight, boolean canFly)
	{
		super(petName);
		weight = birdWeight;
	    height = birdHeight;
		
	}

	
	public String speak() // implements speak in Bird
	{
		
		return "Swack";
	}

	
	public String move() // implements move in Bird
	{
		
		return "*flaps*";
	}

	
	public int setHeight() // implements setHeight in Bird
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
	
	public String toString()  // overwrites toString in AbstractPets
	{
		return (super.toString() + " is a Bird, weighing " + weight + " pounds"); 
	}

}
