package com.fffrowies.fragmenttest2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {

    private static final String TAG = FragmentA.class.getSimpleName();

    private Button btnSend;
    private EditText etFirstNumber, etSecondNumber;

    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        etFirstNumber = view.findViewById(R.id.etFirstNumber);
        etSecondNumber = view.findViewById(R.id.etSecondNumber);

        btnSend = view.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });

        return view;
    }

    private void sendData() {

        int firstNum = Integer.valueOf(etFirstNumber.getText().toString());
        int secondNum = Integer.valueOf(etSecondNumber.getText().toString());

        MyListener myListener = (MyListener) getActivity();
        myListener.addTwoNumbers(firstNum, secondNum);
    }
}

