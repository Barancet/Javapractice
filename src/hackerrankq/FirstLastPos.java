package hackerrankq;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstLastPos {


    static int[] arrFirstLast(int[] arr, int target){

        int[] result = new int[2];
        result[0] = findStartingIndex(arr, target);
        result[1] = findEndingIndex(arr, target);
        return result;
    }

    public static int findStartingIndex(int[] arr, int target){
        int index = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int midpoint = start + (end - start)/2;
            //left logic
            if(arr[midpoint] >= target){
                end = midpoint-1;
            }else{
                //right logic
                start = midpoint+1;
            }
            if(arr[midpoint] == target){
                index = midpoint;
            }
        }
        return index;
    }

    public static int findEndingIndex(int[] arr, int target){
        int index = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int midpoint = start + (end - start)/2;
            if(arr[midpoint] <= target){
                start = midpoint+1;
            } else{
                end = midpoint-1;
            }
            //[ 1, 2, 3, 4, 4, 4, 5, 6, 7 ] target 3
            //first iteration
            //end holds 8
            //midpoint holds index 4
            //start holds index 5
            //
            //next iteration: midpoint = 6 ---> 5 + (8-5)/2 ---> 1+5 = 6
            //arr[6] = 5 numeric value
            // end = 6-1 --> back to the 5th index (4) last index in our array
            if(arr[midpoint] == target){
                index = midpoint;
            }
        }
        return index;
    }


    public static void main(String[] args){

    }
}
