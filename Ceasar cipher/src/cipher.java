import java.util.*;
public class cipher 
{

	public cipher(char[] letters, int[] numberValues)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence to be encypted, don't forget to remember the Cipher!!");
		
		String cipherSent = in.nextLine();
		
		System.out.println();
		
		System.out.println("Here is your word encrypted:");
		
		System.out.println(cipherTranscribe(cipherSent, letters, numberValues));
		
		System.out.println();
		
		System.out.println("Here is the original Alphabet format from letter number 1 to letter 26");
		System.out.println("The cipher generates a random alphabetical shift pattern, to encypt your message!");
		System.out.println();
		
		for(int index = 1; index <= letters.length-1; index++)
		{
			System.out.println( letters[index-1]+ " " +(index) );
		}
		
		System.out.println();
		System.out.println("Here is your newly created Cipher");
		System.out.println();
		
	}
	
	public void cipherCreator(char[] letters, int[] numberValues)
	{
		
		for(int index = numberValues.length-1; index >= 0; index--)
		{
			int randNumGen = ( (int) (Math.random() * (index + 1) ));
			
			int randNum = numberValues[randNumGen];
			
			numberValues[randNumGen] = numberValues[index];
			
			numberValues[index] = randNum;
			
		}
		
	}


	public String cipherTranscribe(String cipherSent ,char[] letters, int[] numberValues){
		
		cipherCreator(letters,numberValues);
		
		String lowerCipherSent = cipherSent.trim().toLowerCase(); 
		
		for(int index = 0; index <= cipherSent.length()-2; index++)
			{
				
				
			if(lowerCipherSent.substring(index, index +1).matches("a"))
				System.out.println(lowerCipherSent.replace('a', letters[numberValues[0]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("b"))
				System.out.println(lowerCipherSent.replace('b',letters[numberValues[1]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("c"))
				System.out.println(lowerCipherSent.replace('c', letters[numberValues[2]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("d"))
				System.out.println(lowerCipherSent.replace('d', letters[numberValues[3]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("e"))
				System.out.println(lowerCipherSent.replace('e', letters[numberValues[4]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("f"))
				System.out.println(lowerCipherSent.replace('f', letters[numberValues[5]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("g"))
				System.out.println(lowerCipherSent.replace('g', letters[numberValues[6]]));
		
			else if(lowerCipherSent.substring(index, index + 1).matches("h"))
				System.out.println(lowerCipherSent.replace('h', letters[numberValues[7]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("i"))
				System.out.println(lowerCipherSent.replace('i', letters[numberValues[8]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("j"))
				System.out.println(lowerCipherSent.replace('j', letters[numberValues[9]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("k"))
				System.out.println(lowerCipherSent.replace('k', letters[numberValues[10]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("l"))
				System.out.println(lowerCipherSent.replace('l', letters[numberValues[11]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("m"))
				System.out.println(lowerCipherSent.replace('m', letters[numberValues[12]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("n"))
				System.out.println(lowerCipherSent.replace('n', letters[numberValues[13]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("o"))
				System.out.println(lowerCipherSent.replace('o', letters[numberValues[14]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("p"))
				System.out.println(lowerCipherSent.replace('p', letters[numberValues[15]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("q"))
				System.out.println(lowerCipherSent.replace('q', letters[numberValues[16]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("r"))
				System.out.println(lowerCipherSent.replace('r', letters[numberValues[17]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("s"))
				System.out.println(lowerCipherSent.replace('s', letters[numberValues[18]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("t"))
				System.out.println(lowerCipherSent.replace('t', letters[numberValues[19]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("u"))
				System.out.println(lowerCipherSent.replace('u', letters[numberValues[20]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("v"))
				System.out.println(lowerCipherSent.replace('v', letters[numberValues[21]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("w"))
				System.out.println(lowerCipherSent.replace('w', letters[numberValues[22]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("x"))
				System.out.println(lowerCipherSent.replace('x', letters[numberValues[23]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("y"))
				System.out.println(lowerCipherSent.replace('y', letters[numberValues[24]]));
			
			else if(lowerCipherSent.substring(index, index + 1).matches("z"))
				System.out.println(lowerCipherSent.replace('z', letters[numberValues[25]]));
	
			}

		return lowerCipherSent;

	}
	
}





















































