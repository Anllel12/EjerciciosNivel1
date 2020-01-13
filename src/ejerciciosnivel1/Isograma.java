
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
    }
    
    public void isograma(String palabra){
        
        int a=0;
        int b=palabra.length();
        
        boolean isograma=false;
        
        palabra=palabra.toUpperCase();
        
        for(int i=0; i<palabra.length()-1; i++){
            for(int j=1; j<palabra.length(); j=j+i){
                if(palabra.charAt(i)==palabra.charAt(j)){
                    isograma=true;
                }
            }
        }
        if(isograma ==true){
            System.out.println("No es un isograma."); 
        } 
        if(isograma ==false){
            System.out.println("Es un isograma."); 
        }   
        System.out.println(isograma);
        System.out.println(palabra);
    }
}
