public class Summation {

private static int low,high,result; //VARIABLES USED IN THIS CLASS.

//CONSTRUCTOR METHOD 1

public Summation(){

low=1;

high=10;

result = sum(low,high);

}

//CONSTRUCTOR METHOD 2

public Summation(int a, int b){

low = a;

high = b;

result = sum(low,high);

}

//STATIC METHOD FOR SUM

private static int sum(int a, int b){
// TYPE HERE THE CODE FOR THE RECURSIVE SUM.
	
	System.out.println("Lower Bound:" + " " + a + " " 
			+ "Upper Bound:" + " " + b);
	
	if(a == b)  										//Base condition for termination 
		return a;
	
	else
		System.out.println(a + " " + (sum(a+1,b)));
		return  a + (sum(a+1,b)); 						//Since a increments for each run of the method it will eventually be equal in value to the termination condition allowing it to run without throwing a StackOverflowError
	
}

public String toString(){

String a = "The recursive sum is: " + result;

return a;

}

}

//Name: Chris Blair
//School: Red Bank Catholic
//Date: 03/10/2015
//Assignment: 22.4b Revise it!