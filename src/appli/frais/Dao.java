/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appli.frais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author tlebrunava
 */
public class Dao {
    
    /**
     * 
     */
    private Connection con;
    private String url;
    private String user;
    private String passwd; 
    /**
     * 
     */
    public Dao(){

        url = "jdbc:mysql://localhost/applifrais";
        user = "root";
        passwd = "";
        try {
            
            con = DriverManager.getConnection(url,user,passwd);
            
        } catch (SQLException e) {
            e.getMessage();
        }
          
    }
    /**
    * @param sql prepare the query sql
    * @return PreparedStatement
    */
    public PreparedStatement queryInsert(String sql) throws SQLException{
        
        PreparedStatement preparedStatement = getCon().prepareStatement(sql);
        //ResultSet rs = preparedStatement.executeQuery(sql);
        return preparedStatement;
    }
    /**
     * 
     * @param sql execute the query sql
     * @return ResultSet
     * @throws SQLException 
     */
    public ResultSet query(String sql) throws SQLException{
        
        Statement stmt = getCon().createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        return rs;
    }

    /**
     * @return the connexion
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    
    
}
