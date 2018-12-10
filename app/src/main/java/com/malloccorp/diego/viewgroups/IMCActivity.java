package com.malloccorp.diego.viewgroups;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class IMCActivity extends AppCompatActivity {

    EditText weightText;
    EditText heightText;
    double peso;
    double altura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        weightText = (EditText) findViewById(R.id.weihghtEdit);
        heightText = (EditText) findViewById(R.id.heightEdit);


    }

    public void calcularIMC(View view) {

        peso = Double.parseDouble(weightText.getText().toString());
        altura = Double.parseDouble(heightText.getText().toString());

        Double imc = peso / (altura * altura);
        DecimalFormat f = new DecimalFormat("#.####");
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(String.valueOf(f.format(imc)));
    }
}