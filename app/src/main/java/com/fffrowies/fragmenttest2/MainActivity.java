package com.fffrowies.fragmenttest2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private FragmentManager manager;
    private EditText etFirstNumber, etSecondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();

        etFirstNumber = findViewById(R.id.etFirstNumber);
        etSecondNumber = findViewById(R.id.etSecondNumber);
    }

    public void sendDataToFragment(View view) {

        int firstNumber = Integer.valueOf(etFirstNumber.getText().toString());
        int secondNumber = Integer.valueOf(etSecondNumber.getText().toString());

        Bundle bundle = new Bundle();
        bundle.putInt(Constants.FIRST_NUM, firstNumber);
        bundle.putInt(Constants.SECOND_NUM, secondNumber);

        FragmentA fragmentA = new FragmentA();
        fragmentA.setArguments(bundle);

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.containerFragmentA, fragmentA, "fragA");
        transaction.commit();
    }
}