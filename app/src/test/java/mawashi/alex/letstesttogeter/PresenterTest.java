package mawashi.alex.letstesttogeter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Created by alessandro.argentier on 22/09/2016.
 */

@RunWith(MockitoJUnitRunner.class)  //annotazione aggiunta se voglio usare mockito
public class PresenterTest {

    //dichiaro ciò che testo
    private Presenter mPresenter;

    //dichiaro ciò che simulo
    @Mock
    ApplicationClass ac;


    @Before
    public void setUp() throws Exception {
        //inizializzo ciò che testo
       mPresenter = new Presenter();
        //inizializzo anche ciò che simulo
       ac = Mockito.mock(ApplicationClass.class);
    }

    @Test
    public void testGetString() throws Exception {
        assertEquals("", mPresenter.getString());
    }


    @Test
    public void testSaveString() throws Exception {
        //non si possono testare i void perchè da essi non aspettiamo alcun risultato
    }

    @Test
    public void testSum() throws Exception {
        assertEquals("8", mPresenter.sum(4,4));
    }


    @Test
    public void testSumMock() throws Exception {

        //simulo il comportamento di ApplicationClass visto che è esterna a questa classe
        Mockito.when(ac.getNumber(1)).thenReturn(3);
        Mockito.when(ac.getNumber(2)).thenReturn(7);

        //testo la funzione sum() del Presenter, utilizzando il componente ac simulato
        assertEquals("10", mPresenter.sum(ac.getNumber(1),ac.getNumber(2)));
    }


}