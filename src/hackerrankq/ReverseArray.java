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
        int start = 0;
        for (int i = ar.length - 1; i >= 0; i--) {
            newarray[start] = ar[i];
            start++;
        }
        return newarray;
    }

    public static void main(String[] args) {
        int[] jonArray = {1, 2, 3};

        int newArr[] = jonArrayReverse(jonArray, 3);


        for (int i = 0; i < jonArray.length; i++) {
            System.out.println(newArr[i]);
        }
        int[] testarr = {1,2,3,4,5};

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
