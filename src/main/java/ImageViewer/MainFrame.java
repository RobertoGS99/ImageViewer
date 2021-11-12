/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageViewer;

import View.UI.swing.SwingImageDisplay;
import java.awt.Component;
import java.awt.PopupMenu;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class MainFrame extends JFrame{

    SwingImageDisplay imageDisplay;
    
    public MainFrame() {
        this.setTitle("Image Viewer");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(image());
    }

    private Component image() {
        SwingImageDisplay swingImageDisplay = new SwingImageDisplay();
        this.imageDisplay = swingImageDisplay;
        return imageDisplay;
    }

    public SwingImageDisplay getImageDisplay() {
        return imageDisplay;
    }
    
    
}
