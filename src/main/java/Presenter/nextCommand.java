/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import ImageViewer.MainFrame;
import Model.Image;
import View.UI.swing.SwingImageDisplay;
import View.persistence.ImageLoader;
import View.persistence.files.FileImageLoader;

/**
 *
 * @author Admin
 */
public class nextCommand implements Command {
    
    private MainFrame mf;
    private SwingImageDisplay sid;
    private FileImageLoader fil;

    public nextCommand(MainFrame mainFrame,ImageLoader fileImageLoader) {
        mf = mainFrame;
        sid = mainFrame.getImageDisplay();
        fil = (FileImageLoader) fileImageLoader;
    }

    @Override
    public String name() {
        return "next";    
    }

    @Override
    public void execute() {
        sid.display(sid.getImage().next());
    }
    
}
