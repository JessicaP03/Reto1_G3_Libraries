/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damc.grupo3.reto1.model;

import damc.grupo3.reto1.exception.PasswordErrorException;
import damc.grupo3.reto1.exception.ServerErrorException;
import damc.grupo3.reto1.exception.UserAlreadyExitsException;
import damc.grupo3.reto1.exception.UserNotFoundException;

/**
 * This interface is used to instance the parameters wich are get on our SignIn and SignUp windows
 * @author Diego
 */
public interface Sign {
    public User getExecuteSignUp(User user) throws ServerErrorException, UserAlreadyExitsException;
    public User getExecuteSignIn(User user) throws PasswordErrorException, UserNotFoundException, ServerErrorException;
}
