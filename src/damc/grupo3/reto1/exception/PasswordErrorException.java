/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damc.grupo3.reto1.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *This exception is used to cover an error in the password
 * prueba
 * @author Alejandro
 */
public class PasswordErrorException extends Exception{
    public PasswordErrorException(String msg) {
        super(msg);
        
    }
}
