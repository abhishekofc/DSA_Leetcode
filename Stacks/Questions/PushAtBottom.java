import java.util.*;
public class PushAtBottom{
    public static void PushAtBtm(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBtm(s, data);
        s.push(top);


    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        int elementToPush = 4; 
        PushAtBtm(s,elementToPush);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}