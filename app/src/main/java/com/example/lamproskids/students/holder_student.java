package com.example.lamproskids.students;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lamproskids.R;

public class holder_student extends RecyclerView.ViewHolder {
    private TextView title;
    public ImageButton expand;
    public ImageButton dot;
    Context context;
    View submenu;

    public holder_student(@NonNull View itemView) {
        super(itemView);
        expand= itemView.findViewById(R.id.expandbutton);
        submenu = itemView.findViewById(R.id.submenu);
        dot = itemView.findViewById(R.id.overflowbutton);
        context = itemView.getContext();
    }

    public void bind(final modelstudent modelstudent) {
        boolean expanded = modelstudent.isExpended();
        if(modelstudent.isExpended())expand.setImageResource(R.drawable.ic_up);
        else expand.setImageResource(R.drawable.ic_down);
        submenu.setVisibility(expanded ? View.VISIBLE : View.GONE);
        //title.setText(modelstudent.getText());
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),modelstudent.getText(),Toast.LENGTH_LONG).show();
                studentedit dialogFragment = new studentedit(modelstudent);

                Bundle bundle = new Bundle();
                bundle.putBoolean("notAlertDialog", true);

                dialogFragment.setArguments(bundle);

                FragmentTransaction ft = ((AppCompatActivity)context).getSupportFragmentManager().beginTransaction();
                Fragment prev = ((AppCompatActivity)context).getSupportFragmentManager().findFragmentById(R.id.filterstudentbox);
                if (prev != null) {
                    ft.remove(prev);
                }
                ft.addToBackStack(null);
                dialogFragment.show(ft, "dialog");
            }
        });
    }

}
