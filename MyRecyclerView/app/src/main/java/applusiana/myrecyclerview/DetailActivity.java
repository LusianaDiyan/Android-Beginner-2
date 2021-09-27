package applusiana.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_ISLAND = "extra_island";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvNama, tvDesk;
        ImageView ivGambar;

        tvNama = findViewById(R.id.tvNamaPulau);
        tvDesk = findViewById(R.id.tvNamaLain);
        ivGambar = findViewById(R.id.ivPulau);

        Islands islands = getIntent().getParcelableExtra(EXTRA_ISLAND);
        setTitle(islands.getName());

        tvNama.setText(islands.getName());
        tvDesk.setText(islands.getOther());

        Glide.with(this)
                .load(islands.getPhoto())
                .apply(new RequestOptions().override(300, 300))
                .into(ivGambar);



    }
}
