package com.example.recycleviewhaldetail;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class datastudent  extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView nameView, nimView, DetailView;

    public datastudent(@NonNull View studentview) {
        super(studentview);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        DetailView = itemView.findViewById(R.id.Detail);
        nimView = itemView.findViewById(R.id.nim);
    }
}

