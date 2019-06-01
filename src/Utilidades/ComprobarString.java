
package Utilidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafsniper y mirroriced
 */
public class ComprobarString {
 public static boolean longitudLetraFinal(int numero, String string) {
       try{
       if (string.length() == numero && Character.isLetter(string.charAt(numero - 1)) == true) {            
       } else {
           JOptionPane.showMessageDialog(null, "Error al introducir el DNI. Introduzca " + (numero - 1) + " numeros y 1 letra.");
           return false;
       }
       }catch (NullPointerException ex){
           System.exit(0);
       }
       return true;
   }
   
   public static boolean longitud(int numero, String string){
               try{
       if (string.length() == numero ) {            
       } else {
           JOptionPane.showMessageDialog(null, "Error al introducir la matricula. Introduzca " + numero + " caracteres.");
           return false;
       }
       }catch (NullPointerException ex){
           System.exit(0);
       }
               return true;
   }
}
