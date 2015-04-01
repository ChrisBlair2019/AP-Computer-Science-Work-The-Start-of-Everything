import java.util.*;


public class Student {
	
	public String id;
	public String [] quizresult=new String[10]; 
	public int score;
	
	
	/**
	 * Initializes the student constructor 
	 */
	public Student(){
		
		id=" ";
		for(int i =0; i<quizresult.length; i++){
		     quizresult[i]="";
		     			
		}
		
		score =0;
	}
	
	
	/**
	 * Description of Student
	 * This is the constructor method for the Student class it takes to two unique thing to each student
	 * @param a
	 * a = The students ID, the quiz result, and their score
	 * @param answers
	 * answer = aggregates the students answers to the given questions and stores each single answer as an index in a string array
	 * Sets score equal to 0 for each student created to be later redefined and mutated by the grade method.
	 */
	public Student(String a, String[] answers){
		
		id=a;
		
		for(int i=0; i<answers.length; i++){
			
			quizresult[i]=answers[i];
			
		}
		
		score = 0;
		
	}
	
	/**
	 * Accessor method for quizresult
	 * @return quizresult
	 */
	public String [] getAnwers(){
		
		return quizresult;
		
	}
	/**
	 * Accessor method for ID
	 * @return id
	 */
	public String getId(){
		
		return id;
		
	}
	
	/**
	 * Grades the answers given by the students, compares the result to the answer key 
	 * if the answer is correct the student gains 10 points, if incorrect they gain none
	 * then set the variable score, a global variable equivalent to count 
	 * @param answerkey The correct answer to the quiz use to compare to the student answer key in order to count true amount of correct answers
	 * @param studentanswer The unique portion of information that each students gets, used to compare to the answer key that then gives them a score based on correctness
	 */
	public void grade(String [] answerkey, String[] studentanswer){
		
		int count=0;
		
				for(int i=0; i<answerkey.length; i++){
					
					if(answerkey[i].equals(studentanswer[i])){
						
						count = count+10;
						
					}
					
				}
		
				score = count;
		
		
	}
	
		/**
		 * Accessor Method
		 * @return score
		 */
	  public int getScore(){
		  return score;
	  }
	  
	  /**
	   * Takes all of the variables and gives a formatted string for each student
	   * @return String of formatted data containing the ID the quizresult (T or F) and the score
	   */
	  public String toString(){
		  
			String a = "Student id: " + id + " " +  Arrays.toString(quizresult) + " The score for this quiz is:  " +  score + "\n";
			
			return a;
				}

}
	
	


