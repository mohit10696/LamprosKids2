package com.example.lamproskids.students;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lamproskids.R;

import java.util.ArrayList;

public class upload_student extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_student);
        setTitle("Student images");
        recyclerView = findViewById(R.id.recyclevieimage);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adpater_image(this,getimage()));
    }

    private ArrayList<model_image> getimage() {
        ArrayList<model_image> model_images = new ArrayList<>();
        model_images.add(new model_image(R.drawable.dummy,"Mohit Sojitra"));
        model_images.add(new model_image(R.drawable.dummy,"Mohit Sojitra"));
        return  model_images;
    }

    public void newimage(View view) {

    }
}
