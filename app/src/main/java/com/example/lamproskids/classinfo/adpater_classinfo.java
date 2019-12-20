package com.example.lamproskids.classinfo;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lamproskids.R;

import java.util.ArrayList;

public class adpater_classinfo extends RecyclerView.Adapter<holder_classinfo> {

    Context c;
    ArrayList<model_classinfo> model;


    public adpater_classinfo(Context c, ArrayList<model_classinfo> model) {
        this.c = c;
        this.model = model;
    }

    @NonNull
    @Override
    public holder_classinfo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_classinfo,null);
        return new holder_classinfo(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder_classinfo holder, int position) {
        holder.text1.setText(model.get(position).getName());
        holder.text2.setText(model.get(position).getTotalfees());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}
