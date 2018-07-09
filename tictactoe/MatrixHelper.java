
package tictactoe;


public class MatrixHelper {
    public void print(String[][] matrix) {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public boolean checkWinner(String[][] matrix) {
        return checkSameRows(matrix) || checkSameCols(matrix); || checkDiagonalA(matrix) || checkDiagonalB(matrix);
        
    }
    
    
    private boolean checkSameRows(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String initial = matrix[i][0];
            boolean same = true;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != initial) {
                    same = false;
                }
            }
            if (same) {
                return same;
            }
        }
        return false;
    }
    
    private boolean checkSameCols(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String initial = matrix[0][i];
            boolean same = true;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[j][i] != initial) {
                    same = false;
                }
            }
            if (same) {
                return same;
            }
        }
        return false;
    }
    
    private boolean checkDiagonalA (String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
         String initial = matrix[0][i];
            boolean same = true;
        if (matrix [0][0] == matrix [1][1] & matrix [1][1] == matrix [2][2] && matrix [2][2] == matrix [0][0]){
            return same;
        }
        }
    }

    
     
    private boolean checkDiagonalB (String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
         String initial = matrix[0][i];
            boolean same = true;
        if (matrix [0][2] == matrix [1][1] & matrix [1][1] == matrix [2][2] && matrix [2][0] == matrix [0][0]){
            return same;
    

    
       
        }
        }
    }
    
    

