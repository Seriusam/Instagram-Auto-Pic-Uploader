/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.brunocvcunha.instagram4j.Instagram4j;
public class NewClass {
    public static void main(String[] args){
        System.out.println("STARTED");
        Instagram4j instagram = Instagram4j.builder().username("").password("").build();
        instagram.setup();
        try {
            instagram.login();
        } catch (IOException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
 