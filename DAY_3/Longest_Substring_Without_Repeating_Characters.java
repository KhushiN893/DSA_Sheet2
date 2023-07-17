import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		String str;
		int res=0;
		for(int j=0;j<input.length();j++){
		str="";
		    for(int i=j;i<input.length();i++)
		    {
			  if(str.indexOf(input.charAt(i)) == -1)
			   str=str+input.charAt(i);
			  else
			   break;
		   }
         res=Math.max(res,str.length());
		}
		return res;
	}
}
//approach
//1)create empty string
//2)start from each character in string and create a new string with of unique characters
//3)return maximum length
