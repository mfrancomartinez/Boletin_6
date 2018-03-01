/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_6_3;

/**
 *
 * @author mfrancomartinez
 */
public class Banco {
 public static void main(String [] args) { 
 //Se crea la cuenta 
 Cuenta cuenta_1 = new Cuenta(123456, 2505.32); 
 // Se consulta el saldo 
 double total_cuenta=cuenta_1.saldo; 
 System.out.println("Total actual en la cuenta: "  
 +total_cuenta +"Euros"); 
 }//del main 
}//de la clase Banco 

