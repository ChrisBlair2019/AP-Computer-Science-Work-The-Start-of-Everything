// Dog IS A pet
// Dog extends AbstrPets by defining the abstract methods as concrete

public class Dog  extends  AbstrPets
{
   private int weight; //global variables for the class to be defined by the subsequent methods
   private int height;
   
   public Dog (String dogName, int dogWeight, int dogHeight)
   {
    super (dogName);  //  invokes the concrete constructor in the 
                      // abstract class  AbstrPets
    weight = dogWeight;
    height = dogHeight;
  }
  
  public int setWeight()
  {
    return weight;
  }
  
  public String toString()  // the closest toString method to the object
                            // is in play.  If this toString was absent,
                            // the obejct would use the toString in super.
  {
    return (super.toString() + " is a dog, weighing " + weight + " pounds");
  }
  
  public String speak()  // defines abstract method speak for Dog
  {
    return "woof !!";
  } 
  
  public String move()  // defines abstract method  move  for Dog
  {
    return  "run";
  }

  public int setHeight()  // defines abstract method setHeight  for Dog
  {
    return  height;
  }

  
}