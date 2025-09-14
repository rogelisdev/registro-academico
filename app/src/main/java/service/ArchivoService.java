/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Estudiantes;
import domain.Notas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rogelis Garcia
 */
public class ArchivoService {
     public void GuardarCsv(List<Estudiantes> estudiantes, File archivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {
            pw.println("nombre,edad,nota1,nota2,nota3");

            //Recorrer nombre y edad 
            for (Estudiantes i : estudiantes) {
                String linea = i.getNombre() + "," + i.getEdad();

                //Recorrer notas 
                for (int n = 0; n < 3; n++) {
                    if (n < i.getNotas().size()) {
                        linea += "," + i.getNotas().get(n).getValor();
                    } else {
                        linea += ",";
                    }
                }
                pw.println(linea);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al guardar archivo: " + e.getMessage());
        }
    }

    public List<Estudiantes> CargarCsv(File archivo) {
        List<Estudiantes> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean primera = true;

            while ((linea = br.readLine()) != null) {
                if (primera) {
                    primera = false;
                    continue;
                }

                String[] partes = linea.split(",");

                //validar que cumpla los datos
                if (partes.length >= 5) {
                    String nombre = partes[0];
                    int edad = Integer.parseInt(partes[1]);

                    Estudiantes estudiantes = new Estudiantes(nombre, edad);

                    //cargar 3 notas
                    for (int i = 2; i < 5; i++) {
                        if (!partes[i].isBlank()) {
                            double valor = Double.parseDouble(partes[i]);
                            estudiantes.agregarNota(new Notas(valor));
                        }
                    }
                    lista.add(estudiantes);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al cargar archivo: " + e.getMessage());
        }
        return lista;

    }
}
