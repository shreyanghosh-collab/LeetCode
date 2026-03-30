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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p3=null, p4=null;
        while(list1!=null && list2!=null){
            if(p3==null){
                p3=new ListNode();
                p3.next=null;
                p4=p3;
            }
            else{
                p3.next=new ListNode();
                p3=p3.next;
                p3.next=null;
            }
            if(list1.val<list2.val){
                p3.val=list1.val;
                list1=list1.next;
            }
            else if(list2.val<list1.val){
                p3.val=list2.val;
                list2=list2.next;
            }
            else if(list1.val==list2.val){
                p3.val=list1.val;
                list1=list1.next;
                p3.next=new ListNode();
                p3=p3.next;
                p3.val=list2.val;
                list2=list2.next;
                p3.next=null;
            }
        }
        while(list1==null && list2!=null){
            if(p3==null){
                p3=new ListNode();
                p3.next=null;
                p4=p3;
            }
            else{
                p3.next=new ListNode();
                p3=p3.next;
                p3.next=null;
            }
            p3.val=list2.val;
            list2=list2.next;
        }
        while(list1!=null && list2==null){
            if(p3==null){
                p3=new ListNode();
                p3.next=null;
                p4=p3;
            }
            else{
                p3.next=new ListNode();
                p3=p3.next;
                p3.next=null;
            }
            p3.val=list1.val;
            list1=list1.next;
        }
        return p4;
    }
}