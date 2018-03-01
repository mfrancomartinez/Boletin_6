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
public class Cuenta {
    protected int numero_cuenta; 
 protected double saldo; 
 
 public Cuenta(int cuenta, double inicial) { 
 numero_cuenta=cuenta; 
 saldo = inicial; 
 } // Fin constructor cuenta 
 
 public void depositar(double cantidad) { 
 saldo = saldo + cantidad; 
 } // Fin método deposito 
 
 public double saldo(){ 
 return saldo; 
 } // Fin método saldo 
}//fin clase Cuenta

