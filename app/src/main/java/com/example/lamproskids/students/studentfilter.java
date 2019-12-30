package com.example.lamproskids.students;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.DialogFragment;

import com.example.lamproskids.R;

public class studentfilter extends DialogFragment {


//    @Override
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//
////
////        if (getArguments() != null) {
////            if (getArguments().getBoolean("notAlertDialog")) {
////                return super.onCreateDialog(savedInstanceState);
////            }
////        }
////        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
////        builder.setTitle("Alert Dialog");
////        builder.setMessage("Alert Dialog inside DialogFragment");
//
////        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
////            @Override
////            public void onClick(DialogInterface dialog, int which) {
////                dismiss();
////            }
////        });
////
////        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
////            @Override
////            public void onClick(DialogInterface dialog, int which) {
////                dismiss();
////            }
////        });
//
////        return builder.create();
//
//    }


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.filterstudnetlayout, container, false);

    }

    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


//
//        if (getArguments() != null && !TextUtils.isEmpty(getArguments().getString("email")))
//            editText.setText(getArguments().getString("email"));

        Button btnDone = view.findViewById(R.id.close);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DialogListener dialogListener = (DialogListener) getParentFragment();
               // dialogListener.onFinishEditDialog(editText.getText().toString());
                dismiss();
            }
        });
    }


    @Override
    public void onCreate( Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
//
//        Log.d("API123", "onCreate");
//
//        boolean setFullScreen = false;
//        if (getArguments() != null) {
//            setFullScreen = getArguments().getBoolean("fullScreen");
//        }
//
//        if (setFullScreen)
//            setStyle(DialogFragment.STYLE_NORMAL, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public interface DialogListener {
        void onFinishEditDialog(String inputText);
    }


}
