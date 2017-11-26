/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
        // crear una nueva instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        // leer el numero de elementos
          System.out. print("Ingrese la cantidad de numeros que se va ingresar:");
         int N= sc.nextInt();
         
          float [] notas=new float[N];
          // System.out. println("Ingrese las notas:");
          //for para la posicion
          
        for (int i = 0; i <notas.length; i++) {
            System.out. print("Elemento "+(i+1)+":"); 
             notas[i]= sc.nextInt();
            
        }          
        
        //comprobar q sea menor q 20
        float suma=0;
       for (int i = 0; i <notas.length; i++){
           suma=suma+notas[i];
       }
        System.out. print("La suma es  "+suma+":"); 
           

    }
}

   
