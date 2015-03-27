/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("tell me more about your pets") >= 0
				|| statement.indexOf("pets") >= 0
				|| statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0)
		{
			response = "Tell me more about your Pets.";
		}
		else if (statement.indexOf("friend") >= 0
				|| statement.indexOf("boyfriend") >= 0
				|| statement.indexOf("girlfriend") >= 0)
		{
			response = "Tell me more about your friends.";
		}
		else if (findKeyword("Teacher") >= 0
				|| findKeyword("Instructor") >= 0
				|| findKeyword("Mr. MacDonald") >= 0
				|| findKeyword("Mr. Mac") >= 0
				|| findkeyword("Professor") >= 0)
		{
			response = "He/She sounds like a good teacher";
		}
		else if (statement.indexOf("school") >= 0)
		{
			response = "Tell me about your school.";
		}
		else if (statement.indexOf("sports") >= 0)
		{
			response = "Do you play any sports.";
		}
		else
		{
			response = getRandomResponse();
		}
		if (statement.isEmpty() )
		{		
		 	 response = "Say something, please.";
		}
		 return response;
		
	}

	private int findkeyword(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int findKeyword(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Could you tell me more?";
		}
		else if (whichResponse == 5)
		{
			response = "How do you really feel about that?";
		}

		return response;
	}
}
