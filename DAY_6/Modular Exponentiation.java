import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = (int)(((long)ans * x) % m);
            }
            x = (int)(((long)x * x) % m);
            n >>= 1;
        }
        return ans;
    }
}
