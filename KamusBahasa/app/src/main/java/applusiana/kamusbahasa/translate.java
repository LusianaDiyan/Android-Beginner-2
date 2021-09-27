package applusiana.kamusbahasa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class translate extends AppCompatActivity {

    private DatabaseKamus db;
    RadioGroup rg;
    EditText etInd, etEng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);

        db = new DatabaseKamus(this,"",null,1);

        etInd = findViewById(R.id.etIndonesia);
        etEng = findViewById(R.id.etInggris);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ind = etInd.getText().toString();
                String eng = etEng.getText().toString();

                int idRb = rg.getCheckedRadioButtonId();
                if (R.id.btnIndEng == idRb){
                    if (!ind.equals("")){
                        String translateEng = db.getTranslateEng(ind);
                        etEng.setText(translateEng);
                    }
                }else {
                    if (!eng.equals("")){
                        String translateInd = db.getTranslateInd(eng);
                        etInd.setText(translateInd);
                    }
                }
            }
        });
    }

    public void setIndonesia(String string) {
    }

    public void setInggris(String string) {
    }

    public void setId(int anInt) {
    }
}
