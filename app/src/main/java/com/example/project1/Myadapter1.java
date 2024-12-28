package com.example.project1;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myadapter1 extends RecyclerView.Adapter<Myadapter1.myadapter> {


    int[]images;
    String[]doller;
    String[]persen;
    String[]slecteditemname;

    public Myadapter1(int[] images, String[] doller, String[] persen, String[] slecteditemname) {
        this.images = images;
        this.doller = doller;
        this.persen = persen;
        this.slecteditemname = slecteditemname;
    }

    @NonNull
    @Override
    public myadapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull myadapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class myadapter extends  RecyclerView.ViewHolder{


        public myadapter(@NonNull View itemView) {
            super(itemView);


        }
    }
}
