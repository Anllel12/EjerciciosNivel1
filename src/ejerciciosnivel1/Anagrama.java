
package ejerciciosnivel1;

/**
 *
 * @author Angel Esquinas
 */
public class Anagrama {
    
    public static void main(String[] args) {
        
        Anagrama ejercicios=new Anagrama();
        
        ejercicios.anagrama("roma", "amor");
    }
    
    public void anagrama(String palabraA, String palabraB){
        
        boolean anagrama=false;
        
        if(palabraA.length()!=palabraB.length()){
            
            System.out.println(palabraA + " y " + palabraB + " No es un anagrama.");
        }
        else{
            for(int i=0; i<palabraA.length(); i++){
                for(int j=i+1; j<palabraB.length(); j++){
                    if(palabraA.charAt(i)==palabraB.charAt(j)){//si los caracteres son iguales entra
                    
                    }
                }
            }
        }
        
    }
}
