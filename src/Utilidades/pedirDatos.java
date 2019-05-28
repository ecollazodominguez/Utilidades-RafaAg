package Utilidades;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raguiarperez
 */
public class pedirDatos{
        public static int enteiro(String msg){
            return Integer.parseInt(JOptionPane.showInputDialog(msg));
        }
        public static float decimal(String msg){
            return Integer.parseInt(JOptionPane.showInputDialog(msg));
        }
        public static String string(String msg){
            return JOptionPane.showInputDialog(msg);
        }
}
