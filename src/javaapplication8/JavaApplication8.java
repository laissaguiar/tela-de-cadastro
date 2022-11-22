/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author Laís Aguiar
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String className = "";
        System.out.println("alooo");

        try {
            Class.forName(className);
            System.out.println("Funfou!");
        } catch (ClassNotFoundException ex) {
            System.out.println("alo");
        }
    }

}
