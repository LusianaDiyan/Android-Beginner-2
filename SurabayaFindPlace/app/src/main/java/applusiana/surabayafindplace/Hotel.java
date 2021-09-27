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

public class Hotel extends ListActivity {
    private ListView hotel;
    private String[] menuLokasi = new String[]{
            "Gunawangsa Manyar",
            "Hotel 88",
            "Surabaya Suites",
            "G Suites",
            "Garden Palace",
    };

    @Override
    protected void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.hotel);

        hotel = (ListView)findViewById(R.id.lvHotel);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (Hotel.this, android.R.layout.simple_list_item_1,
                        android.R.id.text1, menuLokasi);

        hotel.setAdapter(adapter);

        hotel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Hotel.this, "Memilih : "+ menuLokasi[position],
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
            if (pilihan.equals("Gunawangsa Manyar"))
            {
                i = new Intent(this,gunawangsa.class);
            }
            if (pilihan.equals("Hotel 88"))
            {
                i = new Intent(this,hotel88.class);
            }
            if (pilihan.equals("Surabaya Suites"))
            {
                i = new Intent(this,sby_suite.class);
            }
            if (pilihan.equals("G Suites"))
            {
                i = new Intent(this,gSuite.class);
            }
            if (pilihan.equals("Garden Palace"))
            {
                i = new Intent(this,gardenPalace.class);
            }

            startActivity(i);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
