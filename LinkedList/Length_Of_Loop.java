public class Length_Of_Loop {
        public int countNodesinLoop(Node head) {
            Node slow=head;
            Node fast=head;
            while(fast != null && fast.next != null){
                slow=slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    int cnt =1;
                    fast= fast.next;
                    while(slow != fast){
                        cnt++;
                        fast=fast.next;
                    }
                    return cnt;
                }
            }
            return 0;
        }
    }