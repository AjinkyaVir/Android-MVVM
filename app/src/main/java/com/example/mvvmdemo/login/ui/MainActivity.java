package com.example.mvvmdemo.login.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.ActivityMainBinding;
import com.example.mvvmdemo.login.viewmodel.LoginViewModel;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

       ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
       activityMainBinding.setLoginViewModel(new LoginViewModel(this));
       activityMainBinding.executePendingBindings();

    }
}