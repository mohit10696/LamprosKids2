package com.example.lamproskids.students;

import android.app.DatePickerDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.lamproskids.R;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class fragment_addchildinfo extends Fragment {
    TextView dob;
    View v;
    private OnFragmentInteractionListener mListener;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.childinfo_form, container, false);
        adddropdown();

        //text.setText("Page "+mParam1);
        dob = v.findViewById(R.id.Dobpicker);
        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar mcurrentDate=Calendar.getInstance();
                int mYear=mcurrentDate.get(Calendar.YEAR);
                int mMonth=mcurrentDate.get(Calendar.MONTH);
                int mDay=mcurrentDate.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog mDatePicker=new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    public void onDateSet(DatePicker datepicker, int selectedyear, int selectedmonth, int selectedday) {
                        // TODO Auto-generated method stub
                        /*      Your code   to get date and time    */
                        dob.setText(selectedday+"/"+selectedmonth+"/"+selectedyear);
                    }
                },mYear, mMonth, mDay);
                mDatePicker.setTitle("Select date");
                mDatePicker.show();

            }
        });
        return v;
    }

    private void adddropdown() {
        MaterialBetterSpinner spinner2 = v.findViewById(R.id.tt);
        List<String> list = new ArrayList<String>();
        list.add("Yes");
        list.add("No");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.spinnerdesign, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);

        spinner2 = v.findViewById(R.id.batchs);
        String[] ary = getResources().getStringArray(R.array.batch);
        dataAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.spinnerdesign, ary);
        spinner2.setAdapter(dataAdapter);

        spinner2 = v.findViewById(R.id.classss);
        ary = getResources().getStringArray(R.array.classs);
        dataAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.spinnerdesign, ary);
        spinner2.setAdapter(dataAdapter);

        spinner2 = v.findViewById(R.id.divisons);
        ary = getResources().getStringArray(R.array.toilet);
        dataAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.spinnerdesign, ary);
        spinner2.setAdapter(dataAdapter);

        spinner2 = v.findViewById(R.id.years);
        ary = getResources().getStringArray(R.array.classs);
        dataAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.spinnerdesign, ary);
        spinner2.setAdapter(dataAdapter);

        spinner2 = v.findViewById(R.id.terms);
        ary = getResources().getStringArray(R.array.term);
        dataAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.spinnerdesign, ary);

        spinner2.setAdapter(dataAdapter);
        spinner2 = v.findViewById(R.id.bloods);
        ary = getResources().getStringArray(R.array.bloodgroup);
        dataAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.spinnerdesign, ary);

        spinner2.setAdapter(dataAdapter);
        spinner2 = v.findViewById(R.id.genders);
        ary = getResources().getStringArray(R.array.gender);
        dataAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.spinnerdesign, ary);

        spinner2.setAdapter(dataAdapter);
        spinner2 = v.findViewById(R.id.topsizes);
        ary = getResources().getStringArray(R.array.size);
        dataAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.spinnerdesign, ary);

        spinner2.setAdapter(dataAdapter);
        spinner2 = v.findViewById(R.id.bottomsizes);
        ary = getResources().getStringArray(R.array.size);
        dataAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.spinnerdesign, ary);
        spinner2.setAdapter(dataAdapter);
    }

    public fragment_addchildinfo() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    public interface OnFragmentInteractionListener {

        void onFragmentInteraction(Uri uri);
    }
}
