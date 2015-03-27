package preob;

import Student;

import java.util.List;

public class tempstorafe {

	  // In this method you should sort the classroom in ascending order depending on the score obtained on the quiz. 
	  public static void sort(List<Student> classroomgrades){
		//Implementation of code here.
		  int[] tempArray = new int[classroomgrades.size()];
		  for(int index = 0; index < classroomgrades.size(); index++)
			  tempArray[index] = classroomgrades.get(index).getScore();
		  
		  
		  
		  
		  int i = 0;
		  boolean swapMade = true;
		  
		  while((i < tempArray.length-1) && swapMade){
			  swapMade = false;
			  i++;
			  for(int index = 0; index < tempArray.length-i; index++)
				  if(tempArray[index] > tempArray[index + 1])
					  swap(tempArray, index, index + 1);
			  		swapMade = true;
		  }
		  
		  for(int index = 0; index < classroomgrades.size(); index++)
			  classroomgrades.set(index, tempArray[index]);
		  
		  
		  
	  }
	  public static void sort(List<Student> classroomgrades){
			//Implementation of code here.
		
			  
			  int i = 0;
			  boolean swapMade = true;
			  
			  while((i < classroom.size()) && swapMade){
				  swapMade = false;
				  i++;
				  for(int index = 0; index < classroom.size()-i; index++)
					  if(classroom.get(index).getScore() > classroom.get(index + 1).getScore())
						  swap(classroom, index, index + 1);
				  		swapMade = true;
			  }
			  

					  }
		  
	  
	  static void swap(List<Student> classroom,int a, int b){
		  Student tempswapper = classroom.get(a);
		  classroom.set(a, classroom.get(a));
		  classroom.set(b, tempswapper);
		  
	  }
}

public static void sort(List<Student> classroom){
	  int insertee;
	  int z;
	  boolean haveIFoundit = true;
	  
	  for(int index = 1; index < classroom.size(); index++){
		  insertee = classroom.get(index).getScore();
		  z = index - 1;
		  while((z >=0) && haveIFoundit){
			  if(insertee < classroom.get(z).getScore()){
				  classroom.set(z + 1, classroom.get(z));
				  z--;
			  }
			  else
				  haveIFoundit = false;
		  }
		  classroom.set(z + 1, classroom.get(insertee));
	  }
}