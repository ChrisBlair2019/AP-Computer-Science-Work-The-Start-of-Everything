//Dog is a pet
//Chihuahua is a type of dog, therefore it is a pet
//Chihuahua then extends dog

public class Chihuahua extends Dog  // concrete classes as well as
                                    // abstract classes can be extended by 
                                    // another class
{
  private String whereFrom; //global variables for the class to be defined by the subsequent methods
  public int thedogHeight;
  
  public Chihuahua (String dogName, int dogWeight, int dogHeight)
  {
	  super(dogName, dogWeight, dogHeight);
	  thedogHeight = dogHeight;
  }
  
  public void setPlace(String location)
  {
    whereFrom = location;
  }
  
  public String speak()  // overwrites speak in Dog
  {
    return "chalupa!!";
  } 
  
  public String move()  // overwrites move in Dog
  {
    return  "little tiny steps";
  }
  
  public String cityOfOrigin()
  {
    return whereFrom;
  }  
  public int setHeight() // overwrites setheight in Dog
	{
	  return thedogHeight;
		
	}
  
}