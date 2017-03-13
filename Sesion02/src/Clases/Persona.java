/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumnos
 */
public class Persona {
    String nombre;
    int edad;
    String genero;
    String documento;
    double talla;

    public Persona(String nombre, int edad, String genero, String documento, double talla) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
        this.talla = talla;
    }
    
    

    public void dormir(){
        System.out.println("Estoy durmiendo zzZZZzz");
    }
    public void comer (){
        System.out.println("Me estoy alimentando :o");
    }
    public void caminar (){
        System.out.println("Estoy caminando :v");
    }
    public void presentarse(){
        JOptionPane.showMessageDialog(null, "Hola, mi nombre es: " +nombre+"\n"+
                "Mi genero es: "+genero+"\n"+
                "y tengo: "+edad+" años\n"
                +"mido: " +talla+"mts.\n"
                +"y me identifico con mi Dni Nro. "+documento+".");
                }
    }
        
        
    
    
    
