
package ejerciciosnivel1;

/**
 *
 * @author Angel Esquinas
 *
 * Este programa te dice si una frase es un palindromo
 * es decir si se lee igual de derecha a izquierda que viceversa
 *
 */
public class Palindromo {
    
    Boolean palindromo=false;
    
    String frase;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Palindromo ejercicios=new Palindromo();
        
        ejercicios.palindromo("ACASO HUBO BUHOS ACA");
        ejercicios.palindromo("DABALE ARROZ A LA ZORRA EL ABAD");
        ejercicios.palindromo("Allí por la tropa portado");
        ejercicios.palindromo("traído a ese paraje de maniobras");
        ejercicios.palindromo("una tipa como capitán usar boina me dejara");
        ejercicios.palindromo("pese a odiar toda tropa por tal ropilla");
        ejercicios.palindromo("ligar es ser agil");
    }
    public void palindromo(String palabraA){
        
        int a;
        int b;
        
        String auxiliar="";
        
        palabraA = palabraA.toUpperCase();//pongp toda la frase en mayusculas
        
        auxiliar = quita(palabraA);//quito todos los espacios
        
        a=0;
        b=auxiliar.length()-1;
        
        while(a<b && auxiliar.charAt(a)==auxiliar.charAt(b)){//cominezo a comparar todas las letras
            a++;
            b--;
        }
        if(a>=b){
            System.out.println(palabraA + " Es un palindromo");
        }
        else{
            System.out.println(palabraA + " No es un palindromo");
        }
    }
    public String quita(String frase){//quita todos los espacios de una frase
        
        String auxiliar2="";
        
        for(int i=0; i<frase.length(); i++){           
            if (frase.charAt(i) != ' '){
                auxiliar2 = auxiliar2 + frase.charAt(i);
            }
        }
        return auxiliar2;
    }
}
