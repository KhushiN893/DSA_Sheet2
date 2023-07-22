import java.util.*;
public class Solution {
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        int arr[] = new int[m + n];
        System.arraycopy(row1, 0, arr, 0, m);
        System.arraycopy(row2, 0, arr, m, n);

        Arrays.sort(arr);
        return arr[k - 1];
    }
}
