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
    public ListNode detectCycle(ListNode head) {
        Set <ListNode> seen = new HashSet<>();
        while(head != null){
            if(seen.contains(head)){
                return head;
            }
            seen.add(head);
            head=head.next;
        }
        return head;
       
    }
}


// Approach 2 
//If the node is found in the seen set, it means we have encountered a cycle.
//Return: The current node, which is the starting point of the cycle.



