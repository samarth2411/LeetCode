public class Solution {
    public boolean hasCycle(ListNode head) {
    
        
        ListNode temp = head;
        ListNode fast = head;
        
        while( fast!=null && fast.next!=null ){
                temp = temp.next;       // moing temp by one point 
                fast = fast.next.next; // moving fast by 2 points 
            
            if(fast==temp){ //check whether fast and temp are equal or not if the linked                                 list is cyclic then fast and temp wil be equal at one point 
                return true;
            }
         
          
        }
        return false;
        
    }
}
