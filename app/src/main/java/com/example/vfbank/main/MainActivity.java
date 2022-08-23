package com.example.vfbank.main;

import android.os.Bundle;
import android.widget.TextView;

import com.example.vfbank.databinding.ActivityMainBinding;
import com.example.vfbank.main.ui.MainViewModel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;



public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        mainViewModel.txtName.observe(this, binding.txtMain::setText);


        binding.txtMain.setOnClickListener(view -> {
            mainViewModel.onClickName();
               }
               );
    }
}
