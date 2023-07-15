import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		//5 4 3 -2 1 1 
		int mx = 0,sum;
        for (int i = 0; i < arr.size(); i++) {
            sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum=sum+ arr.get(j);
                if (sum == 0) {
                    int len = j - i + 1;
                    mx = Math.max(mx, len);
                }
            }
        }
        return mx;
	}
}
