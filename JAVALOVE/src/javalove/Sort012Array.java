package javalove;

public class Sort012Array {
	public static void main(String[] args) {
		int arr[]= {2,0,2,1,1,0};
		sortColors(arr);
	}
  public static void sortColors(int[] nums) {
      int n=nums.length;
      int start=0;
      int mid=0;
      int end=n-1;
      while(mid<=end){
          if(nums[mid]==0){
              int temp=nums[start];
              nums[start]=nums[mid];
              nums[mid]=temp;
              start++;
              mid++;  
          }
         if(nums[mid]==1){
              mid++;
         }
         if(nums[mid]==2){
             int temp=nums[mid];
             nums[mid]=nums[end];
              nums[end]=temp;
             start--;
         }
     }
     
  }
}
