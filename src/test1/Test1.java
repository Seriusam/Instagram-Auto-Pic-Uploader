/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author fatih
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        JFrame app_Window = new Applica();
        
        app_Window.setSize(new Dimension(640,474));
        
        
        app_Window.show();
        
    }
    
}
