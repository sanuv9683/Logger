/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author sanu
 */
public class Main {
    public static void main(String[] args) {
        try {
            //accsessing the root logger
            Logger logger = Logger.getLogger("");
            FileHandler handler= new FileHandler("error.log", true); // set the logger file name
            handler.setFormatter(new SimpleFormatter());//format the text
            handler.setLevel(Level.INFO); // logger level
            logger.addHandler(handler);
            
            
           Class.forName("com.mysql.jdbc.Driver");
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);// this loger out put will append the above error.log file
        } catch (SecurityException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
