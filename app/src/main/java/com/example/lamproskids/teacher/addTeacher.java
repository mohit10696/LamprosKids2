package com.example.lamproskids.teacher;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lamproskids.R;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;
import java.util.List;

public class addTeacher extends AppCompatActivity implements View.OnClickListener {

    EditText fname,lname,email,username,password;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_teacher);
        setTitle("User Details");
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lastname);
        email = findViewById(R.id.email);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        back = findViewById(R.id.teachercancle);
        back.setOnClickListener(this);
        setdataonedittext();
        addItemsOnSpinner1();
        addItemsOnSpinner2();
        addItemsOnSpinner3();
    }

    private void setdataonedittext() {
        String name = getIntent().getStringExtra("name");
        fname.setText(name);
        lname.setText(name);
        //email.setText(getIntent().getStringExtra("email"));
        username.setText(getIntent().getStringExtra("username"));
    }

    private void addItemsOnSpinner3() {
        MaterialBetterSpinner spinner =findViewById(R.id.clas);
        List<String> list = new ArrayList<String>();
        list.add("list 1");
        list.add("list 2");
        list.add("list 3");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinnerdesign, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);


    }

    private void addItemsOnSpinner2() {
        MaterialBetterSpinner spinner2 = findViewById(R.id.divison);
        List<String> list = new ArrayList<String>();
        list.add("list 1");
        list.add("list 2");
        list.add("list 3");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinnerdesign, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }

    private void addItemsOnSpinner1() {
        MaterialBetterSpinner spinner2 =  findViewById(R.id.userrole);
        List<String> list = new ArrayList<String>();
        list.add("list 1");
        list.add("list 2");
        list.add("list 3");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinnerdesign, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.teachercancle){
            onBackPressed();
        }

    }
}
