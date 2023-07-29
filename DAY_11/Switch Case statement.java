
public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        double res=0;
        switch(ch){
            case 1:
            res=Math.PI*a[0]*a[0];
            break;
            case 2:
            res=a[0]*a[1];
            break;

        }
        return res;
    }
}
