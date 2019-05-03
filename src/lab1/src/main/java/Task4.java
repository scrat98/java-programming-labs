import java.util.Arrays;

public class Task4 {
  public static void main(String[] args) {
    int[] array = {12, 43, 12, -65, 778, 123, 32, 76};
    int max = findMax(array);
    System.out.println("Max: " + max);

    int[][] matrix = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        matrix[i][j] = (int) Math.round(Math.random() * 10);
      }
    }
    printMatrix(matrix);
    transposeMatrix(matrix);
    printMatrix(matrix);
  }

  private static int findMax(int[] array) {
    if (array.length == 0) {
      throw new IllegalStateException("Array must not be empty");
    }
    int maxValue = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > maxValue) {
        maxValue = array[i];
      }
    }
    return maxValue;
  }

  private static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      System.out.println(Arrays.toString(row));
    }
    System.out.println();
  }

  private static void transposeMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = i + 1; j < matrix.length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }
}