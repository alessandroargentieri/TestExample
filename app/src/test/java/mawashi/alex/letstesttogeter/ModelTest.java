package mawashi.alex.letstesttogeter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alessandro.argentier on 22/09/2016.
 */
public class ModelTest {

    //dichiaro il componente da testare
    Model mModel;

    @Before
    public void setUp() throws Exception {
        //inizializzo il componente da testare
        mModel = new Model();
    }

    @Test
    public void testGetData() throws Exception {
        assertEquals("", mModel.getData("/sdcard/TESTEXAMPLE/SavedData.txt"));
    }

    @Test
    public void testSaveData() throws Exception {
        //le void non possono essere testate perchè non restituiscono nulla
    }
}