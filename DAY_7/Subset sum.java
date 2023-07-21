import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
       ArrayList<Integer> ar=new ArrayList<>();
       ar.add(0);
    for(int i=0;i<num.length;i++)
    {
        int len=ar.size();
        for (int j = len - 1; j >= 0; j--) {
              ar.add(num[i] + ar.get(j));
          }
    }
        Collections.sort(ar);
        return ar;
    }

}
