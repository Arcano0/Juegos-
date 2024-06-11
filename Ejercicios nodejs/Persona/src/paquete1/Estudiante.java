package paquete1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Angel
 */
public class Estudiante extends Persona {
    public int codigoestudiante;
    public float notaFinal;

    public Estudiante(int codigoestudiante, float notaFinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad); // 'super' indica que ya están inicializadas dentro de Persona.
        this.codigoestudiante = codigoestudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos() {
    System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() +
    "\nCodigo del estudiante: " + codigoestudiante + "\nNota final: " + notaFinal);
}

}
