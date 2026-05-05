import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 2, 6},
                {7, 2, 1}
        };

        // просто перевірка
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        int result = MatrixUtils.findMostFrequent(matrix);
        System.out.println("Most frequent: " + result);
    }
}