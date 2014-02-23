/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindromo;
import java.util.Scanner;
/**
 *
 * @author jairo
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*objeto scanner para que lea en consola la cadena*/
        Scanner en = new Scanner(System.in);
         /*le asignamos a una variable y para que lea una linea completa*/
        String clis = en.nextLine();
        
        int cont = 1;
         /*i igual a 0 y menor a la longitud de la cadena y luego incrementando*/
        for (int i = 0; i < clis.length(); i++){
             /*condicion comparando posicion de letra con la longitud como espejo !: sino se cumple alguno*/
            if (clis.charAt(i) != clis.charAt(clis.length()-1-i)){
                cont = 0 ; break;
            }
        }
        System.out.println( cont == 1 ? "si es palindromo" : " no es palindromo");
        // TODO code application logic here
    }
    
}
