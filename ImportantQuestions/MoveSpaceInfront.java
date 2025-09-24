public class MoveSpaceInfront {
    static void moveSpaceInFront(char str[]) {
        int i = str.length-1;
        for(int j = i ; j>=0 ;j--){
            if(str[j]!= ' '){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i--;
            }
        }
    }
    public static void main(String[] args) {
        char str[] = "Hey there, it's GeeksforGeeks".toCharArray(); 
        moveSpaceInFront(str); 
        System.out.println(String.valueOf(str));
    }
}


// Move All # to End of String type Question  