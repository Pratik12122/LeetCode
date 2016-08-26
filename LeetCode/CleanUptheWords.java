import java.io.*;
import java.util.LinkedList;


public class CleanUptheWords {
	
	private static LinkedList<Character> cleanCharacterList = new LinkedList<Character>();
	
    public static void main (String[] args) throws IOException {
        File file = new File("D:\\Programming\\CodeEval\\cleanString.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(cleanString(line));
        }
    	//System.out.println(cleanString("~Z"M!~~^joCNe~D6c%|G#7WtR;"));
    }
    
    
    private static String cleanString(String input){
    	
    	boolean charAdded = false;
    	String output = "";
    	for (int i = 0; i < input.length(); i++) {
    		
    		char ch = input.charAt(i);

    		if(Character.isLetter(ch)){
    			
    			cleanCharacterList.add(ch);
    			charAdded = true;
    			
			}else if(charAdded){
				cleanCharacterList.add(' ');
				charAdded = false;
			} 
		}
    	
    	for (int i = 0; i < cleanCharacterList.size(); i++) {
			output = output + "" + cleanCharacterList.get(i);
		}
    	cleanCharacterList.clear();
    	return output.toLowerCase().trim();
    }


}
