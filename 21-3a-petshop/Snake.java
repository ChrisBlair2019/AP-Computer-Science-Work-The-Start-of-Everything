//Snake is a Pet
// Snake extends AbstrPets by defining the abstract methods as concrete
public class Snake  extends  AbstrPets

{
  private int length; //global variables for the class to be defined by the subsequent methods
  public int height;
  
  public Snake (String snakeName, int snakeLength, int snakeHeight)
  {
    super(snakeName);
    length = snakeLength;
    height = snakeHeight;
  }
  
  public int getLength()
  {
    return length;
  }
  
  public String toString () // Overrides method speak for Dog
  {
    return super.toString () + " is a snake, " + length + " feet long";
  }
  
  public String speak()  // defines abstract method   speak   for Snake
  {
    return "hiss !!";
  }
  
  public String move()  // defines abstract method  move  for Snake
  {
    return "slither";
  }

@Override
public int setHeight() 
{
	return height;
}
}