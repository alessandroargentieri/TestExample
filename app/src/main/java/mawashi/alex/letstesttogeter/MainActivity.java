package mawashi.alex.letstesttogeter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    PresenterInterface mPresenter;
    EditText mEdit;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inizializzo i componenti grafici
        mEdit = (EditText)findViewById(R.id.edit);
        mText = (TextView)findViewById(R.id.text);

        //inizializzo il Presenter a partire dalla sua interfaccia
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

    //pulsante 2+5 TEST
    public void LittleTest(View v){
        // i numeri sono presi da variabili statiche globali a tutta l'applicazione
        // non viene passata la TextView al presenter affichè sia riempita, ma è il Presenter a restituire il risultato alla TextView
        ApplicationClass ac = new ApplicationClass();
        mText.setText(mPresenter.sum(ac.getNumber(1),ac.getNumber(2)));
    }

}
