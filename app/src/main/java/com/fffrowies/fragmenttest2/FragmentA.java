package com.fffrowies.fragmenttest2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {

    private static final String TAG = FragmentA.class.getSimpleName();

    private Button btnAdd;
    private TextView txvResult;

    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        txvResult = view.findViewById(R.id.txvResult);
        btnAdd = view.findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to add two numbers
            }
        });

        return view;
    }
}

