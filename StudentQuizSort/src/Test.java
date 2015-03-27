import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Test extends Student {

	
	      private static FileInputStream inFile;
		  private static InputStreamReader inReader;
		  private static  BufferedReader reader;

		  
		 private static List<Student> classroom = new ArrayList<Student>(); // ArrayList to store the classroom.
		  
		  
		  
		  

			  public static void main (String args[]) throws IOException
			  {
			    initFile();  
			    getData();
			    System.out.println(classroom + "\n");  //output of the complete class.
			   sort(classroom);
			    System.out.println();
			    System.out.println("Sorted");
			    System.out.println(classroom + "\n");
			  //output after sorting.
			    System.out.println("Sorted list with grades:");
			    Grader(classroom);
			    inFile.close();
			    
			  }
			 
			 // preparing the file for input
			 
			  public static void initFile() throws IOException

			  
			  {
			    inFile = new FileInputStream ("c:\\!!VHSAPCSData\\truefalse.txt");
			    inReader = new InputStreamReader(inFile);
			    reader = new BufferedReader(inReader);
			    
			  }
	
			  
			  //  Separate the id from the answers and store the answers in an array.
			  
			  public static void getData() throws IOException
			  {
			    String line = reader.readLine();  //Seed
			    
			    String[] answerkey = new String[10];  //Store the answer key from the first line of the txt file.
			    
			    for(int i=0; i<answerkey.length; i++){ // take that line and place each answer in an array.
			    	
			    	answerkey[i]=line.substring(i,i+1);			    	
			    }
			    
			    line = reader.readLine();    // read the following line of the txt file.
			    			     
			                                
			    while(line != null)   // Read and create a student for each line.
			    {
			      String[] answers = new String[10];
			      StringTokenizer strTkn = new StringTokenizer(line); 
			      String id = strTkn.nextToken();
			      String answerline = strTkn.nextToken();
			      
						      
			      for(int i=0; i<answers.length; i++){
			    	  
			    	  answers[i]=answerline.substring(i, i+1);
			    	  
			      }
			      
			      Student stu = new Student(id,answers);
			      
			      stu.grade(answerkey, answers);
			      
			      classroom.add(stu);        
			      line = reader.readLine();   //updating what is being read
			                                  
			    }
			    
			  }
			 
			  /** Description of Sort 
				 * Selection Sort
				 * Locates largest element 
				 * Switches largest found 
				 * Akin to bubble sort the larger values percolate to the bottom or end of the sorted list
				 * @param classroom
				 * Used for the input list of the student in the classroom, aggregates all data 
				 * Used assessor method getScore to access grades
				 * Tempswapper is used as to hold the current exchange value
				 * 
				 */
			public static void sort(List<Student> classroom){
				int index1;
				int index2;
				int elementOne;
				Student tempswapper;
				
				for(index1 = classroom.size() -1; index1 > 0; index1--  ){
					elementOne = 0;
					for(index2 = 1; index2 <= index1; index2++){
						if(classroom.get(index2).getScore() > classroom.get(elementOne).getScore())
							elementOne = index2;
					}
					tempswapper = classroom.get(elementOne);
					classroom.set(elementOne, classroom.get(index1));
					classroom.set(index1, tempswapper);
				
				
				}
			}
				  
			/**Description of Grader
			 * Cycles through the whole list indeterminate of size 
			 * Assign grade based on if certain conditions are met then prints out the result in a list
			 * @param classroom
			 * Used for the input list of the student in the classroom, aggregates all data 
			 * Used assessor method getScore to access grades
			 */
			public static void Grader(List<Student> classroom)
			{
					for(int index = 0; index < classroom.size(); index++){
					if(classroom.get(index).getScore() == 100){
						System.out.println( classroom.get(index) + " " + "Your grade is:" + "A" + "\n" );
					}
					else if(classroom.get(index).getScore() == 90){
						System.out.println( classroom.get(index) + " " + "Your grade is:" + "B" + "\n" );
					}
					else if(classroom.get(index).getScore() >= 70 && classroom.get(index).getScore() <= 80 ){
						System.out.println( classroom.get(index) + " " + "Your grade is:" + "C" + "\n");
					}
					else if(classroom.get(index).getScore() >= 50 && classroom.get(index).getScore() <= 60){
						System.out.println( classroom.get(index) + " " + "Your grade is:" + "D" + "\n" );
					}
					else if(classroom.get(index).getScore() >= 0 && classroom.get(index).getScore() <= 40){
						System.out.println( classroom.get(index) + " " + "Your grade is:" + "F" + "\n" );
					}
				}
			}
}



/**Name: Chris Blair
 * School: Red Bank Catholic
 * Assignment: 26.4 Program it!
 * Date:3/25/2015
 */



















