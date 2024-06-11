/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

public class Principal {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(123, 3.5f, "Andres", "Ruiz", 23);
        Estudiante estudiante2 = new Estudiante(124, 4.0f, "Maria", "Gonzalez", 22);
        
        estudiante.mostrarDatos();
        System.out.println(""); 
        estudiante2.mostrarDatos();
    }
}
