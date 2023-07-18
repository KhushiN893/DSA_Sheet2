import java.util.* ;
import java.io.*; 
public class Solution {	
	public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
	}

