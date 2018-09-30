package pdn.scs.matrix;

public class Matrix{
    private int m,n;
    private double[][] matrix = new double[m][n];
    private double[][] newMatrix;

    public Matrix(int m, int n){
        this.m = m;
        this.n = n;
    }

    public void print(){
        for(double[] i:matrix){
            for(double j :i){
                System.out.println(j + " ");
            }
            System.out.println(" ");
        }
    }

    public int[] get_dimension(){
        int row = matrix.length;
        int col = matrix[0].length;

        int[] dia ={row,col};
        return dia;

    }

    public void add_matrix(double[][] newMatrix){
        this.newMatrix = newMatrix;
        int dia[] = get_dimension();
        double[][] addMatrix = new double[0][];

        if (dia != new int[]{newMatrix.length, newMatrix[0].length}){
            System.out.println("\nThe dimensions of two Matrices are not equal");
        }

        else{

            for (int i = 0; i < newMatrix.length; i++) {
                for (int j = 0; j < newMatrix[0].length; j++) {
                    addMatrix[i][j] = matrix[i][j] + newMatrix[i][j];
                }
            }

            for(double[] i:addMatrix){
                for(double j :i){
                    System.out.println(j + " ");
                }
                System.out.println(" ");
            }
        }

    }
}

