class Solution {
    
    public ListNode reverse(ListNode head){ // reverse method to reverse the list 
        ListNode node = null;
        while(head!=null){
            ListNode nextNode = head.next;
            head.next = node;
            node = head;
            head = nextNode;
        }
        return node;
    }
    public void reorderList(ListNode head){
        LinkedList firstHalf = new LinkedList();
        LinkedList secondHalf = new LinkedList();
    ListNode slow = head;
    ListNode fast = head.next;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    // in even node list slow is pointing to mid 
    // in odd node list slow is pointing to mid+1
    
    ListNode second = reverse(slow.next); // to create 2 linked list reverse it by passing                                           the slow as head in reverse method 
    slow.next = null;
    ListNode first = head;             // point head to any node to create the first list 
        
        // now we have 2 list one starting from head till the middle and the second starting from the middle to the last (which is reversed so it is from last to middle)
        
         
        while(second!=null){  // alternatively add the elements of the two list 
            ListNode temp1 = first.next;
            first.next = second;
            ListNode temp2 = second.next;
            second.next = temp1;
            first = temp1;
            second = temp2;
            
        }
    }
}
