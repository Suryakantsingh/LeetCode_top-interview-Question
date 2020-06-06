package top_Interview_Question.easy;

public class Rotate_Array {

    public void rotate(int[] nums, int k) {

        for (int i = 0; i < k; i++) {
            int r = nums.length - 1;
            int l = 0;

            while (r >= l) {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                r--;
                l++;

            }

            r = nums.length - 1;
            l = 1;

            while (r >= l) {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                r--;
                l++;

            }
        }
        for( int j = 0 ;j<nums.length ;j++) {
            System.out.print(nums[j]+" ");
        }
    }

    public static void main(String[] args) {
        Rotate_Array rotate = new Rotate_Array();
        int[] nums = {1,2,3,4,5,6};
        int k = 11;
        rotate.rotate(nums,k);
    }
}
