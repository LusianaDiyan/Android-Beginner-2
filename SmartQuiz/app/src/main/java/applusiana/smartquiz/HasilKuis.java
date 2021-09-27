package applusiana.smartquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by USER on 08/02/2018.
 */

public class HasilKuis extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_kuis);

        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban benar : "+Soal.benar+"\nJawaban Salah :"+Soal.salah);
        nilai.setText(""+Soal.hasil);
    }

    public void ulang(View view){
        finish();
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
