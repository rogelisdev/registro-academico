/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Notas;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Rogelis Garcia
 */
public class CalculoService {
    public double Promedio(List<Notas> notas) {
        return notas.stream() //estilo for y aplicacion de funciones
                .mapToDouble(Notas :: getValor) //Mapeo de double en la clase para obtener
                .average() // promedio 
                .orElse(0.0); //no entregue 0

    }
    
    public Notas notaMaxima(List<Notas> notas){
        return notas.stream()
                .max(Comparator.comparingDouble(Notas :: getValor))
                .orElse(null);
                
    }
    
    public boolean Aprobado(double promedio){
        return promedio >= 3.0;
    }
}
