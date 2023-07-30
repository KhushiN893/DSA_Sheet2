
class Solution {

/*
E
E D
E D C
E D C B
E D C B A
*/
    void printTriangle(int n) {
        // code here
        
        for(int i=0;i<n;i++)
        {
            int k=n-1;
            for(int j=0;j<=i;j++)
            System.out.print((char)((int)('A'+k--))+" ");
            System.out.println();
        }
    }
}
