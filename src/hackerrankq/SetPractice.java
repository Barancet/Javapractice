package hackerrankq;

import java.util.*;

public class SetPractice {


    public static void main(String[] args) {

        // Create an Array

        int[] nums = {1, 2, 3, 4};

        for (int t = 0; t < nums.length; t++) {
            System.out.println(nums[t]);
        }

        reverseArray(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


        System.out.println(reverseInt(123));

//        set.add(1);
//        set.add(3);
//        set.add(3);
//        set.add(7);
//
//        for(int i : set){
//            System.out.println(i);
//        }
    }

    public static <T> Set<T> newArr(T a[]) {

        Set<T> newpassedset = new HashSet<>();

        for (T t : a) {
            newpassedset.add(t);
        }
        return newpassedset;
    }


    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }

    public static int reverseInt(int x) {
        int rev = 0;
        while (x != 0) {
            int tempRem = x % 10;
            rev = tempRem + rev * 10;
            x = x / 10;
        }
        return rev;
    }


}
