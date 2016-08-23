import java.util.Scanner;


public class CamelCase {
	 public static void main(String[] args) {
	       /* Scanner in = new Scanner(System.in);
	        String s = in.next();*/
	        System.out.println(countCamelCase("saveChangesInTheEditor"));
	        System.out.println(countCamelCase("save"));
	 }
	 
	 public static int countCamelCase(String s){
		 int count = 1;
		 
 		 for(int i =0;i<s.length();i++){
 			 int ch = (int)s.charAt(i);
 			 
 			 if( 65 <= ch && ch <= 90 ) {
 				 count++;
 			 }
		 }
 		 
 		 return count;
	 }
	 
}
