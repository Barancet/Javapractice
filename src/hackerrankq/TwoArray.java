package hackerrankq;

public class TwoArray {

    public static void main(String[] args) {
        int[][] array2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int rows = array2d.length;
        int columns = array2d[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(rows);
        System.out.println(columns);
    }
}
