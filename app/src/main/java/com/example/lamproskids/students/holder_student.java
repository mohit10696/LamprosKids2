package com.example.lamproskids.students;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lamproskids.R;

public class holder_student extends RecyclerView.ViewHolder {
    private TextView title;
    public ImageButton expand;
    View submenu;

    public holder_student(@NonNull View itemView) {
        super(itemView);
        expand= itemView.findViewById(R.id.expandbutton);
        submenu = itemView.findViewById(R.id.submenu);
    }

    public void bind(modelstudent modelstudent) {
        boolean expanded = modelstudent.isExpended();
        if(modelstudent.isExpended())expand.setImageResource(R.drawable.ic_up);
        else expand.setImageResource(R.drawable.ic_down);
        submenu.setVisibility(expanded ? View.VISIBLE : View.GONE);
        //title.setText(modelstudent.getText());

    }
}
