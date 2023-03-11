package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View addBtn = (Button) findViewById(R.id.addBtn);
        View divideBtn = (Button) findViewById(R.id.divideBtn);
        View subBtn = (Button) findViewById(R.id.subtract);
        View multiplyBtn = (Button) findViewById(R.id.multiplyBtn);
        View currencyBtn = (Button) findViewById(R.id.Currency);

        View result = (TextView) findViewById(R.id.result);
        TextView first = (TextView) findViewById(R.id.firstNumber);
        TextView second = (TextView) findViewById(R.id.secondNumber);

        addBtn.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        ((TextView) result).setText("");
                        Float res = Float.parseFloat(first.getText().toString()) + Float.parseFloat(second.getText().toString());
                        ((TextView) result).setText(" "+ res);

                    }
                });
        divideBtn.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        if(Float.parseFloat(second.getText().toString()) == 0){
                            ((TextView) result).setText("ERROR");
                        }else{
                            ((TextView) result).setText("");
                            Float res = Float.parseFloat(first.getText().toString()) / Float.parseFloat(second.getText().toString());
                            ((TextView) result).setText(" "+ res);
                        }
                    }
                });
        subBtn.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        ((TextView) result).setText("");
                        Float res = Float.parseFloat(first.getText().toString()) - Float.parseFloat(second.getText().toString());
                        ((TextView) result).setText(" "+ res);
                    }
                });
        multiplyBtn.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        ((TextView) result).setText("");
                        Float res = Float.parseFloat(first.getText().toString()) * Float.parseFloat(second.getText().toString());
                        ((TextView) result).setText(" "+ res);
                    }
                });

        currencyBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(getApplicationContext(), currency.class);
                        startActivity(intent);
                    }
                });
    }


}