package com.example.lamproskids.teacher;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lamproskids.R;

import java.util.List;

public class adpater_teacher extends RecyclerView.Adapter<holder_teacher> {

    private List<modelteacher> list;
    public adpater_teacher(List<modelteacher> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public holder_teacher onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.row_teachers, parent, false);
        return new holder_teacher(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final holder_teacher holder, final int position) {
        final modelteacher modelteacher = list.get(position);
        holder.bind(modelteacher);


    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }
}
