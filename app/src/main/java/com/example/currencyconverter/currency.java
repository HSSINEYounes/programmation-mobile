package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class currency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner1);
        TextView first = (TextView) findViewById(R.id.Number1);
        TextView second = (TextView) findViewById(R.id.Number2);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String choice1 = spinner1.getSelectedItem().toString();
                //if(choice1.compareTo("Autre")==0){
                System.out.println("\n=>=>=>=>=>=>=>=>=>=>=>=>" + choice1 + "\n");
                //}

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                //spinner.getSelectedItem().toString()
                String choice2 = spinner1.getSelectedItem().toString();
                if(choice2.compareTo("Autre")==0){

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
    }
}