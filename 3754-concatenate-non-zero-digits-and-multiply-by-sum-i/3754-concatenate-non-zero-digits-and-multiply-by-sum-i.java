class Solution {
    public long sumAndMultiply(int n) {
        int num = n;
        if (num == 0)
            return 0;
        int newnum = 0;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            if (digit != 0) {
                newnum = (newnum * 10) + digit;
                sum += digit;
            }
        }
        return reverseNumber(newnum) * (long)sum;
    }

    public int reverseNumber(int num) {

        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = (digit + reverse * 10);
            num /= 10;
        }
        return reverse;
    }
}