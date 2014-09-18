package pFile;

import java.io.File;
import java.io.IOException;

public class cFile {
    String fname;

    public cFile() {
        this.fname = "newfile.txt";
    }

    String getFname() {
        return fname;
    }

    void setFname(String fname) {
        this.fname = fname;
    }

    public boolean createFile() {
        boolean fileCreated = false;
        File f = new File(fname);

        try {
            fileCreated = f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return fileCreated;
    }
}
