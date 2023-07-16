/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/
import java.util.*;
public class Solution
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.
      List<Node> d = new ArrayList<>();

        while (head != null) {

            d.add(head);

            head = head.next;

        }

        return d.get(d.size() / 2);
    }
}
