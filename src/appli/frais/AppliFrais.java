/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appli.frais;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/
import javax.swing.JFrame;

/**
 *
 * @author erolland
 */
public class AppliFrais extends javax.swing.JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("appli.frais.AppliFrais.main()");
        WindowConnection frame = new WindowConnection();    
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
//        MainWindowAppli1 fenetre = new MainWindowAppli1();
//        fenetre.setVisible(true);
//        fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
