
package ejerciciosnivel1;

/**
 *
 * @author Angel Esquinas
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arrays ejercicio = new Arrays();
        System.out.println(ejercicio.maximos(ejercicio.listaNumeros));
    }
    
    int[] listaNumeros={50, 31, 27, 2, 5, 99};
    
    public int maximos(int[] lista){
        int auxiliar=lista[0];
        for(int i=0; i<lista.length; i++){
            if(auxiliar<lista[i]){
                auxiliar=lista[i];
            }
        }
        return auxiliar;
    }

}
