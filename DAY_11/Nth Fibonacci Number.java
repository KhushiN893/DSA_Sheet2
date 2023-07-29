import java.util.*;
public class Solution { 

    public static int fibo(int n){

        if(n == 1 || n == 2) return 1;

        return fibo(n-1)+fibo(n-2);

    }    public static void main(String[] args) {

        
        java.util.Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        System.out.print( fibo(n));

    }

 

}
