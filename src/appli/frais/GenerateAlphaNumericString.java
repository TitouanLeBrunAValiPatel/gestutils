/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appli.frais;

/**
 *
 * @author tlebrunava
 */
import java.nio.charset.*;
import java.util.*;

class GenerateAlphaNumericString {
    
    /**
     * 
     * @param i lenght of the password
     * @return a ramdom password in string
     */
    public String getRandomString(int i) 
    { 
    
        // bind the length 
        byte[]  bytearray = new byte[256];         
        String mystring;
        StringBuffer thebuffer;
        String theAlphaNumericS;

        new Random().nextBytes(bytearray); 

        mystring 
            = new String(bytearray, Charset.forName("UTF-8")); 
            
        thebuffer = new StringBuffer();
        
        //remove all spacial char 
        theAlphaNumericS 
            = mystring 
                .replaceAll("[^A-Z0-9]", ""); 

        //random selection
        for (int m = 0; m < theAlphaNumericS.length(); m++) { 

            if (Character.isLetter(theAlphaNumericS.charAt(m)) 
                    && (i > 0) 
                || Character.isDigit(theAlphaNumericS.charAt(m)) 
                    && (i > 0)) { 

                thebuffer.append(theAlphaNumericS.charAt(m)); 
                i--; 
            } 
        } 

        // the resulting string 
        return thebuffer.toString(); 
    }
    /**
     * check if the cp is a numeric value
     * @param cp numero of postalcode 
     * @return bool
     */
    public boolean verifCP(String cp)
    {
       boolean isNumeric =  cp.matches("[+-]?\\d*(\\.\\d+)?");
       return isNumeric;
    }
}
