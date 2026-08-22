class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct = Integer.MIN_VALUE;

        int leftproduct = 1;
        int rightproduct = 1;

        for(int i =0;i<nums.length;i++){

            leftproduct *= nums[i];
            rightproduct *= nums[nums.length-1-i];

            maxproduct = Math.max(maxproduct,Math.max(leftproduct,rightproduct));

            if(leftproduct ==0) leftproduct =1;
            if(rightproduct ==0) rightproduct =1;
        }
            return maxproduct;
    }
}