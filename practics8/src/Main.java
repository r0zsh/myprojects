public class Main {
    public static void main(String[] args) {
        // One-dimensional array
        int[] numbers = {3, 5, 7};
        System.out.println("One-dimensional array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Two-dimensional array
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        System.out.println("\nTwo-dimensional array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
