package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class currency extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        boolean secondChg = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

        TextView first = (TextView) findViewById(R.id.Number1);
        TextView second = (TextView) findViewById(R.id.Number2);


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String choice1 = spinner1.getSelectedItem().toString();
                String choice2 = spinner2.getSelectedItem().toString();
                double value;
                if(first.getText().toString().compareTo("") != 0){
                    if(choice1.compareTo("USD") == 0){
                        if(choice2.compareTo("USD") == 0)
                            value = 1;
                        else if(choice2.compareTo("Euro") == 0)
                            value = 0.94;
                        else
                            value = 10.34;
                    }else if(choice1.compareTo("Euro") == 0){
                        if(choice2.compareTo("USD") == 0)
                            value = 1.06;
                        else if(choice2.compareTo("Euro") == 0)
                            value = 1;
                        else
                            value = 11.01;
                    }else {
                        if (choice2.compareTo("USD") == 0)
                            value = 0.079;
                        else if (choice2.compareTo("Euro") == 0)
                            value = 0.091;
                        else
                            value = 1;
                    }
                    second.setText("" + Float.parseFloat(first.getText().toString()) * value);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                String choice1 = spinner1.getSelectedItem().toString();
                String choice2 = spinner2.getSelectedItem().toString();
                double value;
                if(first.getText().toString().compareTo("") != 0 ){
                    if(choice1.compareTo("USD") == 0){
                        if(choice2.compareTo("USD") == 0)
                            value = 1;
                        else if(choice2.compareTo("Euro") == 0)
                            value = 0.94;
                        else
                            value = 10.34;
                    }else if(choice1.compareTo("Euro") == 0){
                        if(choice2.compareTo("USD") == 0)
                            value = 1.06;
                        else if(choice2.compareTo("Euro") == 0)
                            value = 1;
                        else
                            value = 11.01;
                    }else {
                        if (choice2.compareTo("USD") == 0)
                            value = 0.079;
                        else if (choice2.compareTo("Euro") == 0)
                            value = 0.091;
                        else
                            value = 1;
                    }
                    second.setText("" + Float.parseFloat(first.getText().toString()) * value);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

        });
        first.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String choice1 = spinner1.getSelectedItem().toString();
                String choice2 = spinner2.getSelectedItem().toString();
                double value;
                if(first.getText().toString().compareTo("") != 0){
                    if(choice1.compareTo("USD") == 0){
                        if(choice2.compareTo("USD") == 0)
                            value = 1;
                        else if(choice2.compareTo("Euro") == 0)
                            value = 0.94;
                        else
                            value = 10.34;
                    }else if(choice1.compareTo("Euro") == 0){
                        if(choice2.compareTo("USD") == 0)
                            value = 1.06;
                        else if(choice2.compareTo("Euro") == 0)
                            value = 1;
                        else
                            value = 11.01;
                    }else {
                        if (choice2.compareTo("USD") == 0)
                            value = 0.079;
                        else if (choice2.compareTo("Euro") == 0)
                            value = 0.091;
                        else
                            value = 1;
                    }
                    second.setText("" + Float.parseFloat(first.getText().toString()) * value);
                }else{
                    second.setText("0");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        /*second.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String choice1 = spinner1.getSelectedItem().toString();
                String choice2 = spinner2.getSelectedItem().toString();
                double value;
                if(second.getText().toString().compareTo("") != 0){
                    if(choice1.compareTo("USD") == 0){
                        if(choice2.compareTo("USD") == 0)
                            value = 1;
                        else if(choice2.compareTo("Euro") == 0)
                            value = 0.94;
                        else
                            value = 10.34;
                    }else if(choice1.compareTo("Euro") == 0){
                        if(choice2.compareTo("USD") == 0)
                            value = 1.06;
                        else if(choice2.compareTo("Euro") == 0)
                            value = 1;
                        else
                            value = 11.01;
                    }else {
                        if (choice2.compareTo("USD") == 0)
                            value = 0.079;
                        else if (choice2.compareTo("Euro") == 0)
                            value = 0.091;
                        else
                            value = 1;
                    }
                    first.setText("" + Float.parseFloat(second.getText().toString()) * value);
                }else{
                    first.setText("0");
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });*/
    }
}