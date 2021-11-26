/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.UI.swing;

import Model.Image;
import View.UI.ImageDisplay;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class SwingImageDisplay extends JPanel implements ImageDisplay {

    
    private Image image;

    public SwingImageDisplay() {
        super(new BorderLayout());
    }

    @Override
    public void display(Image image) {
        //implementar
        this.image = image;
        this.removeAll();
        this.add(imagePanel());
        this.updateUI();
    }

    private Component imagePanel() {
        return new JPanel(){
            @Override
            public void paint(Graphics g){
                try {
                    g.drawImage(bitmap(), 0, 0, this.getWidth(), this.getHeight(),null);
                } catch (IOException ex) {
                    Logger.getLogger(SwingImageDisplay.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            private java.awt.Image bitmap() throws IOException {
                return ImageIO.read(new ByteArrayInputStream(image.bitmap()));
            } 
        };
    }

    public Image getImage() {
        return image;
    }
    
}
