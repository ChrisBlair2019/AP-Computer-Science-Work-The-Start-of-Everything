import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class StudentMergeQuick extends Student {

	
	      private static FileInputStream inFile;
		  private static InputStreamReader inReader;
		  private static  BufferedReader reader;

		  
		 private static List<Student> classroom = new ArrayList<Student>(); // ArrayList to store the classroom.
		  
		  
		  
		  

			  public static void main (String args[]) throws IOException
			  {
			    initFile();  
			    getData();
			  System.out.println(classroom + "\n");  //output of the complete class.
			  // sort(classroom);	//Old O(n^2) sort
			   
			 //   System.out.println();
			 //   System.out.println("Sorted");
			 //   System.out.println(classroom + "\n");
			  //output after sorting.
			 //   System.out.println("Sorted list with grades:");
			    
			  //  Grader(classroom);
			    
			    
			    
			    
			    
			    
			    //New Sorts
			    Scanner input = new Scanner(System.in);
			    System.out.println("Below please enter a 1 if you would like to use a mergesort to sort the list or a 2 if you would want to use a quicksort to sort the list");
			    String a = input.nextLine();
			    if(a.compareTo("1") == 0){
			    	Mergesort(classroom);
			    }
			    else if(a.compareTo("2") == 0){
			    	Quicksort(classroom);
			    	 System.out.println(classroom + "\n");
			    }
			    else if(a.compareTo("1") != 0 && a.compareTo("2") != 0){
			    	System.out.println("Please enter a value input");
			    	a = input.nextLine();
			    }
			    
			    
			    
			    
			    
			    
			    
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
			public static void sort(List<Student> classroom, int index1, int index2){
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

			/**
			 * Utilizes a stack to index and partition the lists and sort them
			 * @param Classroom
			 * Used for the input list of the student in the classroom, aggregates all data 
			 * Used assessor method getScore to access grades
			 */
			public static void Quicksort(List<Student> Classroom){
				
				Stack<Integer> tempStack = new Stack<Integer>();
				tempStack.push(0); 							//First element in the list
				tempStack.push(Classroom.size());			//last element in the list
				
				while(!tempStack.empty()){
					int last = tempStack.pop(); //Removes the values in order to utilize them as the INT_MIN and INT_MAX values
					int first = tempStack.pop();
					
					if(last - first < 2) //If the array has reach a size of 1 it is then considered sorted or else it isn't considered sorted by quicksort
						continue;
					int paritioner = first + ((last - first) / 2);					//127/2 = 63 pivot index aka the partitioner
					paritioner = Partitioner(Classroom,paritioner, first, last);
					
					//Sorts the list by pushing the correct values onto the stack
					tempStack.push(paritioner + 1);
					tempStack.push(last);
					tempStack.push(first);
					tempStack.push(paritioner);
					
					//For Debug
					//System.out.print(tempStack);
					
				}
			}
			
			/**
			 * Partitions the array based on indices swaps values to ultimately sort the array. 
			 * @param classroom
			 * 		Used for the input list of the student in the classroom, aggregates all data 
			 * @param partitionIndex
			 * 		Used as the median 
			 * @param elementOne
			 * 		First element in the data structure
			 * @param lastElement
			 * 		Last element in the data structure
			 * @return
			 */
			public static int Partitioner(List<Student> classroom, int partitionIndex, int elementOne, int lastElement){
				int pivot = classroom.get(partitionIndex).getScore();
				int lowerbound = elementOne;
				int higherbound = lastElement - 2;
				
				//First Swap
				swap(classroom,partitionIndex,lastElement-1); 
				
				while(lowerbound < higherbound)
				{
					if(classroom.get(lowerbound).getScore() < pivot){lowerbound++;}
						
					else if(classroom.get(higherbound).getScore() >= pivot){higherbound--;}
						
					else{swap(classroom, lowerbound, higherbound);}
		
				}
				int index = higherbound;
				if(classroom.get(index).getScore() < pivot)
					index++;
					swap(classroom, lastElement-1, index );
					
					//For Debug
					//System.out.println("Values of index");
					//System.out.println(index);
					return index;
				}
			
			/**
			 * Swaps values by using the set method in the List class
			 * @param classroom
			 * @param i
			 * @param j
			 */
			public static void swap(List<Student> classroom, int a, int b){
				Student tempswapper = classroom.get(a);
				classroom.set(a, classroom.get(b));
				classroom.set(b, tempswapper); 
			}

			/**
			 * Implements a non-recursive mergesort by dividing the array into two sorted segments then merges them
			 * @param Classroom SEE ABOVE
			 */
			public static void Mergesort(List<Student> Classroom){
				int mid = classroom.size() / 2;
				sort(Classroom,0, mid);
				sort(Classroom,mid+1,classroom.size());
				merge();
					
					
				
				
			}
			/**
			 * Couldn't figure out how to merge them :(
			 */
			private static void merge() {
			
				
			}


}
/**Name: Chris Blair
 * School: Red Bank Catholic
 * Assignment: 27.3a Program it!
 * Date:3/31/2015
 */


