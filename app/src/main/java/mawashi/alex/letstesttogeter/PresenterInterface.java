package mawashi.alex.letstesttogeter;

/**
 * Created by alessandro.argentier on 22/09/2016.
 */
public interface PresenterInterface {

    //operazioni (contratto) che il Presenter deve svolgere per la View
    public String getString();
    public void saveString(String stringa);
    public String sum(int a, int b);



}
