package Day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] array = new int[m][n];
        int maxRow = 0;
        int index = 0;

        for (int i = 0; i < m; i++) {
            int rowsSum = 0;
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 50);
                System.out.print(array[i][j] + " ");
                rowsSum += array[i][j];
            }
            System.out.println(rowsSum);
            if (maxRow < rowsSum) {
                maxRow = rowsSum;
                index = i;
            }
        }
        System.out.println(index);
    }
}
