class Solution {
    public void nextPermutation(int[] nums) {
      int i,j,n=nums.length;
      for(i=n-2;i>=0;i--)
      {
        if(nums[i]<nums[i+1])
        {
            for(j=n-1;j>i;j--) 
        {
            if(nums[j]>nums[i])
            {
                swap(nums,i,j);
                break;
            }
        }
        break;
        }
      }  reverse(nums,i+1,n-1);
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
