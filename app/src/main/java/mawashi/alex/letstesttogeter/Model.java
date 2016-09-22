package mawashi.alex.letstesttogeter;

import android.os.Environment;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by alessandro.argentier on 22/09/2016.
 */
public class Model implements ModelInterface{

    //costruttore
    public Model(){

    }

    public String getData(String filePath){
        String result = "";
        File file = new File(filePath);
        if (file.exists() ) {
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
                char current;
                while (fis.available() > 0) {
                    current = (char) fis.read();
                    result = result + String.valueOf(current);
                }
            }catch (Exception e) {
                Log.d("ERRORE", e.toString());
            }finally {
                if (fis != null)
                    try {
                        fis.close();
                    } catch (IOException ignored) {}
            }
        }
        return result;
    }



    public void saveData(String data){
        File root_text = Environment.getExternalStorageDirectory();
        try{ File folder = new File(Environment.getExternalStorageDirectory() + "/TESTEXAMPLE");
            boolean success = true;
            if (!folder.exists()) {
                success = folder.mkdir();
            }
            BufferedWriter fwv = new BufferedWriter(new FileWriter(new File("/sdcard/TESTEXAMPLE/SavedData.txt"), false));
            if (root_text.canWrite()) {
                fwv.write(data);
                fwv.close();
            }
        }catch (Exception e){
            Log.e("MODEL", "ERRORE: " + e.toString());
        }
    }




}
