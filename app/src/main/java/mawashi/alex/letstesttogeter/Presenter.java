package mawashi.alex.letstesttogeter;

import android.os.Environment;
import android.util.Log;

import java.io.File;

/**
 * Created by alessandro.argentier on 22/09/2016.
 */
public class Presenter {

    //costruttore
    public Presenter(){

    }

    public String getString(){
        String result = "";
        Model mModel = new Model();
        try{
            result = mModel.getData("/sdcard/TESTEXAMPLE/SavedData.txt");
        }catch(Exception e){
            Log.e("PRESENTER", e.toString());
        }
        return result;
    }




    public void saveString(String stringa){
        Model mModel = new Model();
        mModel.saveData(stringa);
    }

}
