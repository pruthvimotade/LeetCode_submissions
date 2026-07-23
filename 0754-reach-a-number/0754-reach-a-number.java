class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);

        int currentPosition =0;
        int move =0;

        while(currentPosition < target)
        {
            move ++;
            currentPosition+=move;
        }

        while((currentPosition-target)%2!=0)
        {
            move++;
            currentPosition+=move;
        }
        return move;
    }
}