/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damc.grupo3.reto1.model;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *This class is asigned to the user
 * @author Diego
 */
public class User {
    /*
    atributes
    */
    private Integer id;
    private String login;
    private String email;
    private String fullname;
    private UserStatus status;
    private UserPrivilege privilegde;
    private String password;
    private Date lastPasswordChange;
    private static final Logger LOG = Logger.getLogger(User.class.getName());
    
    /*
    constructors
    */
    public User(){
    }

    public User(Integer id, String login, String email, String fullname, UserStatus status, UserPrivilege privilegde, String password, Date lastPasswordChange) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.fullname = fullname;
        this.status = status;
        this.privilegde = privilegde;
        this.password = password;
        this.lastPasswordChange = lastPasswordChange;
    }

    /*
    setters and getters
    */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public UserPrivilege getPrivilegde() {
        return privilegde;
    }

    public void setPrivilegde(UserPrivilege privilegde) {
        this.privilegde = privilegde;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastPasswordChange() {
        return lastPasswordChange;
    }

    public void setLastPasswordChange(Date lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }

    /*
    one method to show the parameters in a readable format
    */
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", login=" + login + ", email=" + email + ", fullname=" + fullname + ", status=" + status + ", privilegde=" + privilegde + ", password=" + password + ", lastPasswordChange=" + lastPasswordChange + '}';
    }   
}
