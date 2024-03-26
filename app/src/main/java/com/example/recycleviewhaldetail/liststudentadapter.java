package com.example.recycleviewhaldetail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class liststudentadapter extends RecyclerView.Adapter<datastudent> {
    Context context;
    List<student> items;

    {

    }

    private OnItemClickCallback onItemClickCallback;

    public liststudentadapter(Context context, List<student> items) {
        this.context = context;
        this.items = items;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    @NonNull
    @Override
    public datastudent onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.studentview, parent, false);
        return new datastudent(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final datastudent holder, int position) {
        final student currentItem = items.get(position);
        holder.nameView.setText(currentItem.getName());
        holder.nimView.setText(currentItem.getNim());
        holder.imageView.setImageResource(currentItem.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(currentItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public interface OnItemClickCallback {
        void onItemClicked(student student);
    }
}
