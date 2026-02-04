public class FirstOccurence{
    public static int firstOccurence(int[] arr,int target,int index){
        /* 
        Method 1 : using loop 
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]== target) return i;
        }
        return -1;
        */

        // Method 2 : using recursion
        if(index >= arr.length) return -1;
        if(arr[index] == target) return index;
        return firstOccurence(arr, target, index+1);
    }
    public static void main(String[] args){
        int[] arr = {8,3,6,9,5,10,2,5,3};
        int target = 5;
        System.out.println(firstOccurence(arr, target,0));
    }
}