import java.util.HashMap;
public class Solution {
    public static int romanToInt(String s) {
        // Write your code here
         if (s == null || s.length() == 0) 
            return 0;
            
        HashMap<Character, Integer> rp = new HashMap<>();
        rp.put('I', 1);
        rp.put('V', 5);
        rp.put('X', 10);
        rp.put('L', 50);
        rp.put('C', 100);
        rp.put('D', 500);
        rp.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = rp.get(s.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}
