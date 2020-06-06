package top_Interview_Question.easy;

import java.util.Arrays;

public class Contains_Duplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for ( int i = 0 ; i < nums.length-1 ; i++ ) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Contains_Duplicate duplicate = new Contains_Duplicate();
        int[] num = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(duplicate.containsDuplicate(num));
    }
}
