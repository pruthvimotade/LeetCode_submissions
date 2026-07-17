class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 0;

        while (q.size() > 0) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode head = q.remove();

                if(count%2==0)
                {
                    level.add(head.val);
                }
                else{
                    level.add(0,head.val);
                }
                if (head.left != null)
                    q.add(head.left);
                if (head.right != null)
                    q.add(head.right);
            }
            ans.add(level);
            count++;
        }
        return ans;
    }
}