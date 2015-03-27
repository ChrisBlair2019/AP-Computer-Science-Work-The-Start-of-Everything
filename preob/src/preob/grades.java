package preob;

public class grades {

	public grades(int i) 
	{
		
	}
	public static void main(String[] args)
	{
		grades[] gradesArray = new grades[4];
		int[] gradesarray = {100,90,80,70,60};
		grades CGrade = new grades(100);
		
		for(int index = 0; index < gradesArray.length; index++)
			gradesArray[index] = new grades(90 + index);
		
		System.out.println(searcher(gradesarray, 90));
	}
	static int searcher (int[] numbers, int correctValue){
		for(int index = 0; index < numbers.length; index++)
			if(correctValue < numbers[index])
				return -1;
			else if(correctValue == numbers[index] )
				return index;
		
	}
	
}

