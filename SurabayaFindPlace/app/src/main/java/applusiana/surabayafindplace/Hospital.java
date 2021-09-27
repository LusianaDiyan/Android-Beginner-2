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
 * Created by USER on 10/02/2018.
 */

public class Hospital extends ListActivity{

    private ListView hospital;
    private String[] menuLokasi = new String[]{
            "RSUD Muh. Soewandi",
            "RS Haji",
            "RSAL Dr. Ramelan",
            "RS Bhayangkara",
            "RS Islam Surabaya",
            "RSUD Dr. Soetomo",
    };

    @Override
    protected void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.hospital);

        hospital = (ListView)findViewById(R.id.lvHospital);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (Hospital.this, android.R.layout.simple_list_item_1,
                        android.R.id.text1, menuLokasi);

        hospital.setAdapter(adapter);

        hospital.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Hospital.this, "Memilih : "+ menuLokasi[position],
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
            if (pilihan.equals("RSUD Muh. Soewandi"))
            {
                i = new Intent(this,RSUDMuhSoewandi.class);
            }
            if (pilihan.equals("RS Haji"))
            {
                i = new Intent(this,RSHaji.class);
            }
            if (pilihan.equals("RSAL Dr. Ramelan"))
            {
                i = new Intent(this,RSALDrRamelan.class);
            }
            if (pilihan.equals("RS Bhayangkara"))
            {
                i = new Intent(this,RSBhayangkara.class);
            }
            if (pilihan.equals("RS Islam Surabaya"))
            {
                i = new Intent(this,rsi_surabaya.class);
            }
            if (pilihan.equals("RSUD Dr. Soetomo"))
            {
                i = new Intent(this,RSUDDrSoetomo.class);
            }

            startActivity(i);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
