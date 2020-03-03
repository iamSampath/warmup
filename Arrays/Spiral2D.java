public class Spiral2D {

    public static void printArray(int[][] arrInput, int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrInput[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printArray(arr, 3, 3);

    }
}
