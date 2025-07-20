class LeftRotate {
    public void rotateArray(int[] nums) {
        int k = 1;
        int n = nums.length;
        k=k%n;
        int[] rotate = new int[n];

        for(int i=0;i<n;i++){
            rotate[(i-k+n)%n]=nums[i];
        }

        for(int i =0;i<n;i++){
            nums[i]=rotate[i];
        }
        
    }
    public static void main(String[] args) {
        LeftRotate solution = new LeftRotate();
        int[] nums = {1, 2, 3, 4, 5};
        solution.rotateArray(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}