class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();
        int expected = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == expected) {
                expected++;
            }

            else if (nums[i] > expected) {
                while (nums[i] > expected) {
                    ans.add(expected);
                    expected++;
                }
                expected++;
            }
        }

        while (expected <= nums.length) {
            ans.add(expected);
            expected++;
        }

        return ans;
    }
}