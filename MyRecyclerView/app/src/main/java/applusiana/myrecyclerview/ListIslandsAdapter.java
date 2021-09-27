package applusiana.myrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListIslandsAdapter extends RecyclerView.Adapter<ListIslandsAdapter.ListIslandViewHolder> {

    private Context context;
    private ArrayList<Islands> islands;

    public ListIslandsAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Islands> getIslands() {
        return islands;
    }

    public void setIslands(ArrayList<Islands> islands) {
        this.islands = islands;
    }

    @NonNull
    @Override
    public ListIslandViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_islands, viewGroup, false);

        return new ListIslandViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListIslandViewHolder listIslandViewHolder, final int i) {
        listIslandViewHolder.nmPulau.setText(getIslands().get(i).getName());
        listIslandViewHolder.deskripsi.setText(getIslands().get(i).getOther());

        Glide.with(context)
                .load(getIslands().get(i).getPhoto())
                .apply(new RequestOptions().override(50, 50))
                .into(listIslandViewHolder.gambar);

        listIslandViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, getIslands().get(i).getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_ISLAND, islands.get(i));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return getIslands().size();
    }

    public class ListIslandViewHolder extends RecyclerView.ViewHolder {

        TextView nmPulau, deskripsi;
        ImageView gambar;

        public ListIslandViewHolder(@NonNull View itemView) {
            super(itemView);

            nmPulau = itemView.findViewById(R.id.tvNamaPulau);
            deskripsi = itemView.findViewById(R.id.tvNamaLain);
            gambar = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
