package hackerrankq;

public class BasicArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 5};
        int[] arr2 = {2, 4, 6};
        System.out.println(avgArray(arr1, arr2));

    }

    //brute force
    public static double avgArray(int[] a, int[] b) {
        double sum = 0;
        double median = 0;
        int alen = a.length;
        int blen = b.length;
        for (int i = 0; i < alen || i < blen; i++) {
            if (i < alen) {
                sum += a[i];
            }
            if (i < blen) {
                sum += b[i];
            }
        }
        return sum / (alen + blen);
    }
}
