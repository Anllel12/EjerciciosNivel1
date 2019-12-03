
package ejerciciosnivel1;

/**
 *
 * @author Angel Esquinas
 */
public class ArraysMaximos {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArraysMaximos ejercicio = new ArraysMaximos();
        
        System.out.println("ejerciciosnivel1.ArraysMaximos.main()");
    }
    
    int[] listaNumeros={50, 31, 27, 2, 5, 99};
    
    public int[] maximos(int[] lista){
        int [] arrayMaximos={lista[0], lista[0]};
        for(int i=0; i<lista.length; i++){
            if(auxiliar<lista[i]){
                auxiliar=lista[i];
            }
        }
        return arrayMaximos;
    }
}
