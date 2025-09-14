/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Rogelis Garcia
 */
public class AuthService {
      //Variables fijas
    private final String ADMIN_USER = "admin";
    private final String ADMIN_PASS = "1234";
    
    //validacion de credenciales con funcion 
    public boolean autenticar(String user, String pass){
    return user.equals(ADMIN_USER) && pass.equals(ADMIN_PASS);
    }
}
