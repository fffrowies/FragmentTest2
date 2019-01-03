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

    private int firstNumber = 0, secondNumber = 0;
    private MainActivity.Employee employee;

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
                addTwoNumbers(firstNumber, secondNumber);
            }
        });

        return view;
    }

    private void addTwoNumbers(int firstNum, int secondNum) {

        int result = firstNum + secondNum;
        txvResult.setText("Result: " + result);
    }

    public void setData(int firstNumber, int secondNumber) {

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setEmployeeObj(MainActivity.Employee employee) {

        this.employee = employee; // use this obj as you wish
    }
}

