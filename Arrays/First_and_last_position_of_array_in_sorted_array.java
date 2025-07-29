class Solution {
    public int[] searchRange(int[] nums, int target) {
         int low=0,high=nums.length-1,mid,startpos=-1,endpos=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
            startpos = mid;
            high=mid-1;
            }
            else if(nums[mid]<target)
            low=mid+1;
            else if(nums[mid]>target)
            high=mid-1;
        }
        if(startpos==-1)
        return new int[]{-1, -1};
        low=startpos;
        high=nums.length-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
            endpos = mid;
            low=mid+1;
            }
            else if(nums[mid]<target)
            low=mid+1;
            else if(nums[mid]>target)
            high=mid-1;
        }
    return new int[]{startpos, endpos};
    }
}
