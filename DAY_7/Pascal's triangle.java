import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
	   long one = 1;
		ArrayList<ArrayList<Long>> res = new ArrayList<>();
		if(n == 0) return res;

		for(int i=0; i<n; i++){
			res.add(new ArrayList<>());
		}

		res.get(0).add(one);
		if(n == 1) return res;

		res.get(1).add(one);
		res.get(1).add(one);
		if(n == 2) return res;

		for(int i=2; i<n; i++){
			ArrayList<Long> subList = new ArrayList<>();
			subList.add(one);
			for(int j=1; j<i; j++){
				long prev2 = res.get(i-1).get(j-1);
				long prev = res.get(i-1).get(j);
				subList.add(prev + prev2);
			}
			subList.add(one);
			res.set(i, subList);
		}

		return res;
	}
}
