package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.myapplication.databinding.Page2Binding;

public class Page2 extends AppCompatActivity {
    private Page2Binding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);

        binding = Page2Binding.inflate(getLayoutInflater());
        View v = binding.getRoot();
        setContentView(v);

        binding.textaffich.setText(getIntent().getStringExtra("text").toString());
    }
}
