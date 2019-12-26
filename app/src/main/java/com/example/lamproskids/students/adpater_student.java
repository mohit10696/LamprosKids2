package com.example.lamproskids.students;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lamproskids.R;

import java.util.List;

public class adpater_student extends RecyclerView.Adapter<holder_student> {

    private List<modelstudent> list;
    public adpater_student(List<modelstudent> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public holder_student onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.row_student, parent, false);
        return new holder_student(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final holder_student holder, final int position) {
        final modelstudent modelstudent = list.get(position);
        holder.bind(modelstudent);
        holder.expand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("$$$$$$$$$", "onClick:clickable function ");

                boolean expanded = modelstudent.isExpended();
                modelstudent.setExpended(!expanded);
                notifyItemChanged(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }
}
