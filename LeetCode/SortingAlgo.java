
public class SortingAlgo {

	public static void main(String[] args) {
		int nums[]=new int[]{2,1,8,3,45,36,22};
		bubbleSort(nums);
		insertionSort(nums);
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

		//test
}
