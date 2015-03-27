import java.util.Scanner;


public class cipherTester {

	public static void main(String[] args)
	{
		char ch;
		char[] letters = new char[27];
		int[] values = new int[26];
		for(int index = 0; index <= letters.length-1; index++)
			for(ch = 'z'; ch >= 'a'; ch--)
				letters[ch- 'a'] = ch ;
		
		for(int index = 0; index <= values.length-1; index++)
			values[index] = index + 1;
			
		cipher aveTrue = new cipher(letters, values);
		
		//aveTrue.cipherCreator(values);
		
		
		for(int index = 0; index <= values.length-1; index++)
			System.out.println(letters[index] + " " + values[index]);
	
		
		
	
	}
	
}
