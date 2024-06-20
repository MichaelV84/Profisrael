package com.example.profisrael;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterForRecView extends RecyclerView.Adapter<AdapterForRecView.MyViewHolder> {

    Context context;
    ArrayList<User> list;

    public AdapterForRecView(Context context, ArrayList<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_for_rec_view,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        User user = list.get(position);
        holder.city.setText(user.getCity());
        holder.category.setText(user.getCategory());
        Glide.with(context)
                .load(user.getImageUrl())
                .placeholder(R.drawable.profile)
                .error(R.drawable.error)
                .into(holder.imageUrl);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView city,category;
        ImageView imageUrl;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            city = itemView.findViewById(R.id.city_for_cardView);
            category = itemView.findViewById(R.id.category_for_cardView);
            imageUrl = itemView.findViewById(R.id.pic_for_cardView);
        }
    }

}
