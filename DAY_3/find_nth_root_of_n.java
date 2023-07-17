public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int res =(int) Math.round(Math.pow(m, 1.0 / n));
       return  (Math.pow(res, n) == m)?res:-1;
    }

}
//find m^1/n and get rounded integer result
// check m is equal to result^n
