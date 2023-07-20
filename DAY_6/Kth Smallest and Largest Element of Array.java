import java.util.*;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		ArrayList<Integer> res=new ArrayList<>();
		Collections.sort(arr);
		res.add(arr.get(k-1));
		res.add(arr.get(n-k));
		return res;
	}
}
