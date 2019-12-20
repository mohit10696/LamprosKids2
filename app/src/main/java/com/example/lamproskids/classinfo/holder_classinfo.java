package com.example.lamproskids.classinfo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lamproskids.R;

public class holder_classinfo extends RecyclerView.ViewHolder {
    TextView text1,text2;
    public holder_classinfo(@NonNull View itemView) {
        super(itemView);

        this.text1 = itemView.findViewById(R.id.name);
        this.text2 = itemView.findViewById(R.id.number);
    }
}
