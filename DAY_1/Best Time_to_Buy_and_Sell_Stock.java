import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int low=Integer.MAX_VALUE;
        int sell=0,profit=0;
        for(int i=0;i<prices.size();i++)
        {
            if(prices.get(i)<low)
            low=prices.get(i);
            sell=prices.get(i)-low;
            if(sell>profit)
            profit=sell;
        }
     return profit;
    }
}
