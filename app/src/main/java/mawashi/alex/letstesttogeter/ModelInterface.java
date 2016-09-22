package mawashi.alex.letstesttogeter;

/**
 * Created by alessandro.argentier on 22/09/2016.
 */
public interface ModelInterface {

    //operazioni (contratto) che il Model deve svolgere per gli strati pi esterni
    public String getData(String filePath);
    public void saveData(String data);

}
