package com.fffrowies.fragmenttest2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

    private static final String TAG = FragmentB.class.getSimpleName();

    private TextView txvResult;


    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        txvResult = view.findViewById(R.id.txvResult);

        return view;
    }

    public void addTwoNumbersInFragment(int x, int y) {


    }
}
