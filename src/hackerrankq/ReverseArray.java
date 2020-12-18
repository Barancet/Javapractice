package hackerrankq;

public class ReverseArray {

    public static int[] reverseArray(int[] ar, int start, int end) {
        while (start < end) {
            int temp = ar[end];
            ar[end] = ar[start];
            ar[start] = temp;
            start++;
            end--;
        }
        return ar;
    }


    public static int[] jonArrayReverse(int[] ar, int n) {

        int[] newarray = new int[n];
        int counter = 0;

        for (int i = ar.length - 1; i >= 0; i--) {
            newarray[counter] = ar[i];
            counter++;
        }
        return newarray;
    }

    public static void main(String[] args) {


        int[] jonArray = {1, 2, 3};

        int newArr[] = jonArrayReverse(jonArray, 3);


        for (int i = 0; i < 3; i++) {
            System.out.println(newArr[i]);
        }


        int[] testarr = new int[4];
        testarr[0] = 1;
        testarr[1] = 2;
        testarr[2] = 3;
        testarr[3] = 4;

        System.out.println("before reversing");
        for (int i = 0; i < testarr.length; i++) {
            System.out.println(testarr[i]);
        }

        System.out.println("After reversing");
        reverseArray(testarr, 0, testarr.length - 1);

        for (int i = 0; i < testarr.length; i++) {
            System.out.println(testarr[i]);
        }
    }
}
