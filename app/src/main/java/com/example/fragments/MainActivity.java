package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private LoginFragment loginfragObj;
    private UserFragment userfragObj;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    @SuppressLint("ResourceType")
    public void init(){
        loginfragObj = (LoginFragment) getSupportFragmentManager().findFragmentById(R.layout.login_fragment);
        userfragObj = (UserFragment) getSupportFragmentManager().findFragmentById(R.layout.display_usertext);


    }

}