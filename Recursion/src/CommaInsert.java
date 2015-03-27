
public class CommaInsert {

public static void main(String[] args){
		
		String integerFormat = CommaInserter(1000000);
		System.out.println(integerFormat);
	}
	
	public static String CommaInserter(int posInt){
		String intString = "";
		
		if(posInt < 1000)
			return "";
		else 
			return intString.concat(1000 /(CommaInserter(posInt));	
		
	}
}
