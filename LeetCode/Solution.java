import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
      for(int i=0;i<nums.length;i++){
    	  for(int j=i+1;j<nums.length;j++){
    		  if(nums[i]+nums[j]==target){	
    		 return new int[]{i,j};
    		 }
    	  }
      }
     
      return null;
    }
    
    
    public static void main(String args[]){
    	int num[]=new int[]{2,1,8,3,45,36,22};
    	int target=8;
    	int result[]=twoSum(num, target);
    	ArrayList<Integer> test =new ArrayList<Integer>();	
    	//System.out.println(everyNth("Chocolate", 3));
     	//System.out.println(diff21(30));
    	//System.out.println(bubbleSort(num));
    	insertionSort(num);
    }
    
    public static String everyNth(String str, int n) {
    	  String output = "";
    	  output = "" + str.charAt(0);
    	  for(int i=n; i <= str.length()-1 ; ){
    		  output += str.charAt(i);
    		  i =i + n;
    	  }
    	  
    	    return output; 
    	}

    public static int diff21(int n) {
    	  
    	return 21 == n ? 0 
    			:21 > n ? 21-n
    					:(n-21)*2;
    	}
    
    public static int[] bubbleSort(int[] numbers){
    	
    	boolean numbersSwitched;
    	 do {
    	 numbersSwitched = false;
    	 for (int i = 0; i < numbers.length - 1; i++) {
    	 if (numbers[i + 1] < numbers[i]) {
    	 int tmp = numbers[i + 1];
    	 numbers[i + 1] = numbers[i];
    	 numbers[i] = tmp;
    	 numbersSwitched = true;
    	 }
    	 }
    	 } while (numbersSwitched);
    	 
    	return numbers;
    }
    

	public static int[] insertionSort(int nums[]){
	for(int i =1; i < nums.length-1 ;i++){
	 int value = nums[i];
	 int hole = i ;
	 
	 while(hole > 0 && nums[hole-1] > value){
		 nums[hole] = nums[hole-1];
		 hole = hole-1;
	 }
	 nums[hole] = value;
	}
		return nums;
	
	}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}