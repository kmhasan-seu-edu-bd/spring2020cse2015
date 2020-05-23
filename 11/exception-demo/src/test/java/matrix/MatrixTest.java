package matrix;

import exceptiondemo.matrix.IllegalMatrixOperationException;
import exceptiondemo.matrix.Matrix;
import org.junit.jupiter.api.Test;

public class MatrixTest {
    @Test
    public void testCreateMatrixByDimension() {
        Matrix matrix = new Matrix(3, 4);
        System.out.println(matrix);
    }

    @Test
    public void testCreateMatrixByData() {
        Matrix matrix = new Matrix(new int[][] {
                {2, 3, 4, 1, 5},
                {1, 3, 2, 5, 7}
        });
        System.out.println(matrix);
    }

    @Test
    public void testAddMatrix() {
        Matrix matrix1 = new Matrix(new int[][] {
                {2, 3, 4, 1, 5},
                {1, 3, 2, 5, 7}
        });
        Matrix matrix2 = new Matrix(new int[][] {
                {1, 5, 3, -1, 5},
                {2, 3, 5, 5, 1}
        });

        try {
            Matrix result = matrix1.add(matrix2);
            System.out.println(result);
        } catch (IllegalMatrixOperationException e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void testAddMatrixOfDifferingDimensions() {
        Matrix matrix2 = new Matrix(new int[][] {
                {2, 3, 4, 1},
                {1, 3, 2, 5}
        });
        Matrix matrix1 = new Matrix(new int[][] {
                {1, 5, 3, -1, 5},
                {2, 3, 5, 5, 1}
        });

        try {
            Matrix result = matrix1.add(matrix2);
            System.out.println(result);
        } catch (IllegalMatrixOperationException e) {
            System.err.println(e.getMessage());
        }
    }
}
