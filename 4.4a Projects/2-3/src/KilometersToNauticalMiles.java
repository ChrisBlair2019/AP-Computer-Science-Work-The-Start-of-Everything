
import java.util.Scanner;

public class KilometersToNauticalMiles {

	public static void main(String [] args){
		
		Scanner reader = new Scanner(System.in);
		double kilometer;
		double nauticalmile;
		
		System.out.print("Enter kilometers: ");
		
		
		kilometer = reader.nextDouble();
		
		
		nauticalmile = kilometer * 0.54;
		
		
		
		System.out.print("The equivalent in nautical miles is ");
		System.out.println(nauticalmile);
	}
}
/* Author: Jeff Holm
Project: Kilometers to Nautical Miles
Date: September 30, 2014 */