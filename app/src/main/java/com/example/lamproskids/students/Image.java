package com.example.lamproskids.students;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lamproskids.R;

import java.util.ArrayList;

class model_image {
    Bitmap bitmap;
    public model_image() {
    }
//    public model_image(int image, String name) {
//        //this.image = image;
//        this.name = name;
//
//    }


    public model_image(Bitmap bitmap, String name) {
        this.bitmap = bitmap;
        this.name = name;
    }

    public int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    }
class holder_image extends RecyclerView.ViewHolder{
        TextView text1;
        ImageView imageView;
        public holder_image(@NonNull View itemView) {
            super(itemView);
            this.text1 = itemView.findViewById(R.id.imagename);
            this.imageView = itemView.findViewById(R.id.imageview);
        }
}
class adpater_image extends RecyclerView.Adapter<holder_image>{
    Context c;
    ArrayList<model_image> model;
    public adpater_image(Context c, ArrayList<model_image> model) {
        this.c = c;
        this.model = model;
    }

    @NonNull
    @Override
    public holder_image onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_image,null);
        return new holder_image(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder_image holder, int position) {
        holder.text1.setText(model.get(position).getName());
       // holder.imageView.setImageResource(model.get(position).getImage());
        holder.imageView.setImageBitmap(model.get(position).bitmap);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}