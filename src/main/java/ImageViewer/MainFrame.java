/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageViewer;

import Presenter.Command;
import View.UI.swing.SwingImageDisplay;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class MainFrame extends JFrame{

    private SwingImageDisplay imageDisplay;
    Map<String,Command> map = new HashMap<String,Command>();
    
    public MainFrame() {
        this.setTitle("Image Viewer");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(image());
        //this.add(toolbar(),BorderLayout.SOUTH);
        this.setVisible(true);
    }
    
    public void add(Command command){
        map.put(command.name(), command);
    }
    
    private Component image() {
        SwingImageDisplay swingImageDisplay = new SwingImageDisplay();
        this.imageDisplay = swingImageDisplay;
        return imageDisplay;
    }

    public SwingImageDisplay getImageDisplay() {
        return imageDisplay;
    }

    private Component toolbar() {
        JPanel panel = new JPanel();
        panel.add(button("next"));
        panel.add(button("prev"));
        
        
        return panel;
    }

    private Component button(String name) {
        JButton button = new JButton(name);
        return button;
    }
    
    
}
