package applusiana.smartquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Soal extends AppCompatActivity {
    TextView Pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD, PilihanE;
    int nomor = 0;

    public static int hasil, benar, salah ;

    String[] pertanyaan_kuis = new String[]{
            "1. Orang Jawa menyebut \"Lor\" untuk arah ?",
            "2. Dari manakah asal \"Rumah Gadang\" ?",
            "3. Apa sebutan untuk rumah adat Jawa Tengah ?",
            "4. Lagu \"Pai Mura Rame\" berasal dari daerah mana ?",
            "5. Istilah Bhinneka Tunggal Ika terdapat di dalam Kitab... "
    };

    String[] pilihan_jawaban = new String[]{
            "Utara", "Selatan", "Timur", "Barat", "Tenggara",
            "Sumatera Selatan", "Jawa Barat", "Sumatera Barat", "Jambi", "Bali",
            "Rumah Panggung", "Joglo", "Tongkonan", "Limas", "Baileo",
            "NTT", "Papua", "NTB", "Aceh", "Bali",
            "Sansekerta", "Injil", "Suci", "Kertagama", "Sutasoma",
    };

    String [] jawaban_benar = new String[] {
            "Utara",
            "Sumatera Barat",
            "Joglo",
            "NTT",
            "Sutasoma"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        Pertanyaan  = (TextView) findViewById(R.id.pertanyaan);
        rg          = (RadioGroup) findViewById(R.id.radio_group);
        PilihanA    = (RadioButton) findViewById(R.id.pilihanA);
        PilihanB    = (RadioButton) findViewById(R.id.pilihanB);
        PilihanC    = (RadioButton) findViewById(R.id.pilihanC);
        PilihanD    = (RadioButton) findViewById(R.id.pilihanD);
        PilihanE    = (RadioButton) findViewById(R.id.pilihanE);

        Pertanyaan.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);
        PilihanE.setText(pilihan_jawaban[4]);

        rg.check(0);
        benar = 0;
        salah = 0;
    }

    public void next (View view){
        if (PilihanA.isChecked() || PilihanB.isChecked() || PilihanC.isChecked() ||
                PilihanD.isChecked() || PilihanD.isChecked()) {

            RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            nomor ++;
            rg.check(0);

            if (nomor < pertanyaan_kuis.length) {
                Pertanyaan.setText(pertanyaan_kuis[nomor]);
                PilihanA.setText(pilihan_jawaban[(nomor * 4) + 0]);
                PilihanB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilihanC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilihanD.setText(pilihan_jawaban[(nomor * 4) + 3]);
                PilihanE.setText(pilihan_jawaban[(nomor * 4) + 4]);

                if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
                else salah++;

            } else {
                hasil = benar * 20;
                Intent selesai = new Intent(getApplicationContext(), HasilKuis.class);
                startActivity(selesai);
            }
        }
        else{
            Toast.makeText(this, "Choose the answer first", Toast.LENGTH_SHORT).show();
        }
    }
}
