package com.example.recycleviewhaldetail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class haldetail extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haldetail);

        ImageView ImageView = findViewById(R.id.imageview);
        TextView NameView = findViewById(R.id.name);
        TextView NIM = findViewById(R.id.nim);
        TextView Detail = findViewById(R.id.Detail);

        student student = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (student != null) {
            Glide.with(this)
                    .load(student.getImage())
                    .into(ImageView);

            NameView.setText(student.getName());
            NIM.setText(student.getNim());
            Detail.setText(student.getDetail());
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
