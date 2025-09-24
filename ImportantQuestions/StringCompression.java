// public class StringCompression {
    
//     public static void main(String[] args) {
//         String str = "aaabbbcccdddeeefff";
//         StringBuilder sb = new StringBuilder();
//         int count = 1;
//         for(int i=1;i<str.length();i++){
//             if(str.charAt(i)==str.charAt(i-1)){
//                 count++;
//             }else{
//                 sb.append(str.charAt(i-1));
//                 if(count>1){
//                     sb.append(count);
//                 }
//                 count=1;
//             }
//         }
//         sb.append(str.charAt(str.length()-1));
//         if(count>1){
//             sb.append(count);
//         }
//         System.out.println(sb.toString());
//     }
       
// }



public class StringCompression {
    public static String compress(String str){
        String newStr = "";
        for(int i = 0 ; i< str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr = newStr + str.charAt(i);
            if(count>1){
                newStr = newStr + count.toString();
            }
        }
        return newStr;
    }
    
    public static void main(String[] args) {
        String str = "aaabbbcccdddeeefff";
        System.out.println(compress(str));
    }
}




// class Solution {
//     public int compress(char[] chars) {
//         String str = "";
//         for( int i = 0 ; i< chars.length ; i++){
//             int count = 1 ; 
//             while( i < chars.length -1  && chars[i]== chars[i+1]){
//                 count ++;
//                 i++;
//             }
//             str += chars[i];
//             if(count > 1) str += count;
//         }
//         for(int i = 0 ; i< str.length(); i++){
//             chars[i]= str.charAt(i);
//         }
//         return str.length();
//     }

// }