class Solution {
    public int[] insertionSort(int[] nums)
    {
        int  n = nums.length;
        for(int i =1;i<n;i++)
        {
            int key = nums[i];
            int j = i-1;

            while(j>=0 && nums[j] > key)
            {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }
}
public class InsertionSort {
    
    public static void main(String[] args)
    {
        Solution sol = new Solution();
        int[] nums = {13,46,24,52,20,9};
        System.out.println("Before using insertion Sort: ");
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            System.out.print(num + " ");
        }
        System.out.println();
        nums = sol.insertionSort(nums);
        System.out.println("After using insertion sort:");
        for(int num: nums)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
