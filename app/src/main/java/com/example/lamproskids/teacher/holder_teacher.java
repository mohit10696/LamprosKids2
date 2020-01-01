package com.example.lamproskids.teacher;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class holder_teacher extends RecyclerView.ViewHolder {
    private TextView title;
    public ImageButton expand;
    View submenu;

    public holder_teacher(@NonNull View itemView) {
        super(itemView);
        //expand= itemView.findViewById(R.id.expandbutton);
       // submenu = itemView.findViewById(R.id.submenu);
    }

    public void bind(modelteacher modelteacher) {

        //title.setText(modelteacher.getText());

    }
}
