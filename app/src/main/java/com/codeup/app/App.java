/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.codeup.app;

import javax.swing.SwingUtilities;
import ui.LoginFrame;

/**
 *
 * @author Rogelis Garcia
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Bienvenido al Registro de estudiantes Codeup!");
        
         SwingUtilities.invokeLater(() -> {
            // Crear y mostrar el login
            LoginFrame login = new LoginFrame();
            login.setVisible(true);
        });
    }
}
