/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad2;

/**
 * @author alexpardox
 * La clase debe tener un atributo tipo String y un atributo tipo array que almacene cinco valores numéricos.
 * El atributo tipo String almacenará el nombre del participante.
 * El atributo tipo array almacenará las calificaciones de cinco materias del participante.
 * Deberán escribirse tres métodos:
 *  1) Un método calculará el promedio de las cinco calificaciones. (Recibe el array con las calificaciones y regresa un valor numérico).
 *  2) Otro método obtendrá la calif final (Recibe como parámetro el promedio y regresa un caracter):
 *  3) El último método imprimirá en pantalla los resultados del programa con el siguiente formato: 
 *      (recibe como parámetros el nombre, promedio y calificación, no regresa valores): Nombre, Calif 1 al 5, promedio, letra. 
 */

public class calificaciones {
    //atributos
    String nombre; 
    double[] calif; 
    
    // Constructor
    public calificaciones(double[] calificaciones, String nombre) {
        this.calif = calificaciones;
        this.nombre = nombre;
    }
    
    //Método 1: Calcular promedio
    public double CalcularPromedio( double[] calif) {
        double promedio = 0; 
        for (double c: calif){
            promedio += c; 
        }
        promedio = promedio/calif.length;
        
        return promedio;
    }
    
    //Método 2: Obtener calificacion final
    public char ObtenerCalificacion (double promedio){
        char calificacionFinal = 'F';
        if (promedio >=91) calificacionFinal='A';
        else if (promedio >=81) calificacionFinal='B';
        else if (promedio >=71) calificacionFinal='C';
        else if (promedio >=61) calificacionFinal='D';
        else if (promedio >=51) calificacionFinal='E';
        else calificacionFinal ='F';
        
        return calificacionFinal;
    }
    
    //Método 3: Imprimir los resultados en pantalla
    public void ImprimirResultados (String nombre, double promedio, char calificacionFinal) {
        System.out.println("Nombre del estudiante: "+nombre);
        for (int i = 0; i < calif.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calif[i]);
        }
        System.out.println("Promedio: "+promedio);
        System.out.println("Calificacion: "+calificacionFinal);
    }
    
    //Método Main para inicializar el programa
    public static void main(String[] args) {
        double[] calif = {70, 90, 80, 70, 100};
        String alumno = "Alex Pardo";
        
        calificaciones C = new calificaciones (calif,alumno);
        double promedio = C.CalcularPromedio(calif);
        char calificacionFinal = C.ObtenerCalificacion(promedio);
        
        //Validamos que sean 5 calificaciones
        if (calif.length != 5) { 
            System.out.println("Debes escribir 5 calificaciones");
        }
        else {
        C.ImprimirResultados(alumno, promedio, calificacionFinal);
        }
    }
}


