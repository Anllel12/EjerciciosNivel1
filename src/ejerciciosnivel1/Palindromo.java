
package ejerciciosnivel1;

/**
 *
 * @author Angel Esquinas
 */
public class Palindromo {
    
    Boolean palindromo=false;
    
    String frase;
    String auxiliar="";
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        
        Palindromo ejercicios=new Palindromo();
        
        ejercicios.palindromo("ACASO HUBO BUHOS ACA");
    }
    public void palindromo(String palabraA){
        
        int a;
        int b;
        
        palabraA = palabraA.toUpperCase();//pongp toda la frase en mayusculas
        
        auxiliar = quita(palabraA);//quito todos los espacios
        
        a=0;
        b=auxiliar.length()-1;
        
        while(a<=b && auxiliar.charAt(a)==auxiliar.charAt(b)){//cominezo a comparar todas las letras
            a++;
            b--;
        }
        if(a>=b){
            System.out.println("Es un palindromo");
        }
        else{
            System.out.println("No es un palindromo");
        }
    }
    public String quita(String frase){//quita todos los espacios de una frase
        
        
        
        for(int i=0; i<frase.length(); i++){
           
            if (frase.charAt(i) != ' '){
                auxiliar = auxiliar + frase.charAt(i);
            }
        }
        return auxiliar;
    }
}
