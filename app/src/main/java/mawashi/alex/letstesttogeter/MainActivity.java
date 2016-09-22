package mawashi.alex.letstesttogeter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Presenter mPresenter;
    EditText mEdit;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inizializzo i componenti grafici
        mEdit = (EditText)findViewById(R.id.edit);
        mText = (TextView)findViewById(R.id.text);

        //inizializzo il Presenter
        mPresenter = new Presenter();

    }




    //pulsante SAVE
    public void Save(View v){
     //   String m = mEdit.getText().toString();
        mPresenter.saveString(mEdit.getText().toString());
    }

    //pulsante GET
    public void Get(View v){
        mText.setText(mPresenter.getString());
    }

}
