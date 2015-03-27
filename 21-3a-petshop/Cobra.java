//Snake is a pet
//Cobra is a type of snake and therefore is a pet and extends Snake
public class Cobra extends Snake {
	
	public int height;//global variables for the class to be defined by the subsequent methods

	public Cobra(String snakeName, int snakeLength, int snakeHeight) 
	{
		super(snakeName, snakeLength, snakeHeight);
		height = snakeHeight;
	}
	
	 public String speak()  // overwrites speak in Sanke
	  {
	    return "RADDLE RADDLE hzzzzzzzzzzz";
	  }
	 
	  public String move()  // overwrites move in Snake
	  {
	    return "*JUMPS AT YOU*";
	  }
	  
	  public int setHeight() // overwrites setHeight in Snake
	  {
	  	return height;
	  }
	  
	  public String isPoisonious(){
		  return "Oh NO!!! HES Exteremly Poisonious!!!";
	  }
	  
	  public String whereIsIt(){
		  return "Mojave Desert";
	  }
	  
	  
	

}
