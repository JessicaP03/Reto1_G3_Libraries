/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damc.grupo3.reto1.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *This exception shows a message wich says an error ocurred while we are connected in the server
 * @author Alejandro
 */
public class ServerErrorException extends Exception{
    public ServerErrorException(String msg) {
        super(msg);
    }
}
