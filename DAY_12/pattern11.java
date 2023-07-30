class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++)
        {
            int res=(i%2==0)?1:0;
            for(int j=0;j<=i;j++)
            {
                System.out.print(res + " ");
                res=1-res;
            }
            System.out.println();
        }
    }
}
/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/
