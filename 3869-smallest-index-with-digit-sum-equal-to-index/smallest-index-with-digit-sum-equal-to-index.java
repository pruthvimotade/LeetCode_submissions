class Solution {
    public int smallestIndex(int[] nums) {
        for(int i =0;i<nums.length;i++){
            if(nums[i]>9){
                int num = nums[i];
                int numsum =0;
                while(num>0){
                    
                    numsum+= num%10;
                    num=num/10;
                }
                if(numsum==i) return i;
            }
            else if(nums[i]==i) return i;
        }
        return -1;
    }
}