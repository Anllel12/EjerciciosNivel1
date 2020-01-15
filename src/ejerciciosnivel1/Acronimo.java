
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
    
    String auxiliar="";//añodo las letras del acronimo
    
    boolean igual=false;
    
    public void acronimo(String palabra){
        
        if(palabra.charAt(0)!=' '){
            auxiliar=auxiliar+palabra.charAt(0);
        }
        for(int i=1; i<palabra.length(); i++){
            if(palabra.charAt(i)==' '){//si ahi un espacio entra
                compare(palabra.substring(i+1, i+2));
                if(igual==false){//si el substring no esta en el array vuelve a comparar
                    compare(palabra.substring(i+1, i+3));
                }
                else if(igual==true){//si el substring es igual a alguna palabra del array suma al vaor de "i" para que avance y cambia la booleana
                    i++;
                    igual=false;
                    System.out.println("ha entrado");
                    System.out.println(igual);
                }
                if(igual==false){//si el substring no esta en el array vuelve a comparar
                    compare(palabra.substring(i+1, i+4));
                }
                else if(igual==true){//si el substring es igual a alguna palabra del array suma al vaor de "i" para que avance y cambia la booleana
                    i+=2;
                    igual=false;
                    System.out.println("ha entrado");
                    System.out.println(igual);
                }
                if(igual==false){//despues de comparar tres veces y al no ser ninguna true es porque no es una palabra del las cuales no ahi que leer entonces la pacamos al Acronimo
                    auxiliar=auxiliar+palabra.charAt(i+1);
                }
                else if(igual==true){//si por ultimo es una de las palabra del array saltamos la palabra y seguimos 
                    i+=3;
                    igual=false;
                    System.out.println("ha entrado");
                    System.out.println(igual);
                    
                }
                System.out.println(Integer.toString(i));
                
            }
            
        }
        
    }
    
    public void compare(String frase){//compara el substring con las palabras del array
            if(frase.equalsIgnoreCase(noCompare[0]) || frase.equalsIgnoreCase(noCompare[1]) || frase.equalsIgnoreCase(noCompare[2]) || frase.equalsIgnoreCase(noCompare[3]) || frase.equalsIgnoreCase(noCompare[4])){
                igual=true;
            }
        System.out.println(frase);
        System.out.println(igual);
        System.out.println(auxiliar);
        
    }
}
