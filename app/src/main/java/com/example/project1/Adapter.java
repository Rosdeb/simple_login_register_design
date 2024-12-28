package com.example.project1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Myviewholder> {
    Context context;
    ArrayList<News> newsArrayList;

    public Adapter(Context context, ArrayList<News> newsArrayList) {
        this.context = context;
        this.newsArrayList = newsArrayList;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recycleviewid,parent,false);

        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {

        News news = newsArrayList.get(position);
        holder.titileimage.setImageResource(news.titleimage);
        holder.textView.setText(news.heading);
    }

    @Override
    public int getItemCount() {
        return newsArrayList.size();
    }

    public static class Myviewholder extends RecyclerView.ViewHolder{

        ImageView titileimage;
        TextView textView;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            titileimage = itemView.findViewById(R.id.image);
            titileimage = itemView.findViewById(R.id.textview);
        }
    }
}
