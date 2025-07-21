import java.util.*;

class MoveZeroes {
    public void moveZeroes(int[] nums) {
       int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        while(j<nums.length){
            nums[j++]=0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        MoveZeroes sol = new MoveZeroes();
        sol.moveZeroes(nums);

        System.out.print("Array after moving zeroes: ");
        System.out.println(Arrays.toString(nums));
    }
}