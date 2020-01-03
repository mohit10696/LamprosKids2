package com.example.lamproskids.teacher;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lamproskids.R;



public class holder_teacher extends RecyclerView.ViewHolder {
    private TextView username,name,branch,classs;

    public holder_teacher(@NonNull final View itemView) {
        super(itemView);
        username = itemView.findViewById(R.id.teacherusername);
        name = itemView.findViewById(R.id.teachername);
        branch = itemView.findViewById(R.id.teacherbranch);
        username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),addTeacher.class);

                i.putExtra("username",username.getText().toString());
                i.putExtra("name",name.getText().toString());
                i.putExtra("branch",branch.getText().toString());
                view.getContext().startActivity(i);
                //binddata();
            }
        });
       // submenu = itemView.findViewById(R.id.submenu);
    }


    public void bind(modelteacher modelteacher) {

        //title.setText(modelteacher.getText());

    }
}
