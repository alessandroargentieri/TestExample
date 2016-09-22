package mawashi.alex.letstesttogeter;

import android.app.Application;

/**
 * Created by alessandro.argentier on 22/09/2016.
 */
public class ApplicationClass extends Application{

    private final int number1 = 2;
    private final int number2 = 5;

    public int getNumber(int num){
        int result = 0;
        if(num == 1)
            result = 2;
        if(num == 2)
            result = 5;
        return result;
    }



}
