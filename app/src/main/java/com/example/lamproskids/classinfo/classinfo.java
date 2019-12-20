package com.example.lamproskids.classinfo;

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

public class classinfo extends androidx.fragment.app.Fragment {

    Button button;
    RecyclerView recyclerView;
    adpater_classinfo adpater_classinfo;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.classinfo,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adpater_classinfo = new adpater_classinfo(getContext(),getlist());
        recyclerView.setAdapter(adpater_classinfo);

    }

    private ArrayList<model_classinfo> getlist() {
        ArrayList<model_classinfo> models = new ArrayList<>();
        model_classinfo m = new model_classinfo();
        m.setName("Mohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);

        m = new model_classinfo();
        m.setName("Mohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);

        m = new model_classinfo();
        m.setName("Mohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);

        m = new model_classinfo();
        m.setName("Mohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);

        m = new model_classinfo();
        m.setName("Mohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);

        m = new model_classinfo();
        m.setName("Mohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);

        m = new model_classinfo();
        m.setName("Lohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);

        m = new model_classinfo();
        m.setName("Lohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);

        m = new model_classinfo();
        m.setName("Lohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);

        m = new model_classinfo();
        m.setName("Lohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);

        m = new model_classinfo();
        m.setName("Lohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);

        m = new model_classinfo();
        m.setName("Lohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);

        m = new model_classinfo();
        m.setName("Lohit Sojitra");
        m.setTotalfees("1000");
        models.add(m);
        return models;
    }
}
