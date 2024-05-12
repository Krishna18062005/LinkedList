/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode t=head;
        if(head==null){
            return head;
        }
        while(t!=null&&t.next!=null){
            
            if(t.next.val==val){
            t.next=t.next.next;}
            else
            t=t.next;
        }
        if(head.val==val){
            head=head.next;
        }
    
        
        return head;
        
    }
}
