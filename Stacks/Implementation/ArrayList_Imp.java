import java.util.ArrayList;

public class ArrayList_Imp {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1; // or throw an exception
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            return list.get(list.size()-1);
        }        
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2); 
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }       
    }
}