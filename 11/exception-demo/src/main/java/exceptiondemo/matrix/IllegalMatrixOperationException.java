package exceptiondemo.matrix;

public class IllegalMatrixOperationException extends Exception {
    private Matrix matrix1;
    private Matrix matrix2;

    public IllegalMatrixOperationException(Matrix matrix1, Matrix matrix2) {
        super();
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    @Override
    public String getMessage() {
        return String.format("The dimensions of matrix 1 [%d, %d] and matrix 2 [%d, %d] do not match",
                matrix1.getRows(), matrix1.getCols(),
                matrix2.getRows(), matrix2.getCols());
    }
}
