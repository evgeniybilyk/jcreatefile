package pFile;

import java.io.File;
import java.io.IOException;

public class cFile {
    String fname;
    String dirname;

    public cFile() {
        fname = "newfile.txt";
        dirname = "/home/sites/localhost/www/qwerty";
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

    public void getListFiles() throws IOException {
        File myFolder = new File(dirname);
        File[] files = myFolder.listFiles();
        for(File tmp_fname: files) {
            System.out.println(tmp_fname.getName());
            System.out.println(tmp_fname.getAbsoluteFile());
            System.out.println(tmp_fname.isDirectory());
            System.out.println(tmp_fname.isFile());
            System.out.println(tmp_fname.getCanonicalFile());
            System.out.println(tmp_fname.getCanonicalPath());
        }
        //System.out.println(files);
    }
}
