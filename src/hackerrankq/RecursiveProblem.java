package hackerrankq;

public class RecursiveProblem {

    public static void main(String[] args) {

        System.out.println(fibi(6));

        System.out.println(fact(5));

    }


    static int fibi(int n) {
        if (n == 1 || n == 0)
            return n;
        else
            return fibi(n - 2) + fibi(n - 1);
    }

    static int fact(int n) {
        if (n < 2)
            return 1;
        else
            return n * fact(n - 1);

    }
}
