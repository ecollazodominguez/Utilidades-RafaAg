
package Utilidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafsniper y mirroriced
 */
public class ComprobarString {
 public static void longitudLetraFinal(int numero, String string) {
       try{
       if (string.length() == numero && Character.isLetter(string.charAt(numero - 1)) == true) {            
       } else {
           JOptionPane.showMessageDialog(null, "Error. Introduzca " + (numero - 1) + " numeros y 1 letra.");
           System.exit(0);
       }
       }catch (NullPointerException ex){
           System.exit(0);
       }
   }
   
   public static void longitud(int numero, String string){
               try{
       if (string.length() == numero ) {            
       } else {
           JOptionPane.showMessageDialog(null, "Error. Introduzca " + numero + " caracteres.");
           System.exit(0);
       }
       }catch (NullPointerException ex){
           System.exit(0);
       }
   }
}
