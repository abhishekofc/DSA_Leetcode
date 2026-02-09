public class MergeSort {

    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end) return; // base case

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);      // left part
        mergeSort(arr, mid + 1, end);    // right part
        merge(arr, start, mid, end);     // merge
    }

    public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];

        int i = start;     // left subarray pointer
        int j = mid + 1;   // right subarray pointer
        int k = 0;         // temp array pointer

        // compare and merge
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // remaining left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // remaining right part
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // copy temp back to original array
        int x = start;
        for (k = 0; k < temp.length; k++) {
            arr[x++] = temp[k];
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
