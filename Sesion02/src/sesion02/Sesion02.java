/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sesion02;
import Clases.Persona;
import Clases.Movil;
/**
 *
 * @author Alumnos
 */
public class Sesion02 {

   
    public static void main(String[] args) {
        // TODO code application logic here
       
        Persona p1=new Persona ("Alejandro",18,"Masculino","70162352",1.83);
        p1.presentarse();
       
        
      
        
        Movil p3=new Movil("LG-A225", "Morado", "V10a-JUN-17-2011", "Alejandro", "Java", 7.64, 953859403);
        
        p3.presentarse1();
        
        
               
        
    }
    
    
    
    
}
