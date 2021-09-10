package com.example.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginFragment extends Fragment {

    private TextView usernameMainAct,passMainAct;
    private Button loginBtnMainAct;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        // OBTAINING LAYOUT THROUGH VIEW :
        View view;
        view = inflater.inflate(R.layout.login_fragment,null);

        loginBtnMainAct = view.findViewById(R.id.btnLogin);
        usernameMainAct = view.findViewById(R.id.edtusername);
        passMainAct = view.findViewById(R.id.edtPassword);

        // ATACHING LISTENERS :
        loginBtnMainAct.setOnClickListener(new View.OnClickListener() {


            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {


                if(usernameMainAct.getText().toString().equals("bitcode") && passMainAct.getText().toString().equals("bitcode")){

                    ((UserFragment) getFragmentManager().findFragmentById(R.id.userfragmentXml)).StatusChange(true, usernameMainAct.getText().toString());
                    loginBtnMainAct.setVisibility(View.INVISIBLE);

                }

                else {

                    ((UserFragment) getFragmentManager().findFragmentById(R.id.userfragmentXml)).StatusChange(false,usernameMainAct.getText().toString());

                }


            }
        });


    return view;

    }

    public void updateStatus (Boolean status){

        loginBtnMainAct.setVisibility(View.VISIBLE);


    }



}
