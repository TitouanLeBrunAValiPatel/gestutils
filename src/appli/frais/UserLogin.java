/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appli.frais;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tlebrunava
 */
public class UserLogin {
    
    private String name;
    private String password;
    /**
     * 
     * @param name name of the user
     * @param password password of the user
     */
    public UserLogin(String name, String password) {
        this.name = name;
        this.password = password;
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        if(password.equals(""))
        {
           this.password = password;
        }
    }
    

    
    
    
}
