package com.example.fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class UserFragment extends Fragment {

    private TextView displayTxt;
    private Button logoutBtn;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {





        View userview;
        userview = inflater.inflate(R.layout.display_usertext,null);
        displayTxt = userview.findViewById(R.id.displayMessage);
        logoutBtn = userview.findViewById(R.id.btnLogout);

        logoutBtn.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                LoginFragment userfragMngr;
                userfragMngr = (LoginFragment) getFragmentManager().findFragmentById(R.id.loginfragmentXml);
                userfragMngr.updateStatus(true);

                // SETTING UP BUTTON VISIBILITY :
                logoutBtn.setVisibility(View.INVISIBLE);
                Snackbar.make(logoutBtn,"Bye Bye !", BaseTransientBottomBar.LENGTH_SHORT).show();
                displayTxt.setText("");
            }
        });



        return userview;
    }


    public void StatusChange(Boolean status, String username){
        if (status == true){
            displayTxt.setText("Welcome " + username);
            logoutBtn.setVisibility(View.VISIBLE);
        }
        else{
            displayTxt.setText("Bye Bye " + username);
        }

    }



}


