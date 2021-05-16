package com.example.re_cyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    public ProgrammingAdapter(String[] data) {
        this.data = data;
    }

    public String[] data;
    @Override
    public ProgrammingViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());                             //1
        View view=  inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ProgrammingAdapter.ProgrammingViewHolder holder, int position) {
String title= data[position];
holder.tv.setText(title);
    }

    @Override                                                                                                    //3
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
ImageView iv;
TextView tv;
        public ProgrammingViewHolder(View itemView) {
            super(itemView);                                                                                 //2
            iv=itemView.findViewById(R.id.ib);
            tv=itemView.findViewById(R.id.tv);

        }
    }
    }

