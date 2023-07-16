import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int j=0;
        for(int i=0;i<m+n;i++)
        {
           if(arr1[i]==0)
             arr1[i]=arr2[j++];
        }
        Arrays.sort(arr1);
        return arr1;
        
    }
}
//approach : 
//1)as mentioned we have to assume length of arr1 as m+n
//2)loop till m+n
//3)while looping check if elemen is 0/no elemenet then add arr2 elements
//4)and lastly return sorted array 
