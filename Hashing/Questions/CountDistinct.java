import java.util.*;
public class CountDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5};
        System.out.println(countDistinct(arr));
    }

    public static int countDistinct(int[] arr) {
        Set<Integer> distinctElements = new HashSet<>();
        for (int num : arr) {
            distinctElements.add(num);
        }
        return distinctElements.size();
    }
}