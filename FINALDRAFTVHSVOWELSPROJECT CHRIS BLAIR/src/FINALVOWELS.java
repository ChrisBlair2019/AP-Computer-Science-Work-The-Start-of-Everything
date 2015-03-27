
	import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


	public class FINALVOWELS {
		
		private void FileInputProgramRunner() throws IOException 
		{
			String[] FileInput; 												//Array that handles the data gathered by the StrinInputData method whose argument is the buffered reader returned by the inititalzieFile method 
			FileInput = this.StringInputData(this.inititalzieFile()); 			//Creates the Array that is delineated as StringArray, this Array gathers the Strings for manipulation using the methods InitializeFile and StringInputData
			
			//Update to the method, Suggested by Jack Wrenn
			
			for(int a = 0; a < FileInput.length; a++) //Made a small change from the original method from "a<=FileInput.Length" to "a<FileInput.Length"
			{
					if(FileInput != null) 
			    {

			        FINALVOWELS.StringProcessData(FileInput[a]);

			    }

			}
			
			//Old method of Inputting
			/** 
			if(FileInput != null)
			{
				FINALVOWELS.StringProcessData(FileInput[0]); 					//Processes the Data for the first string
			}
		
			if(FileInput != null)
			{
				FINALVOWELS.StringProcessData(FileInput[1]); 					//Processes the Data for the second string
			}
			
			if(FileInput != null)
			{
				FINALVOWELS.StringProcessData(FileInput[2]);					//Processes the Data for the third String 
			}
			
			if(FileInput != null)
			{
				FINALVOWELS.StringProcessData(FileInput[3]);					//Processes the Data for the fourth String
			}
			
			while(FileInput.length>4)
			{
				int count = 4;
				count++;
				FINALVOWELS.StringProcessData(FileInput[count]); 				//This accounts for the chance that the user wants to enter a amount that is greater than the array delineated in this event it would scale to the given amount in which the user changed
			}
			**/
			return; 															//Returns nothing
		}
			
		public BufferedReader inititalzieFile() throws IOException
		{
			FileInputStream FileReader;
			InputStreamReader TextStreamReader;
			BufferedReader Textreader;
			
			
			FileReader = new FileInputStream ("C:\\!!JavaDownload\\vowels.txt");			//This opens the connection to the data file
			TextStreamReader = new InputStreamReader(FileReader); 
			return Textreader = new BufferedReader(TextStreamReader); 						//Creates and returns a buffered reader that uses the input and reads it line by line as delineated in the next method
		    
		    
		}
		
		public String[] StringInputData(BufferedReader Textreader) throws IOException //The argument for this 
		{
			String OriginalLine = Textreader.readLine(); 				//Uses the Buffered Reader to take the line by 
			String StringArray[] = new String[10];						//Creates Array that handles taking the Text for the TextFile
			for(int x = 0; x < StringArray.length; x++) //NEW CHANGE: IMPLEMENTEDED A FOR ARRAY TO MODULARIZE INPUT FOR ANY SIZE.
			{
				if(OriginalLine != null) 								//Reads until it reaches an input that is defined by the buffered Reader as "null"
				{
				StringArray[x]=OriginalLine;							//These are the building blocks for the String Array that we will use in the next method, they use the buffered reader to read the line of Input and resolve a string. So this would be the first String
				OriginalLine = Textreader.readLine();	
				}
			}
			
			return StringArray; 										//Returns the StringArray which is used in the FileInputProgramRunner Method which then runs it through the StringProcessData Method
			
		}

		public static String[] StringProcessData(String OriginalLine) throws IOException
		{
			StringTokenizer StringSplitter = new StringTokenizer(OriginalLine); 			//Intitilizes new StringTokenizer for usage regarding chopping up the String OriginalLine which is the argument for this method
			
			String[] StringArray = new String[100]; 											//This delineates and recreates the StringArray using separation by whitespace/blankspace character, as in, separates the original string by way of Prefix and Suffix, I just put 100 to account for any possible amount of words
		
			
			StringArray[0] = StringSplitter.nextToken();									//StringTokenizer uses the blank/white space delimiter to separate the String into tokens
			StringArray[1] = StringSplitter.nextToken();									//Both these methods feed into the Array which then delineates them. 
																							//This delineation leads into either position 0 meaning that the StringTokenizer found the first delimiter after the string and considers it the prefix or position 1 meaning that it considers it a Suffix.
			StringProcessVowels(StringArray);
			return StringArray;
		}
		
			
			public static String StringProcessVowels(String StringArray[]) throws IOException
	{
			
				String OriginalPrefix = StringArray[0];											//Delineates the First token read and tokenized as the Prefix and the Last part of the string read and tokenized
				String OriginalSuffix = StringArray[1];
				 
				
				String VowelEnd = OriginalPrefix.substring(OriginalPrefix.length()-1, OriginalPrefix.length());		//String Variables that are assigned a certain position that are used in the method to detect vowels/consonants and subsequently execute the proper operation based on the conditions
				String DoubleVowelEnd = OriginalPrefix.substring(OriginalPrefix.length()-2, OriginalPrefix.length()-1);
				String Suffixvowelcheck = OriginalSuffix.substring(0,1);
			
				String ChangedPluralform = new String(); 													//Creates Strings to be later defined by their respective mutations in the processes defined below
				String ChangedSuffixForm = new String();
				
				
				
			//In order for this process to be triggered the OriginalPrefix must end in either double vowels (ACSL) or double consonants NOT(ACSL)
			if(VowelCheck(VowelEnd) && VowelCheck(DoubleVowelEnd)  
						|| !VowelCheck(VowelEnd) && !VowelCheck(DoubleVowelEnd))
			{
				
				//In order for this sub-condition to be triggered the prefix must end with either two Vowels or two consonants, and the Suffix Starts with a Vowel
					if(VowelCheck(Suffixvowelcheck))
					{
						ChangedPluralform = OriginalPrefix + OriginalPrefix.charAt(OriginalPrefix.length()-1) + "H";		 //Adds the original Prefix which remains unchanged, then takes the last character in the prefix adds it to the String, then adds "H"
						ChangedSuffixForm = OriginalPrefix + OriginalSuffix.charAt(0) + OriginalSuffix; 					//Adds the original Original Prefix, then adds the first character in that prefix then adds the suffix
					}
					
					//In order for this sub-condition to be triggered the prefix must end with either two Vowels or two consonants, and the Suffix starts with a consonant
					else if(!VowelCheck(Suffixvowelcheck))
					{
						ChangedPluralform = OriginalPrefix + OriginalPrefix.charAt(OriginalPrefix.length()-1) + "H";   	//Redundant, see above comment
						ChangedSuffixForm = OriginalPrefix.substring(0, OriginalPrefix.length()-2)+ 					//First, it adds the substring of from the beginning and truncates two characters in the string, it then reinserts the final character, finally it adds the suffix  
								OriginalPrefix.charAt(OriginalPrefix.length()-1) + OriginalSuffix;
					}
			}
	
						
			
			//In order for this process to be triggered the OriginalPrefix must end in a Single Consonant
			else if(!VowelCheck(VowelEnd))
			{
				ChangedPluralform = OriginalPrefix + "GH"; 				//Adds "GH" to the OriginalPrefix 
				ChangedSuffixForm = OriginalPrefix + OriginalSuffix;	//Due to the redundancy of actions in both sub-condition only one string needs to be created in order to suffice both sub-conditions
			}
		
			
			
			//In order for this process to be triggered the OriginalPrefix must end in a Single Vowel
			else if(VowelCheck(VowelEnd))
			{
				//In order for this sub-condition to be triggered the prefix must end in a singular Vowel and Suffix Starts with a Vowel
				if(VowelCheck(VowelEnd) && VowelCheck(Suffixvowelcheck))
				{
				ChangedPluralform = OriginalPrefix.replace(OriginalPrefix.charAt(OriginalPrefix.length()-1), 'G'); 				//This uses the replace method to truncate the final character in the OriginalPrefix and replaces it with a "G"
				ChangedSuffixForm = OriginalPrefix + OriginalSuffix.replace(OriginalSuffix, OriginalSuffix.substring(1,2));		//This Adds the Prefix to the String, then it takes the Suffix and replaces the whole thing with the last letter of the suffix 
				}
		
				//In order for this sub-condition to be triggered the prefix must end in a Singular Vowel and Suffix starts with a Consonant
				else if(VowelCheck(VowelEnd) && !VowelCheck(Suffixvowelcheck))
				{
				ChangedPluralform = OriginalPrefix.replace(OriginalPrefix.charAt(OriginalPrefix.length()-1), 'G');				//Redundant, See above comment
				ChangedSuffixForm = OriginalPrefix + OriginalSuffix.charAt(0) + OriginalSuffix;									//This adds the first word to the String, then takes the first character 
				}
			}
			
			PrintOutputs(ChangedPluralform, ChangedSuffixForm, OriginalSuffix, OriginalPrefix);
			return ChangedPluralform + ChangedSuffixForm;
			
	}
			//System.out.println(StringOP); These show the results of the StringTokenized outputs 
			//System.out.println(StringOS);
			
			public static void PrintOutputs(String ChangedPluralform, String ChangedSuffixForm, String OriginalSuffix, String OriginalPrefix)
			{
			System.out.println("Outputs:");
			System.out.println("This is the original String:" + " " + OriginalPrefix + OriginalSuffix); //Due to the String declaration in the beginning and the nature of the method, it runs through this method with each String and forms a new String on each pass by, 
			System.out.println("This is the New Plural Output:" + " " + ChangedPluralform); 			//here is where the Strings all the original,plural,and suffix are printed
			System.out.println("This is the New Suffix Output" + " " + ChangedSuffixForm);
			}
		
	
		
		public static boolean VowelCheck(String vowel) throws IOException
		{
			if(vowel.matches("A") || vowel.matches("a") || vowel.matches("C") || vowel.matches("c") 
			|| vowel.matches("S") || vowel.matches("s") || vowel.matches("L") || vowel.matches("l"))	//All possible vowels checks for uppercase and lowercase combinations, return either true or false
				return true; 		//If vowels
			return false;			//If Consonants
			
		}
		
		
		public static void main(String[] args) throws IOException
		{
			FINALVOWELS Runner = new FINALVOWELS(); 	//Declaring new object, intitilze constructor due to the fact that the class has no constructor
			Runner.FileInputProgramRunner(); 			//Runs/Calls the Method
		}
	}

	
	
	//Name:Chris Blair
	//School: Red Bank Catholic
	//Date: 2/16/2015
	//Revise it 17.4b

