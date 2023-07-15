import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        Arrays.sort(arr);
        List<int[]> pair=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==s && i!=j)
                {
                    int[] p={arr[i],arr[j]};
                    pair.add(p);
                }
            }
        }
        return pair;
    }
}
