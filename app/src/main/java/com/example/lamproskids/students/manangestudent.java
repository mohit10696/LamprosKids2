package com.example.lamproskids.students;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

import com.example.lamproskids.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class manangestudent extends androidx.fragment.app.Fragment implements studentfilter.DialogListener {


    FloatingActionButton filter ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.managestudent,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<modelstudent> modelstudents = new ArrayList<>();
        modelstudents.add(new modelstudent());
        modelstudents.add(new modelstudent());
        modelstudents.add(new modelstudent());
        modelstudents.add(new modelstudent());
        modelstudents.add(new modelstudent());
        modelstudents.add(new modelstudent());
        adpater_student adapter = new adpater_student(modelstudents);
        RecyclerView recyclerView = view.findViewById(R.id.recycleview2);
        ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        filter =  view.findViewById(R.id.filterstudent);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studentfilter dialogFragment = new studentfilter();

                Bundle bundle = new Bundle();
                bundle.putBoolean("notAlertDialog", true);

                dialogFragment.setArguments(bundle);

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Fragment prev = getFragmentManager().findFragmentByTag("dialog");
                if (prev != null) {
                    ft.remove(prev);
                }
                ft.addToBackStack(null);
                dialogFragment.show(ft, "dialog");
            }
        });
    }

    @Override
    public void onFinishEditDialog(String inputText) {

    }
}
