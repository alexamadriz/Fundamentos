
package semana9;


public class Semana9 {

  
    public static void main(String[] args) {
//        int [] [] matriz = new int [5] [5];
        int [] [] matriz = {
            {1,5,7,4,3},
            {2,1,6,2,1},
            {3,4,1,3,4},
            {4,5,1,6,7},
            {5,9,7,1,3}
        
                
        };
        int nDiagonal= 0;
        boolean hasAssignedNDiagonal = false;
        boolean diagonalOk = true;
                for (int i=0; i< matriz.length; i++){
            for (int j=0; j < matriz[1].length; j++){
                if (i==j){
                    if (! hasAssignedNDiagonal){
                         hasAssignedNDiagonal = true;
                         nDiagonal = matriz [i][j];
                    } else if (nDiagonal !=matriz [i][j]){
                        diagonalOk = false;
                    }
                    }
                }
                }
                System.out.println("Diagonal: " + (diagonalOk ? "Ok" : "Mal"));
    }
}

    
//        int contador =1;
//        
//        for (int i=0; i< matriz.length; i++){
//            for (int j=0; j < matriz[1].length; j++){
//                if ()
//            }
////                matriz [i][j]= contador++;
////                System.out.print(matriz [i][j] + " ");
//           
//           
//            System.out.println("");
//            }}
    
    

