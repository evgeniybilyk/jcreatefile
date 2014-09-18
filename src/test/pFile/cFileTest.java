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

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: getFname()
    *
    */
    @Test
    public void testGetFname() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: setFname(String fname)
    *
    */
    @Test
    public void testSetFname() throws Exception {
    //TODO: Test goes here...
    }

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
