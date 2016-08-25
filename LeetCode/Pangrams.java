import java.util.Hashtable;


public class Pangrams {
	
	private static Hashtable<Character, Integer> alphabetMapHashtable  =  
			new Hashtable<Character, Integer>();
	
	public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		System.out.println(validatePangrams("We promptly judged antique ivory buckles for the next prize"));
	    }
	
	
	private static String validatePangrams(String input){
		String s = input.toUpperCase();
		
		if(s.length()<26){
			//return "not pangram";
		}
		
		for(int i=65;i<=90;i++){
			char ch = (char) i ;
			alphabetMapHashtable.put(ch,1);
		}
		
		for(int i=0; i<s.length() ;i++){
			
			if(alphabetMapHashtable.containsKey(s.charAt(i))){
				alphabetMapHashtable.remove(s.charAt(i));
			}
		}
		
		if(alphabetMapHashtable.size() != 0) return "not pangram" ;
		
		return s;
	}
}
