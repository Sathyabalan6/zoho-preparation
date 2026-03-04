public class MatrixRotation {

    // 90 degrees clockwise: Transpose → reverse each row
    public static void rotate90(int[][] matrix) {

        for(int  i=0; i< matrix.length; i++){
            for(int j= i + 1; j <matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ; 
            }
        }
        //reverse
        
        for(int i = 0; i< matrix.length; i++){
            int l = 0 , r = matrix.length - 1;
            while(l < r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }

    }
    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.printf("%3d", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original:"); print(matrix);

        rotate90(matrix);
        System.out.println("90° CW:"); print(matrix);

        rotate90(matrix);
        System.out.println("180°:"); print(matrix);

        rotate90(matrix);
        System.out.println("270° CW:"); print(matrix);
    }
}

// **Output:**
// ```
// Original:        90° CW:         180°:           270° CW:
//   1  2  3          7  4  1          9  8  7          3  6  9
//   4  5  6          8  5  2          6  5  4          2  5  8
//   7  8  9          9  6  3          3  2  1          1  4  7