
package ejerciciosnivel1;

import java.util.Arrays;

/**
 *
 * @author Angel Esquinas
 * 
 */
public class ArraysMaximos {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArraysMaximos ejercicio = new ArraysMaximos();
        
        System.out.println(Arrays.toString(ejercicio.maximos(ejercicio.listaNumeros)));
    }
    
    int[] listaNumeros={99, 31, 27, 60, 5, 70};//aray de ints
    
    public int[] maximos(int[] lista){
        
        int [] arrayMaximos={lista[0], lista[1]};//te da los dos integers mas altos
        
        for(int i=0; i<lista.length; i++){
            if(arrayMaximos[0]<lista[i]){
                arrayMaximos[1]=arrayMaximos[0];
                arrayMaximos[0]=lista[i];
            }
            else if(arrayMaximos[1]<lista[i] && lista[i]!=arrayMaximos[0]){//por si el primer numero es el mas alto
                arrayMaximos[1]=lista[i];              
            }
        }
        return arrayMaximos;
    }
}
