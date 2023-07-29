import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res1=0;
		int res2=0;
		while(n>0)
		{
			int num=n%10;
			n=n/10;
			if(num%2==0)
			res1=res1+num;
			else
			res2=res2+num;
		}
		System.out.print(res1+" "+res2);


	}
}
