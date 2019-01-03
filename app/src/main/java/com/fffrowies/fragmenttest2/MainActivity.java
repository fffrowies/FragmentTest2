package com.fffrowies.fragmenttest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFragmentA(View view) {
    }

    public void removeFragmentA(View view) {
    }

    public void addFragmentB(View view) {
    }

    public void removeFragmentB(View view) {
    }
}