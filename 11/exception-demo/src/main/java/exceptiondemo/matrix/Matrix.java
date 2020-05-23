package exceptiondemo.matrix;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Matrix {
    private int matrix[][];

    public Matrix(int rows, int cols) {
        matrix = new int[rows][cols];
    }

    public Matrix(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        this.matrix = new int[rows][cols];
        System.arraycopy(matrix, 0, this.matrix, 0, matrix.length);

//        for (int r = 0; r < rows; r++)
//            for (int c = 0; c < cols; c++)
//                this.matrix[r][c] = matrix[r][c];
    }

    public int getRows() {
        return matrix.length;
    }

    public int getCols() {
        return matrix[0].length;
    }

    public Matrix add(Matrix that) throws IllegalMatrixOperationException {
        if (this.getRows() != that.getRows() || this.getCols() != that.getCols())
            throw new IllegalMatrixOperationException(this, that);

        Matrix result = new Matrix(getRows(), getCols());

        for (int r = 0; r < getRows(); r++)
            for (int c = 0; c < getCols(); c++)
                result.matrix[r][c] = this.matrix[r][c] + that.matrix[r][c];

        return result;
    }

    // TODO write the other matrix operations (like subtract, multiply) and test them

    public int[][] getMatrix() {
        return matrix;
    }

    @Override
    public String toString() {
        // Will explain the stream thing later
        return "Matrix{" +
                "matrix=" +
                Arrays.stream(matrix)
                    .map(row -> Arrays.toString(row))
                    .collect(Collectors.joining(", "))
                + '}';
    }
}
