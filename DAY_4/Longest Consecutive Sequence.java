import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int n) {
        // Write your code here.
        Arrays.sort(arr);
        int l = 1,maxi = 1;
//1 2 3 4 9 11 12 13 14 15
    for(int i = 1; i < n; i++)
    {
        if((arr[i]-arr[i-1]) == 1)
        {
            l++;
            maxi = Math.max(maxi,l);
        }
        else if((arr[i]-arr[i-1]) == 0)
        {
            continue;
        }
        else l=1;
    }
    return maxi;

}


}
