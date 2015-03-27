package preob;


public class probset205b {

	public static void main(String[] args)
	{
		int[] Example1 = {1,2,3,4,5,6};
		
		int[] Example2 = {5,4,3,2,1,6};
		
		System.out.print(arenPermutations(Example1,Example2));
			
	}
	
	public static boolean arePermutations(int[] Example1, int[] Example2){
		
		//using a variation of the exchange sort algorithm to sort both arrays
		
		for(int x=0; x < Example1.length; x++)
			for(int y = x+1; y < Example1.length; y++)
				if(Example1[x] > Example1[y]){ //Sort in Ascending order
					int placeHolder;
					placeHolder = Example1[x]; //Stores the values in the placeholder to then exchange them later on for the 
					Example1[x] = Example1[y];
					Example1[y] = placeHolder;
				}
		
		for(int x=0; x < Example2.length; x++)
			for(int y = x+1; y < Example2.length; y++)
				if(Example2[x] > Example2[y]){
					int placeHolder;
					placeHolder = Example2[x];
					Example2[x] = Example2[y];
					Example2[y] = placeHolder;
				}
		for(int z = 0; z < Example1.length; z++)
			if(Example1[z] != Example2[z])
				return false;
		return true;
	}
	
	public static boolean arenPermutations(int[] Example1, int[] Example2){
		//Sort the Array before comparison to see if they are equal
		int startPositon;
		
		int placeHolder;
		for(int x = Example1.length-1; x > 0; x--)
		{
			startPositon = 0; //Starting position
			for(int y = 1; y <= x; y++) //Using a MIN_Value = 1 and the modular value of x as it decrements to select a integer
			{
				if(Example1[y] < Example1[startPositon])
				{
					startPositon = y;
				}
			}
		placeHolder = Example1[startPositon]; //Actual switch of integers 
		Example1[startPositon] = Example1[x];
		Example1[x] = placeHolder; //Values  being replaced
		}
		
		//Same as above except for the second array
		for(int x = Example2.length-1;x > 0; x--)
		{
			startPositon = 0;
			for(int y = 1; y <= x; y++)
			{
				if(Example2[y] < Example2[startPositon])
				{
					startPositon = y;
				}
			}
		placeHolder = Example2[startPositon];
		Example2[startPositon] = Example2[x];
		Example2[x] = placeHolder;
		}
		
		for(int z = 0; z < Example1.length; z++) //Comparison of both of the sorted arrays to see if they aren't equal
			if(Example1[z] != Example2[z])
				return false; //If they aren't permutations
		return true; //In any other case
		
			
		
	}
	

}



