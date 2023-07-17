import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        ArrayList<Integer> ar=new ArrayList<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i=0;i<arr.size();i++) {
            frequency.put(arr.get(i), frequency.getOrDefault(arr.get(i), 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() >arr.size() / 3) {
               ar.add(entry.getKey());
            }
        }

        return ar; 
    }
}
