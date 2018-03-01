/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_6_4;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
 Clase1 obj1= new Clase1(7); 
 Clase1 obj2= new Clase1(9); 
 obj2=obj1; 
 System.out.print(obj1.valorprop()+" "); 
 System.out.print(obj2.valorprop()+" "); 
 }//fin main 
    }
    /*resultado= 9 9*/
/*resultado sin static= error */

