/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package futbol;
import java.util.Scanner;
/**
 *
 * @author jairo
 */
public class Futbol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velini, angulo, t, x;
         
        System.out.println("Ingrese la velocidad inicial");
        velini = sc.nextInt();
        
        System.out.println ("Ingrese el angulo");
        angulo = sc.nextInt();
        
        t= (2*(velini/9.8)) * (Math.sin(Math.toRadians(angulo)));
        System.out.println("El tiempo de vuelo de la pelota es: " +t);
        
        x= (velini* (Math.cos(Math.toRadians(angulo)))*t);
        System.out.println("La distancia recorrida por la pelota es: " +x);
        // TODO code application logic here
    }
    
}

