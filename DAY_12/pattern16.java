/*
A
BB
CCC
DDDD
EEEEE

*/
class Solution {

    void printTriangle(int n) {
        int printing=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)((int)('A'+i)));
            }
            System.out.println();
        }
    }
}
