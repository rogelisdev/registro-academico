/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Estudiantes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Rogelis Garcia
 */
public class RegistroEstudianteService {
     private final List<Estudiantes> estudiantes = new ArrayList<>();
    private CalculoService calculos = new CalculoService();

    public void agregarEstudiantes(Estudiantes e) {
        estudiantes.add(e);
       // System.out.println("Estudiantes" + e.getNombre());
    }

    public List<Estudiantes> ListarEstudiantes() {
        for (int i = 0; i < estudiantes.size(); i++) {
            
            Estudiantes listar = estudiantes.get(i);
            System.out.println(listar.getNombre());
        }
        return estudiantes;
    }
    
    public double CalcularPromedioGeneral(){
        
        double suma = 0.0;
        double promedio = 0.0;
        
        for(Estudiantes general : estudiantes){  //foreach tipo de variable nombe / recorrer ...... 
            suma += calculos.Promedio(general.getNotas()); //funcion, iterador y obtener informacion de la lista
            
            promedio ++;
        }
        return  suma/promedio;
    }
    
    public Optional<Estudiantes> MejorEstudiante(){
        return estudiantes.stream()
                .max(Comparator.comparingDouble( e -> calculos.Promedio(e.getNotas()))); //comparator tiene que importarse y tiene que recorrerse con ALIAS y obtener valores
    }
    
    public long ContarAprobados(){
        return estudiantes.stream()
                .filter(e -> calculos.Promedio(e.getNotas()) >= 3.0)
                .count();
        
    }
    
    public long ContarReprobado(){
        return estudiantes.stream()
                .filter(e -> calculos.Promedio(e.getNotas()) < 3.0 )
                .count();
    }
    
}
