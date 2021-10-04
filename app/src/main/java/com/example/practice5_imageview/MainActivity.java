package com.example.practice5_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practice5_imageview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonSong.setOnClickListener(view -> binding.imageView.setImageResource(R.drawable.baby));
        binding.buttonMin.setOnClickListener(view -> binding.imageView.setImageResource(R.drawable.min));
        binding.buttonGuk.setOnClickListener(view -> binding.imageView.setImageResource(R.drawable.guk));
    }

}