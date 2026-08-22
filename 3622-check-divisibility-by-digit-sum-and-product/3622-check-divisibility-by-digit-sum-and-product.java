class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int numsum =0;
        int numprod =1;
        while(num>0){
            numsum +=num%10;
            numprod*=num%10;
            num/=10;
        }
       if (n%(numsum+numprod)==0) return true;
       return false;
    }
}