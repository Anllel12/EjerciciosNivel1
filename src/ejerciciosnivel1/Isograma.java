
package ejerciciosnivel1;

/**
 *
 * @author Angel Esquinas
 *
 */
public class Isograma {
    
    public static void main(String[] args) {
        
        Isograma ejercicios=new Isograma();
        
        ejercicios.isograma("pala");
        ejercicios.isograma("arroz");
        ejercicios.isograma("igor");
        ejercicios.isograma("fernando");
    }
    
    public void isograma(String palabra){
        
        int a=0;
        int b=palabra.length();
        
        boolean isograma=false;
        
        palabra=palabra.toUpperCase();
        
        for(int i=0; i<palabra.length()-1; i++){//compara cada letra de la palabra
            for(int j=i+1; j<palabra.length(); j++){
                if(palabra.charAt(i)==palabra.charAt(j)){//si los caracteres son iguales entra
                    isograma=true;
                }
            }
        }
        if(isograma ==true){//si ha entrado en el if anterior imprime una cosa u otra
            System.out.println(palabra + " No es un isograma."); 
        } 
        else{
            System.out.println(palabra + " Es un isograma."); 
        }   
    }
}
