import com.sun.java_cup.internal.runtime.Scanner;


public class SuperReduceString {
	//private static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) {
		//System.out.println(reduceString("baab"));
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(reduceStringByDoWhile(input));
	}
	
	
	private static String reduceString(String s){
		boolean a[] = new boolean[s.length()];
		String result = "";
		for(int i=0;i<=s.length()-2;i=i+2){
			if(s.charAt(i) == s.charAt(i+1)){
				a[i] = a[i+1] = true;
			}
		}
		for(int i=0;i<a.length;i++){
			if(!a[i]){
				result =result.concat(""+s.charAt(i)); 
			}
		}
		if(result.isEmpty()) return "Empty String";
		return result;
	}
	
	/*private static String reduceStringByRecursion(StringBuffer s){
		
		
		for(int i=0;i<=sb.length()-2;i++){
			if(sb.charAt(i) == sb.charAt(i+1)){
				sb.deleteCharAt(i+1);
				sb.deleteCharAt(i);
				reduceStringByRecursion(sb);
			}
		}
		
		if(sb.length() == 0){
			sb = sb.append("Empty String");
			return sb.toString();
		}else return sb.toString(); 
	}*/

	private static String reduceStringByDoWhile(String s){
		boolean stringReduced = false;
		StringBuffer sb = new StringBuffer(s);
		
		do{
			stringReduced = false;
			
			if(sb.length() == 1) return sb.toString();
			
			for(int i=0;i<=sb.length()-2;i++){
				if(sb.charAt(i) == sb.charAt(i+1)){
					sb.deleteCharAt(i+1);
					sb.deleteCharAt(i);
					stringReduced = true;
				}
			}
			
		}while(stringReduced);
		
		String result = sb.toString();
		
		if(result.equals("")) return "Empty String";
		
		return result;
	}
}
