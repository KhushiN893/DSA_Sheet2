public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
		String[] words = str.split(" ");
		StringBuilder reversesen = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversesen.append(words[i]).append(" ");
        }
return reversesen.toString();
	}
}
