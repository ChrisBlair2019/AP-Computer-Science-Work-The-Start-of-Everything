import java.util.ArrayList;

// Case Study 10.1: TestScoresModel class

public class TestScoresModel{

   private ArrayList<Student> studentList;         // Array of students
   private int indexSelectedStudent;   // Position of current student
   private int studentCount;           // Current number of students

   public TestScoresModel(){

      // Initialize the data
      indexSelectedStudent = -1;
      studentCount = 0;
      studentList = new ArrayList<Student>();
   }

   // Mutator methods for adding and replacing students

   public String add(Student s){
         studentList.add(s);
         indexSelectedStudent = studentCount;
         studentCount++;
         return null;
      }

   public String replace(Student s){
      if (indexSelectedStudent == -1)
         return "Must add a student first";
      else{     
         studentList.set(indexSelectedStudent,s);
         return null;
      }
   }

   // Navigation methods

   public Student first(){
      Student s = null;
      if (studentCount == 0)
         indexSelectedStudent = -1;
      else{
         indexSelectedStudent = 0;
         s = studentList.get(indexSelectedStudent);
      }
      return s;
   }

    public Student previous(){
      Student s = null;
      if (studentCount == 0)
         indexSelectedStudent = -1;
      else{
         indexSelectedStudent
             = Math.max (0, indexSelectedStudent - 1);
        s = studentList.get(indexSelectedStudent);
      }
      return s;
   }

   public Student next(){
      Student s = null;
      if (studentCount == 0)
         indexSelectedStudent = -1;
      else{
         indexSelectedStudent
             = Math.min (studentCount - 1, indexSelectedStudent + 1);
        s = studentList.get(indexSelectedStudent);
      }
      return s;
   }

   public Student last(){
      Student s = null;
      if (studentCount == 0)
         indexSelectedStudent = -1;
      else{
         indexSelectedStudent = studentCount - 1;
       s = studentList.get(indexSelectedStudent);
      }
      return s;
   }

   // Accessors to observe data

   public Student currentStudent(){
      if (indexSelectedStudent == -1)
         return null;
      else
         return studentList.get(indexSelectedStudent);
   }

   public int size(){
      return studentCount;
   }

   public int currentPosition(){
      return indexSelectedStudent;
   }

   public int getClassAverage(){
      if (studentCount == 0)
         return 0;
      int sum = 0;
      for (int i = 0; i < studentCount; i++)
         sum += studentList.get(i).getAverage();
      return sum / studentCount;
   }

   public Student getHighScore(){
      if (studentCount == 0)
         return null;
      else{
         Student s = studentList.get(0);
         for (int i = 1; i < studentCount; i++)
            if (s.getHighScore() < studentList.get(i).getHighScore())
               s = studentList.get(i);
         return s;
      }
   }

   public String toString(){
      String result = "";
      for (int i = 0; i < studentCount; i++)
         result = result + studentList.get(i) + "\n";
      return result;
   }
}

