package com.example.lamproskids.students;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

import com.example.lamproskids.R;

import java.util.ArrayList;
import java.util.List;

public class manangestudent extends androidx.fragment.app.Fragment {

    Button button;
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
    }
}
