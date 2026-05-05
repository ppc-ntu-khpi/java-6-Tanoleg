import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Клас для роботи з матрицями
 */
public class MatrixUtils {

    /**
     * Знаходить число, яке найчастіше зустрічається в матриці
     */
    public static int findMostFrequent(int[][] matrix) {
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));

        return map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }
}