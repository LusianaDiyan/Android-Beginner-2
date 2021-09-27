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

public class Atm extends ListActivity {
    private ListView atm;
    private String[] menuLokasi = new String[]{
            "ATM Mandiri",
            "ATM BNI",
            "ATM BRI",
            "ATM BCA",
            "ATM BTN",
    };

    @Override
    protected void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.atm);

        atm = (ListView)findViewById(R.id.lvAtm);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (Atm.this, android.R.layout.simple_list_item_1,
                        android.R.id.text1, menuLokasi);

        atm.setAdapter(adapter);

        atm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Atm.super.onListItemClick(parent, view, position, id);
                Object o = this.getListAdapter().getItem(position);
                String pilihan = o.toString();
            }
        });

        protected void onListItemClick(ListView l, View view, int position, long id){
            super.onListItemClick(l, view, position, id);

            tampilkanPilihan(pilihan);
        }

        private void tampilkanPilihan(String pilihan){
            try {
                Intent i = null;
                if (pilihan.equals("ATM Mandiri"))
                {
                    i = new Intent(this,atmMandiri.class);
                }
                if (pilihan.equals("ATM BNI"))
                {
                    i = new Intent(this,atmBni.class);
                }
                if (pilihan.equals("ATM BRI"))
                {
                    i = new Intent(this,atmBri.class);
                }
                if (pilihan.equals("ATM BCA"))
                {
                    i = new Intent(this,atmBca.class);
                }
                if (pilihan.equals("ATM BTN"))
                {
                    i = new Intent(this,atmBtn.class);
                }

                startActivity(i);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
