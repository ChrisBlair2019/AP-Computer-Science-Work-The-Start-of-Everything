
public class Labrador extends Dog
{
	private String whereFrom; //global variables for the class to be defined by the subsequent methods
	public int thedogHeight;
	
	public Labrador(String dogName, int dogWeight, int dogHeight) 
	{
		super(dogName, dogWeight, dogHeight);
		thedogHeight = dogHeight;
	}
	
	public void setPlace(String location){
		whereFrom = location;
	}
	
	public String speak() // overwrites speak in Dog
	{
		return "Bark!! Bark!!";
	}
	
	public String move() // overwrites move in Dog
	{
		return "All out sprint!!";
	}
	
	public String cityOfOrigin(){
		return whereFrom;
	}
	
	public String whoWantsATreat(){
		return "Me! I would get it myself but I don't have thumbs!";
	}
	
	 public int setHeight()	// overwrites setHeight in Dog
		{
		 	return thedogHeight;
			
		}
	
	

}
