
package ejerciciosnivel1;

import java.util.Arrays;

/**
 *
 * @author Angel Esquinas
 *
 */

public class Acronimo {
    
    public static void main(String[] args) {
        
        Acronimo ejercicios=new Acronimo();
        
        //ejercicios.acronimo("Alta Velocidad Española");
        //ejercicios.acronimo("Objeto Volador No Identificado");
        ejercicios.acronimo("Tecnología de la Información y de las Comunicaciones");
    }
    
    String[] noCompare= {"y", "e", "de", "la", "las"};
    
    boolean igual=false;
    
    public void acronimo(String palabra){
        
        String auxiliar="";
        
        if(palabra.charAt(0)!=' '){
            auxiliar=auxiliar+palabra.charAt(0);
        }
        for(int i=1; i<palabra.length()-1; i++){
            if(palabra.charAt(i)==' '){
                compare(palabra.substring(i+1, i+2));
                compare(palabra.substring(i+1, i+3));
                compare(palabra.substring(i+1, i+4));
                
            }        
        }
    }
    
    public void compare(String frase){
        for(int j=0; j<frase.length(); j++){
            if(frase.equalsIgnoreCase(noCompare[0]) || frase.equalsIgnoreCase(noCompare[1]) || frase.equalsIgnoreCase(noCompare[2]) || frase.equalsIgnoreCase(noCompare[3]) || frase.equalsIgnoreCase(noCompare[4])){
                igual=true;
            }
        }
        System.out.println(frase);
        System.out.println(igual);
        System.out.println(Arrays.toString(noCompare));
    }
}
