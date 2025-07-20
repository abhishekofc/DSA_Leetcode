class LeftRotateByOne {
    public void rotateArrayByOne(int[] nums) {
        /*Approach 1 Brute Force  
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
        */
        // Approach 2 Using Cyclic Replacement
        int k =1;
        int n=nums.length;
        k=k%n;
        int[] rotated= new int[n];
        for(int i=0;i<n;i++){
            rotated[(i-k+n)%n]=nums[i]; 
        }
        for(int i=0;i<n;i++){
            nums[i]=rotated[i];
        }
    }

    public static void main(String[] args) {
        LeftRotateByOne solution = new LeftRotateByOne();
        int[] nums = {1, 2, 3, 4, 5};
        solution.rotateArrayByOne(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
