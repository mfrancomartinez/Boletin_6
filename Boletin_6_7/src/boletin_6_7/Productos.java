/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_6_7;

/**
 *
 * @author mfrancomartinez
 */
public class Productos {
    String codigo1 = "C1";
    int precio1 = 24;
    String codigo2 = "H23";
    int precio2 = 234;
    String codigo3 = "M30";
    int precio3 = 109;
    String codigo4 = "K123";
    int precio4 = 247;

    public Productos() {
    }
    
    public void imprimirfactura (){
        System.out.println("(codigo:"+codigo1+" , precio:"+precio1+")"+" ; "+"(codigo:"+codigo2+" , precio:"+precio2+")"+" ; "+"(codigo:"+codigo3+" , precio:"+precio3+")"+" ; "+"Importe total: "+(precio1+precio2+precio3));
    }
    public void imprimirfactura2(){
     System.out.println("(codigo:"+codigo1+" , precio:"+precio1+")"+" ; "+"(codigo:"+codigo4+" , precio:"+precio4+")"+" ; "+"(codigo:"+codigo3+" , precio:"+precio3+")"+" ; "+"Importe total: "+(precio1+precio4+precio3));   
    }
}
