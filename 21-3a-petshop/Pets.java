// Adapted from Java Software Solutions by Lewis/Loftus/Cocking

// Demonstrates the useof Abstract Classes

// Instantiates objects of type pet and prints information
public class Pets
{
  public static void main(String Args[])
  {
    Dog fido =new Dog ("Fido", 45, 50); //Height is in cm
    Snake sam = new Snake("Sam", 6, 1);
    Cat matt = new Cat("Matt" , 20, 12);
    Bird tim = new Bird("Tim", 6, 3, true);
    
    
    System.out.println(fido);
    System.out.println(fido.getName() + " " + "says " + fido.speak());
    System.out.println(fido.move() + " " + fido.getName() + " " + fido.move());
    System.out.println();
    
    System.out.println(sam);
    System.out.println(sam.getName() + " " + "says " + sam.speak());
    System.out.println(sam.move() + " " + sam.getName() + " " + sam.move());
    System.out.println();
    
    System.out.println(matt);
    System.out.println(matt.getName() + " " + "says " + matt.speak());
    System.out.println(matt.move() + " " + matt.getName() + " " + matt.move());
    System.out.println();
    
    System.out.println(tim);
    System.out.println(tim.getName() + " " + "says " + tim.speak());
    System.out.println(tim.move() + " " + tim.getName() + " " + tim.move());
    System.out.println("Do you think I can fly, I think I can" + " " + tim.canFly());
    System.out.println();
    
    //Dogs on the wing
    Chihuahua pero  = new Chihuahua ("El Guapo", 2, 21);
    pero.setPlace("Ciudad Juarez");
    System.out.println(pero + " from " + pero.cityOfOrigin());
    System.out.println(pero.getName() + " " + "says " + pero.speak());
    System.out.println(pero.move() + " " + pero.getName() + " " + pero.move());
    System.out.println(pero.setHeight());
    System.out.println(pero.toString());
    System.out.println();
    
    Labrador teddy = new Labrador("Teddy" , 5 , 56);
    teddy.setPlace("New Jersey");
    System.out.println(teddy + " from " + teddy.cityOfOrigin());
    System.out.println(teddy.getName() + " " + "says " + teddy.speak());
    System.out.println(teddy.move() + " " + teddy.getName() + " " + teddy.move());
    System.out.println(teddy.setHeight());
    System.out.println(teddy.toString());
    System.out.println();
    
    //Snakes on a Plane
    Cobra jeffery = new Cobra("Jeffery the Honorable" , 12, 3);
    System.out.println(jeffery.getName() + " " + " He lives in the"+ jeffery.whereIsIt());
    System.out.println(jeffery.getName() + " " + "Is over" + jeffery.setHeight() + " " + "cm tall" + " " + "Wow");
    System.out.println(jeffery.getName() + " " + "has something to say to you" + jeffery.speak());
    System.out.println(jeffery.getName() + " " + jeffery.move() + "AAHHHH!!!");
    System.out.println("I don't think jeffery is poisonious... Lemme Check" + " " + jeffery.isPoisonious());
    System.out.println(jeffery.toString());
    System.out.println();
    
    //Cats
    Kitty kat = new Kitty("James" , 16, 9);
    System.out.println(kat.toString());
    System.out.println(kat.getName() + " " + "and I say" + " " + kat.speak());
    System.out.println("Im going to the family room" + " " + kat.move());
    System.out.println("Hello, I am " + " " + kat.setHeight() + "cm tall");
    System.out.println();
    
    Tiger bob = new Tiger("Bob" , 16, 9);
    System.out.println(bob.toString());
    System.out.println(bob.getName() + " " + "and I say" + " " + bob.speak());
    System.out.println("I just wanna run" + " " + bob.move());
    System.out.println("Hello, I am " + " " + bob.setHeight() + "cm tall");
    System.out.println("I am from:" + " " + bob.whereAmI());
    System.out.println();
    
    //Birds
    Hawk john = new Hawk("John",5,7,true);
    System.out.println("Hello" + " " + john.toString());
    System.out.println("Do you think I can fly, I think I can" + " " + john.canFly());
    System.out.println("I have something to say!" + " " + john.speak());
    System.out.println("I feel like going for a brisk fly" + " " + john.move());
    System.out.println("I think I'm about" + " " + john.setHeight()+ " " + "cm tall");
    System.out.println("I think I'm about" + " " + john.setWeight() + "Pounds");
    System.out.println();
 
    BaldEagle mike = new BaldEagle("Mike", 7 , 9, true);
    System.out.println("Hello" + " " + mike.toString());
    System.out.println("Do you think I can fly, I think I can" + " " + mike.canFly());
    System.out.println("I have something to say!" + " " + mike.speak());
    System.out.println("I feel like going for a brisk fly" + " " + mike.move());
    System.out.println("I think I'm about" + " " + mike.setHeight()+ " " + "cm tall");
    System.out.println("I think I'm about" + " " + mike.setWeight() + "Pounds");
    System.out.println();
    
  }
}
    
     
   
