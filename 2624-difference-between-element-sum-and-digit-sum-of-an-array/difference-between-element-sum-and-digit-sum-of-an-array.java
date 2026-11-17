class Solution {
    public int differenceOfSum(int[] nums) {
    int elesum=0;
    int digsum=0;
    for(int i=0;i<nums.length;i++){
        elesum+=nums[i];
        while(nums[i]>0){
            int lastdigit=nums[i]%10;
            digsum+=lastdigit;
            nums[i]/=10;
        }
    }
    return Math.abs(elesum-digsum); 
    }
}