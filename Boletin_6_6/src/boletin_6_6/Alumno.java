/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_6_6;

/**
 *
 * @author mfrancomartinez
 */
public class Alumno {
    String nombre = "Alumno 1"; 
 char grupo ='A'; 
 char devolvergrupo() { 
 return grupo; 
 } 
 void cambiargrupo(char nuevogrupo) { 
 grupo = nuevogrupo; 
 } 
 void imprimir() { 
 System.out.println("Nombre: " + nombre); 
 System.out.println("Grupo: " + devolvergrupo()); 
 } 
}
