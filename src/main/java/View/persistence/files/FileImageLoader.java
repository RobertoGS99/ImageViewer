package View.persistence.files;

import Model.Image;
import View.persistence.ImageLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;


public class FileImageLoader implements ImageLoader {
    private final  File[] files;
    private final String[] ImageExtensions = {"jpg","png","bmp"};

    public FileImageLoader(String folder) {
        this.files = new File(folder).listFiles(whitImageExtensions());
    }
    
    @Override
    public Image load(){
        return imageAt(0);
    }
    
    public Image imageAt(int index) {
        return new Image(){
            @Override
            public byte[] bitmap() {
                FileInputStream is = null;
                try {
                    is = new FileInputStream(files[index]);
                    return read(is);
                } catch (FileNotFoundException ex) {
                    System.out.println(""+ex.getMessage());
                    return null;
                }
                
            }

            private byte[] read(FileInputStream is) {
                byte[] buffer = new byte[4096];
                
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                while(true){
                    try {
                        int length = is.read(buffer);
                        if(length<0) break;
                        os.write(buffer,0,length);
                    } catch (IOException ex) {
                        System.out.println(""+ex.getMessage());
                    }
                }
                return os.toByteArray();
            }

            @Override
            public Image next() {
                if (index == files.length){
                    return imageAt(0);
                }else{
                    return imageAt(index+1);
                }
            }

            @Override
            public Image prev() {
                if (index == 0){
                    return imageAt(files.length);
                }else{
                    return imageAt(index-1);
                }            
            }
            
        };
    }

    private FilenameFilter whitImageExtensions() {
        return new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                for (String n : ImageExtensions) {
                    if (name.endsWith(n)){
                        return true;
                    } else {
                    }
                }
                return false;
            } 
        };
    }
    
}
