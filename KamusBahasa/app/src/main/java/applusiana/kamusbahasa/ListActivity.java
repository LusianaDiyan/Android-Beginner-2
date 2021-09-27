package applusiana.kamusbahasa;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;


public class ListActivity extends Activity {

    private DatabaseKamus db;
    private List<translate> translates;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        db = new DatabaseKamus(this, "", null, 1);

        translates = db.getAll();

        for (translate Translate: translates){
            Log.i("COBA LOG", translate.getInggris() + " - " +translate.getIndonesia());
        }
    }

}
