class Solution {

    public int bs(int[] nums, int target, int left, int right)
    {
        int middle = 0;

        while(left <= right){
            middle = (left+right)/2;

            if (nums[middle] == target) {return middle;}
            if (nums[middle] > target){return bs(nums, target, left, middle-1);}
            if (nums[middle] < target) {return bs(nums, target, middle +1, right);}
        }
        return -1;
    }    


    public int search(int[] nums, int target) {
        return(bs(nums, target, 0, nums.length-1));
    }
}