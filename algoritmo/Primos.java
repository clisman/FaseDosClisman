/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primos;
import java.util.Scanner;
/**
 *
 * @author jairo
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);  
         int a=0,i,n;  
         System.out.println("Ingrese numero");  
         n=sc.nextInt();
         for(i=1;i<(n+1);i++){  
         if(n%i==0){   
             a++;  
            }  
         }  
         if(a!=2){  
              System.out.println("No es Primo");  
            }else{  
                System.out.println("Si es Primo");  
         }  
        // TODO code application logic here
    }
    
}
