package com.example.lamproskids.teacher;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lamproskids.R;

import java.util.ArrayList;
import java.util.List;

public class manageteacher extends androidx.fragment.app.Fragment {

    Button button;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.manageteacher,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<modelteacher> modelteachers = new ArrayList<>();
        modelteachers.add(new modelteacher());
        modelteachers.add(new modelteacher());
        modelteachers.add(new modelteacher());
        modelteachers.add(new modelteacher());
        modelteachers.add(new modelteacher());
        modelteachers.add(new modelteacher());
        adpater_teacher adapter = new adpater_teacher(modelteachers,getContext());
        RecyclerView recyclerView = view.findViewById(R.id.recycleview3);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        
      
    }
}
