package com.example.lamproskids.students;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import com.example.lamproskids.R;

public class studentedit extends DialogFragment implements View.OnClickListener {
    ImageButton edit,add,plus;
    modelstudent modelstudent;
    public studentedit(modelstudent modelstudent) {
        this.modelstudent = modelstudent;
    }




    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dotstudnetlayout, container, false);

    }

    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edit = view.findViewById(R.id.editbutton);
        add = view.findViewById(R.id.playbutton);
        plus = view.findViewById(R.id.plusbutton);
        edit.setOnClickListener(this);
//
//        if (getArguments() != null && !TextUtils.isEmpty(getArguments().getString("email")))
//            editText.setText(getArguments().getString("email"));


    }


    @Override
    public void onCreate( Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.editbutton){
            Toast.makeText(getContext(),"EDIT",Toast.LENGTH_LONG).show();
        }
    }

    public interface DialogListener {
        void onFinishEditDialog(String inputText);
    }


}
