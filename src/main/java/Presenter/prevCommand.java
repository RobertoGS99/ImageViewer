/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import ImageViewer.MainFrame;
import View.UI.swing.SwingImageDisplay;
import View.persistence.ImageLoader;
import View.persistence.files.FileImageLoader;

/**
 *
 * @author Admin
 */
public class prevCommand implements Command{
    
    private MainFrame mf;
    private SwingImageDisplay sid;
    private FileImageLoader fil;
    
    public prevCommand(MainFrame mainFrame, ImageLoader imageLoader) {
        mf = mainFrame;
        sid = mainFrame.getImageDisplay();
        fil = (FileImageLoader) imageLoader;    
    }

    @Override
    public String name() {
        return "prev";
    }

    @Override
    public void execute() {
        sid.display(sid.getImage().prev());
    }
    
}
