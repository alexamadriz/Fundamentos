
package burbuja;


public class Burbuja {
    
    public static int[] burbuja(int[] arreglo)
    {
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 2; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-i;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }


    public static void main(String[] args) {
        int arreglo []= {8,6,7,2,1,8,6,8,7,1,9,7,7,10};
        int arregloOrdenado[] = burbuja(arreglo);
        for(int i = 0; i < arregloOrdenado.length;i++)
        System.out.println(arregloOrdenado[i]);
        
        
    }
}
    