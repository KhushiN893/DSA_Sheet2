import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		int size = stack.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = stack.elementAt(i);
        }
        Arrays.sort(arr);
        stack.clear();
		 for (int i = 0; i < size; i++) {
            stack.push(arr[i]);
        }
	}

}
