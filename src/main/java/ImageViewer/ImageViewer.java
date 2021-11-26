/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageViewer;

import Presenter.Command;
import Presenter.nextCommand;
import Presenter.prevCommand;
import View.persistence.ImageLoader;
import View.persistence.files.FileImageLoader;

/**
 *
 * @author Admin
 */
public class ImageViewer {
    public static void main(String[] args) {
        
        String path="C:\\Users\\Roberto GS\\Desktop\\IS2\\ImageViewer";
        ImageLoader imageLoader = new FileImageLoader(path);
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().display(imageLoader.load());
        Command next = new nextCommand();
        Command prev = new prevCommand();
        mainFrame.add(next);
        mainFrame.add(prev);
        
        
        
        
    }
}
