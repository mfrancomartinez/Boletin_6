/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_6_5;

/**
 *
 * @author mfrancomartinez
 */
public class Libro {
   private String titulo; 
 private Autor autor; 
 public Libro(String titulo, Autor autor) { 
 this.titulo = titulo; 
 this.autor = autor; 
 } 
 public Autor getAutor() { 
 return autor; 
 } 
 public String getTitulo() { 
 return titulo; 
 }   
}
