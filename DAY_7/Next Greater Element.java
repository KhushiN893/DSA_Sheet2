import java.util.* ;
import java.io.*; 

public class Solution {
		public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		int[] res = new int[n];
        Arrays.fill(res, -1); 
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = arr[i];
            }
            stack.push(i);
        }
        return res;
		
	}

}
