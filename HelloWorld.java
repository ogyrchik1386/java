public class HelloWorld {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        double med = Math.ceil(m / 2);
        int[][] matrix = {
                { 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11 }
        };
        System.out.println("matrix");

        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < med; j++) {
                int result = matrix[i][j];
                matrix[i][j] = matrix[i][m - 1 - j];
                matrix[i][m - 1 - j] = result
                ;
                k++;
            }
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

