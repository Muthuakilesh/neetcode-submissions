class Solution {
    public boolean hasDuplicate(int[] nums) {
        
      for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]>nums[j]){
                int a=nums[i];
                nums[i]=nums[j];
                nums[j]=a;
            }
        }
      }

      for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]){
            return true;
        }
      }
      return false;
    }
}