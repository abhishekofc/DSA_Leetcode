public class LastOccurence{
    public static int lastOccurence(int[] arr,int target,int index){
        // Method 2 : using recursion
        if(index < 0) return -1;
        if(arr[index] == target) return index;
        return lastOccurence(arr, target, index-1);
    }
    public static void main(String[] args){
        int[] arr = {8,3,6,9,5,10,2,5,3};
        int target = 5;
        System.out.println(lastOccurence(arr, target,arr.length-1));
    }
}