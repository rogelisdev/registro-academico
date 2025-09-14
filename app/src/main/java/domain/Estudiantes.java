/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rogelis Garcia
 */
public class Estudiantes {
     private String nombre;
    private int edad;
    private List<Notas> notas;

    public Estudiantes( String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Notas> getNotas() {
        return notas;
    }

    public void setNotas(List<Notas> notas) {
        this.notas = notas;
    }
    
    public void agregarNota(Notas nota){
        if(notas.size() >= 3){
        throw new IllegalArgumentException("Valido 3 notas");
        
        }
    
      notas.add(nota);
    }
    
    public List<Notas> obtenerNotas(){
        return notas;
    }
}
