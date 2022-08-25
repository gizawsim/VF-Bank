package com.example.vfbank.main;

import android.content.Intent;
import android.os.Bundle;

import com.example.vfbank.databinding.ActivityMainBinding;
import com.example.vfbank.login.LoginActivity;
import com.example.vfbank.main.ui.MainViewModel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;



public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding =  ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

       // mainViewModel.txtName.observe(this, binding.btnMain::setText);


        mBinding.btnMain.setOnClickListener(view -> openLogin());
    }
    private void openLogin(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
}
