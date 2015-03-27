import java.util.ArrayList;

// Case Study 10.1: Student class

public class Student {

   private String name;
   private ArrayList<Integer> testScores;  

   // Default: Name is "" and 3 scores are 0
   public Student(){
      this("");
   }
    
   // Name is nm and 3 scores are 0
   public Student(String nm){
      this(nm, 3);
   }

   // Name is nm and n scores are 0
   public Student(String nm, int n){
      name = nm;
      testScores = new ArrayList<Integer>();
      for (int i = 0; i < n; i++)
         testScores.add(0);
   }

   // Name is nm and scores are in t
   public Student(String nm, ArrayList<Integer> t){
      name = nm;
      testScores = new ArrayList<Integer>();
      for (int i = 0; i < t.size(); i++)
         testScores.add(t.get(i));
   }
    
   // Builds a copy of s
   public Student(Student s){
      this(s.name, s.testScores);
   }
    
   public void setName (String nm){
      name = nm;
   }
    
   public String getName (){                 
      return name;
   }
   
   public int getSize(){
	   return testScores.size();
   }
    
   public void setScore (int i, int score){
      testScores.set(i, score);
   }

   public int getScore (int i){
        return testScores.get(i-1);
   }
   
   public int getAverage(){
        int sum = 0;
        for (int score : testScores)
           sum += score;
        return sum / testScores.size();
   }
    
   public int getHighScore(){
      int highScore = 0;
      for (int score : testScores)
         highScore = Math.max (highScore, score);
      return highScore;
   }
    
   public String toString(){
      String str = "Name:    " + name  + "\n";
      for (int i = 0; i < testScores.size(); i++)
         str += "test " + i + ":  " + testScores.get(i) + "\n";
      str += "Average: " + getAverage();
      return str;
   } 

   //Returns null if there are no errors else returns
   //an appropriate error message.
   public String validateData(){
      if (name.equals ("")) return "SORRY: name required";
      for (int score : testScores){
         if (score < 0 || score > 100){
            String str = "SORRY: must have "+ 0
                         + " <= test score <= " + 100;  
            return str;
         }
      }
      return null;
   }  
}


//Name: Chris Blair
//School: Red Bank Catholic
//Date: 3/3/2015
//Assignment: 23.3a Propose It
