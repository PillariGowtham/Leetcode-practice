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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode curr=head;
        int s=0;
        while(curr!=null){
            s++;
            curr=curr.next;
        }
        int d=s-n;
        if(d-1<0){
            return head.next;
        }
        ListNode temp=head;
        while(d-->1){
            temp=temp.next;
        }
        if(temp.next!=null && temp.next.next==null){
            temp.next=null;
        }
        if(temp.next!=null && temp.next.next!=null)
        temp.next=temp.next.next;
        return head;
    }
}