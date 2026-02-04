public class IsSorted{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean result = isSorted(arr, 0);
        System.out.println("Is the array sorted? " + result);
    }
    public static boolean isSorted(int[] arr, int index) {
        // Base case:
        if (index == arr.length - 1 || arr.length == 0) return true;
        
        if (arr[index] > arr[index + 1]) return false;
        return isSorted(arr, index + 1);
    }
}