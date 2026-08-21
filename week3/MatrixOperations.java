import java.util.Scanner;
public class MatrixOperations {

    public int[] rowSums(int[][] matrix) {
        int n = matrix.length;
        int l = matrix[0].length;
        int[] rowmat = new int[n];
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j < l; j++) {
                s += matrix[i][j];
            }
            rowmat[i] = s;
        }
        return rowmat;
    }
    public int[] columnSums(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] colmat = new int[c];
        for (int j = 0; j < c; j++) {
            int s = 0;
            for (int i = 0; i < r; i++) {
                s += matrix[i][j];
            }
            colmat[j] = s;
        }
        return colmat;
    }
    public int[][] add(int[][] f1, int[][] f2) {
        int r = f1.length;
        int c = f1[0].length;
        int[][] addmat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                addmat[i][j] = f1[i][j] + f2[i][j];
            }
        }
        return addmat;
    }
    public void matprint(int[] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Sum " + (i + 1) + " is " + matrix[i]);
        }
    }


    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public int[][] input_mat(int r, int c) {
        int[][] mat = new int[r][c];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int n = s.nextInt();
                mat[i][j] = n;
            }
        }
        return mat;
    }

    public int[][] transpose(int[][] m) {
        int[][] tp = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                tp[j][i] = m[i][j];
            }
        }
        return tp;
    }

    public int[][] multiply(int[][] f1, int[][] f2) {
        int r1 = f1.length;
        int c1 = f1[0].length;
        int r2 = f2.length;
        int c2 = f2[0].length;
        int[][] mulmat = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int s = 0;
                for (int k = 0; k < c1; k++) {
                    s += f1[i][k] * f2[k][j];
                }
                mulmat[i][j] = s;
            }
        }
        return mulmat;
    }
    public static void main(String[] args) {
        MatrixOperations ob = new MatrixOperations();        
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] mat2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        System.out.println("Row Sums of Mat1:");
        int[] rSum = ob.rowSums(mat1);
        ob.matprint(rSum);
        System.out.println("Transpose of Mat1:");
        int[][] tMat = ob.transpose(mat1);
        ob.printMatrix(tMat);
        System.out.println("Multiplication of Mat1 and Mat2:");
        int[][] prod = ob.multiply(mat1, mat2);
        ob.printMatrix(prod);
    }
}