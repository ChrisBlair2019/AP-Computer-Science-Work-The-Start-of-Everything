/*
Simulate the game of lucky sevens until all funds are depleted.
1) Rules:
        roll two dice
        if the sum equals 7, win $4, else lose $1
2) The inputs are:
        the amount of money the user is prepared to lose 
3) Computations:
        use the random number generator to simulate rolling the dice
        loop until the funds are depleted 
        count the number of rolls
4) The outputs are:
        the average number of rolls it takes to deplete the funds over 100 different simulations
*/

import java.util.Scanner;
import java.util.Random;

public class lucky7reedo {


	   public static void main (String [] args) {
	  
	      Scanner reader = new Scanner(System.in);
	      Random generator = new Random();
	   
	      int die1, die2,       // two dice
	          dollars,          // initial number of dollars (input)
	          count1,totalcount, ExperimentDollars,  // Two variables, both used for the aggregation of the total count          
	          AVGROLLRESULT;       // Average rolls result

	      // Request the user input
	      System.out.print("How many dollars do you have? ");
	      ExperimentDollars = reader.nextInt();
	   
	      // Initialize variables
	      totalcount = 0;
	      AVGROLLRESULT = 0;
	      
	      // Loop until the money is gone, for loop iteration 100 times   
	      
	      for(int i = 1; i <= 100; i++)
	      {
	    	  count1 = 0; //Keeps the count reset after each loop iteration.
	    	  dollars = ExperimentDollars; //Value keeps the dollars as a static non-changing count enabling the program to run mutiple simulations without having to have the user input a variable 100 times
	    	  
	    	  while (dollars > 0)
	    	  {
	    	
	    		  
	         count1++; //number of rolls it takes to go broke
	         
	         // Rolls the dice.
	         die1 = generator.nextInt (6) + 1; // 1-6 random number generation
	         die2 = generator.nextInt (6) + 1; // 1-6 random number generation
	     
	         
	         // Calculate the winnings or losses
	         if (die1 + die2 == 7)
	            dollars += 4;
	         else 
	            dollars -= 1; 
	         }
	    	  //System.out.println(count1); this shows that over the interval of 100 is produces different 100 simulations
	    	  totalcount = count1 + totalcount; //Keeps a running tally of the count with each loop iteration
	    	}
	     
	      // Average result calculation 
	      AVGROLLRESULT = totalcount/100;
	      
	      // Display the results.
	     // System.out.println( "This is the total count" + " " + totalcount); //For debugging
	      System.out.println();
	      System.out.println 
	         ("You are broke, on average after " + AVGROLLRESULT  + " rolls.\n"); //Displays the average rolls before going broke
	      System.out.println("If you or someone you know has a gambling problem call 1-800-GAMBLER"); //Obligatory Gambling Addiction statement
	}}

	//Name: Chris Blair
	//School: Red Bank Catholic
	//Project: 12.4b Program it
	//Date: 12/17/14



