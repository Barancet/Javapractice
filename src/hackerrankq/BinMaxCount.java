package hackerrankq;

import java.util.Arrays;

public class BinMaxCount {

    public static void main(String[] args){

        int[] testArr = {1,0,1,1,1,1,1,1,1,0,0,1};

        System.out.println(binaryMaxCons(testArr));
        int a = 10;
        int b = 20;
        System.out.println(Math.max(a,b ));

    }

    public static int binaryMaxCons(int[] arr) {
        int countOne = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countOne++;
                max = Math.max(max, countOne);
            } else {
                countOne = 0;
            }
        }
        return max;
    }
}
