import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long cs=0,res=Integer.MIN_VALUE;
        if(n==1 && arr[0]==0)
			return res=0;


      for (int i = 0; i < arr.length; i++) {
              cs=cs+arr[i];
              if(cs<0)
				  cs=0;
              if(cs>res) res=cs;

      }

      return res;
	}

}
