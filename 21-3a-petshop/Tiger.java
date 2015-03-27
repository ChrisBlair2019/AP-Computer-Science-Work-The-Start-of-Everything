//Cat is a Pet, therefore, since Tiger is a type of Cat it extends cat
public class Tiger extends Cat 
{
	private int weight;
	//global variables for the class to be defined by the subsequent methods
	private int height;

	public Tiger(String petName, int tigerWeight, int tigerHeight) 
	{
		super(petName, tigerWeight, tigerHeight);
		weight = tigerWeight;
	    height = tigerHeight;
	}
	
	public String speak()
	{
		return "RAWR";
		
	}
	
	public String move()
	{
		return "DA-DUM DA-DUM DADUMDAUM";
	}
	
	public int setWeight()
	  {
	    return weight;
	  }
	
	public int setHeight() 
	{
		return height;
	}
	
	public String toString()  
	{
		return (super.toString() + " is a Tiger(cat), weighing " + weight + " pounds");
	}
	
	public String whereAmI(){
		return "I am from Africa!";
	}

}
