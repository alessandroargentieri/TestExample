package mawashi.alex.letstesttogeter;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by alessandro.argentier on 23/09/2016.
 * It's a View Layer Activity with no layout in xml
 */
public class MainActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String parametro = "";
        try{
            Bundle b = getIntent().getExtras();
            parametro = b.getString("parametro");
        }catch(Exception e){
            Log.d("BUNDLE","Nessun parametro");
        }

        Toast.makeText(this, parametro, Toast.LENGTH_LONG).show();

        TextView textView = new TextView(this);
        textView.setText("Activity with no XML layout!");
        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textView.setTextColor(Color.BLUE);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);

        TextView textView2 = new TextView(this);
       // textView2.setId(87876);
        textView2.setText(parametro);
        textView2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textView2.setTextColor(Color.DKGRAY);
        textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP,15);
        textView2.setTag("Tag");


        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.LTGRAY);
        layout.addView(textView);
        layout.addView(textView2);

        setContentView(layout);

    }
}