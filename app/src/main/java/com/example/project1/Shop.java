package com.example.project1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Shop extends Fragment {
    Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_shop, container, false);



        button=view.findViewById(R.id.shopwomen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Women women = new Women();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,women).commit();

            }
        });

        return view;

    }


}