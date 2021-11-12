/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageViewer;

import View.persistence.ImageLoader;
import View.persistence.files.FileImageLoader;

/**
 *
 * @author Admin
 */
public class ImageViewer {
    public static void main(String[] args) {
        
        String path="C:\\Users\\Roberto GS\\Desktop\\IS2\\ImageViewer\\570632_1920_1080.jpg";
        ImageLoader imageLoader = new FileImageLoader(path);
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().display(imageLoader.load());
        mainFrame.setVisible(true);
        
    }
}
