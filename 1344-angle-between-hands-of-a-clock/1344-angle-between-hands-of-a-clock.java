class Solution {
    public double angleClock(int hour, int minutes) {
        
        double hourangle = (hour%12)*30 + minutes*.5;
        double minutesangle = minutes*6;

        double diff = Math.abs(hourangle - minutesangle);

        return Math.min(diff,360-diff);
    }
}