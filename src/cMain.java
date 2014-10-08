import pFile.cFile;

import java.io.IOException;

public class cMain {
    public static void main(String[] args) throws IOException {
        cFile cf = new cFile();
        //cf.createFile();
        try {
            cf.getListFiles();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
