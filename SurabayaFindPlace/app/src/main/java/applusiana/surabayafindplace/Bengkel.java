package applusiana.surabayafindplace;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by USER on 11/02/2018.
 */

public class Bengkel extends ListActivity {
    private ListView bengkel;
    private String[] menuLokasi = new String[]{
            "LBMM ITS",
            "Ahass Putra Merdeka",
            "Bengkel Aji Motor",
    };

    @Override
    protected void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.bengkel);

        bengkel = (ListView)findViewById(R.id.lvBengkel);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (Bengkel.this, android.R.layout.simple_list_item_1,
                        android.R.id.text1, menuLokasi);

        bengkel.setAdapter(adapter);

        bengkel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Bengkel.this, "Memilih : "+ menuLokasi[position],
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    protected void onListItemClick(ListView l, View view, int position, long id){
        super.onListItemClick(l, view, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanPilihan(pilihan);
    }

    private void tampilkanPilihan(String pilihan){
        try {
            Intent i = null;
            if (pilihan.equals("LBMM ITS"))
            {
                i = new Intent(this,lbbm_its.class);
            }
            if (pilihan.equals("Ahass Putra Merdeka"))
            {
                i = new Intent(this,ahass.class);
            }
            if (pilihan.equals("Bengkel Aji Motor"))
            {
                i = new Intent(this,bengkelAji.class);
            }

            startActivity(i);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
