/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head , slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if  (fast == slow){
                return true;
            }
        }
        return false;
    }
}






//another approach
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> a=new HashSet<>();
        a.add(head);
        if(head==null){
            return false;
        }
        while(head!=null){
            if(a.contains(head.next)){
                return true;
            }
            a.add(head.next);
            head=head.next;
        }
        return false;
        
    }
}
