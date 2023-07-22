import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

public static LinkedListNode<Integer> findmidnode(LinkedListNode<Integer> head)

    {

        LinkedListNode<Integer>s=head;
        LinkedListNode<Integer>f=head;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }

        return s;

    }
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
        if(head==null || head.next==null)
            return true;

        LinkedListNode<Integer> t=findmidnode(head);
        LinkedListNode<Integer> curr=t;
        LinkedListNode<Integer> prev=null;
        LinkedListNode<Integer> next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        t=prev;
        while(t!=null)
        {
            if(!t.data.equals(head.data))
                return false;
            t=t.next;
            head=head.next;

        }

        return true;
	}
}
