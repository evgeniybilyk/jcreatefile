package test.pFile;

import pFile.cFile;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

/** 
* cFile Tester. 
* 
* @author <Evgeniy Bilyk>
* @since <pre>сен 18, 2014</pre> 
* @version 1.0 
*/ 
public class cFileTest {

    /**
    *
    * Method: createFile()
    *
    */
    @Test
    public void testCreateFile() throws Exception {
        cFile cf = new cFile();
        assertTrue("File didn't create",cf.createFile());
    }

} 
