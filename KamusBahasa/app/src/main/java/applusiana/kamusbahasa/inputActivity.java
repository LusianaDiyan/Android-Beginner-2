package applusiana.kamusbahasa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class inputActivity extends AppCompatActivity {

    private DatabaseKamus db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        db = new DatabaseKamus(this,"", null, 1);

        (findViewById(R.id.btnInput)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText indonesia = (EditText) findViewById(R.id.etIndo);
                EditText inggris = (EditText) findViewById(R.id.etEng);

                dbTranslate t = new dbTranslate();
                t.setIndonesia(indonesia.getText().toString());
                t.setInggris(inggris.getText().toString());

                if (t.getIndonesia().equals("") || t.getInggris().equals("")) {
                    return;
                }

                db.addTranslate(t);
            }
        });
    }
}
