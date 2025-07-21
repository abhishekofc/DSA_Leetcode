
class MissingNumber {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        return n * (n + 1) / 2-total;
    }
    public static void main(String[] args) {
        int[] nums = {0,1, 2, 4};
        MissingNumber solution = new MissingNumber();
        int ans = solution.missingNumber(nums);
        System.out.println("The missing number is: " + ans);
    }
}
