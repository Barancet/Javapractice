package hackerrankq;

import java.util.ArrayList;
import java.util.List;

public class ArrayProblems {

    //returns the length of the array with all duplicates removed
    public static int removeDuplicateArray(int[] nums) {

        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

    //returns array length with all target integers removed.
    public static int removeTargetArray(int[] arr, int target) {
        if (arr.length == 0 || arr == null) {
            return 0;
        }
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

    //find even numbered digits in array eg 1414 is even amount of digits
    public static int findNumbers(int[] nums) {
        int digitscount = 0;
        for (int i = 0; i < nums.length; i++) {

            int numslength = nums[i];
            String str = Integer.toString(numslength);

            if (str.length() % 2 == 0) {
                digitscount++;
            }
        }
        return digitscount;
    }

    //rotate array K times to the right (n*k time)
    public static void rotatedArray(int[] nums, int k) {
        int index = 0;
        if (nums.length == 0 || nums == null) {
            System.out.println("array was empty");
        }
        while (k > 0) {
            int tempShifted = nums[nums.length - 1];

            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[index] = tempShifted;
            k--;
            //[1,2,3,4,5,6,7]
        }
    }

    //method to rotate array left

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int len = nums.length;

        reverseArray(nums, 0, len - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, len - 1);
    }


    public static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int tempLast = nums[end];
            nums[end] = nums[start];
            nums[start] = tempLast;
            start++;
            end--;
        }
    }

    //find all duplicates in non sorted array
    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> outputArr = new ArrayList();
        //[4,3,2,7,8,2,3,1]
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                outputArr.add(index + 1);
            }
            nums[index] = -nums[index];
        }
        return outputArr;
    }


    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 4, 5};
        int[] digitsArr = {555, 901, 482, 1771};
        int[] nonRotated = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(removeDuplicateArray(arr));
        System.out.println(removeTargetArray(arr, 3));
        System.out.println(findNumbers(digitsArr));
        System.out.println("---------------");

        for (int i = 0; i < nonRotated.length; i++) {
            System.out.print(nonRotated + " ");
        }
    }


}
