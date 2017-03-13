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
public class Movil {
    String Modelo;
    String Color;
    String Version;
    String Propietario;
    String Sistema;
    double Memoria;
    int Numero;

    public Movil(String Modelo, String Color, String Version, String Propietario, String Sistema, double Memoria, int Numero) {
        this.Modelo = Modelo;
        this.Color = Color;
        this.Version = Version;
        this.Propietario = Propietario;
        this.Sistema = Sistema;
        this.Memoria = Memoria;
        this.Numero = Numero;
    }

   
    
    public void Llamando(){
        System.out.println("Llamando...");
    }
    public void Llamada (){
        System.out.println("Recibiendo llamada...");
    }
    
    
    public void presentarse1(){
        JOptionPane.showMessageDialog(null,"Modelo de mi celular " +Modelo+"\n"+
                "Su color es: "+Color+"\n"+
                "Sistema operativo: "+Sistema+"\n"+
                "Su version: "+Version+"\n"+
                "Memoria de: "+Memoria+"GB"+"\n"+
                "Numero del Telefono: "+Numero+"\n"+
                "El propietario del movil es : "+Propietario+"");    
}
}