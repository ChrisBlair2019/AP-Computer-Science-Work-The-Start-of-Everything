//Cat is a pet therefore, it extends AbstractPets
//Cat extends AbstrPets by defining the abstract methods as concrete
public class Cat extends AbstrPets 
{

	 private int weight; //global variables for the class to be defined by the subsequent methods
	 private int height;
	   
	public Cat(String petName, int catWeight, int catHeight) 
	{
		super(petName);
		weight = catWeight;
	    height = catHeight;
	}

	
	public String speak() 
	{
		return "Meow";
	}

	
	public String move() 
	{
		return "*Jumps across room*";
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
		return (super.toString() + " is a cat, weighing " + weight + " pounds");
	}
	
	


}
