package preob;

import java.util.Random;

public class probset205 {

	public static void main(String[] args)
	{
		Random numGen = new Random();
		int randNum = numGen.nextInt(3);
		System.out.println(randNum); //Printing for debugging
		HTflop(randNum);
	}

	public static String HTflop(int randNum)
	{
		if(randNum != 0)
		{
			System.out.println("The flip is Heads"); //If the number is 1 or 2 it is heads 
			return "heads";
		}
		else
			
			System.out.println("The flip is Tails"); //If the number is 0 it is tails
			return "tails";
		
	}
	
	

}

