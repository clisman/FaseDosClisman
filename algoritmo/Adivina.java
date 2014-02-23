/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adivina;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jairo
 */
public class Adivina {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ola = new Random();
        Scanner sc = new Scanner(System.in);
        int numero=ola.nextInt(100)+1;
        
        int i=0;
        
        while(i<=100){
            int nums;
            System.out.println("Adivine el numero, Ingrese un numero entre 1 y 100");
            
            nums = sc.nextInt();
            
            
            if (nums>0 && nums<=100){
                
                if(nums==numero){ 
                    System.out.println("Ha adivinado el numero, y es " +numero);
                    
                    break;
                }
                else{
                    System.out.println("No es ese");
                    System.out.println(nums<numero ? "El numero es mayor" : "El numero es menor");
                }
            }
            else{
                System.out.println("El numero no esta entre 1 y 100");
            }  
            i++;
        }
        System.out.println("El numero era: "+numero);
       
        // TODO code application logic here
    }
    
}

