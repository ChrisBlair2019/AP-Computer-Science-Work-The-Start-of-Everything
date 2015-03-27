/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
	
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		int notFoundPsn = sample.indexOf ("slow");

		System.out.println ("sample.indexOf(\"slow\") = " + notFoundPsn);
		
		int PositionAtZero = sample.indexOf("he", 10);

		System.out.println("sample.indexOf(\"he\") = " + PositionAtZero);
		
		int result;
		 result = findKeyword("She's my sister", "sister", 0);
		
		System.out.println(result); 


	}}


/* The number one thing when it comes to the need to prioritize responses is order. As if you were waiting in line at the grocery store, you wouldn't be served until you reach the front of the line or after your name is called. With this example in mind it can be inferred that the order in which the statements are put in the code is the order that they will be assigned when it comes to responses. However; the new findKeyword  method allows us to disregard that because it's prioritization is based on the finding the keywords not indexing the response. */