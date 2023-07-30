class Solution {
/*
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/
    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
         for(int i=1;i<=n-1;i++)
        {
            for(int j=n-1;j>=i;j--)
            System.out.print("* ");
            System.out.println();
        }
    }
}
