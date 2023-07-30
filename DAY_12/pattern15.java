/*
ABCDE
ABCD
ABC
AB
A
*/
class Solution {

    void printTriangle(int n) {
        int printing=1;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)((int)('A'+j)));
            }
            System.out.println();
        }
    }
}
