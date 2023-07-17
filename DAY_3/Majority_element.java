import java.io.*;
import java.util.* ;

public class Solution {

	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		   Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1; 
		
	}
}
