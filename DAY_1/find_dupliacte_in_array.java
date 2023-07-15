import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{

    public static int findDuplicate(ArrayList<Integer> arr, int n){
 HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            } else {
                seen.add(num);
            }
        }
        return -1;
    
}
}
