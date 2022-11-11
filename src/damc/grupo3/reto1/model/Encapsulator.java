/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damc.grupo3.reto1.model;

import java.io.Serializable;

/**
 * This class will send both objects in one single way onto our server
 *
 * @author Diego
 */
public class Encapsulator implements Serializable {

    private MessageType msg;
    private User user;

    /**
     * Métodos get y set para atrapar el mensaje y el usuario para poder
     * encapsularlos y enviarlos entre sockets
     *
     * @return msg (getMessage)
     * @return user (getUser)
     *
     */

    public MessageType getMessage() {
        return msg;
    }

    public User getUser() {
        return user;
    }

    public void setMessage(MessageType msg) {
        this.msg = msg;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
