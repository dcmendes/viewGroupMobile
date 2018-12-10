package com.malloccorp.diego.viewgroups;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ConversorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);


    }

    public void converterTemp(View view){
        EditText editText = (EditText) findViewById(R.id.celsiuView);
        double celsius = Double.parseDouble(editText.getText().toString());
        double fanh = (celsius*1.8) +32;

        TextView textView =(TextView) findViewById(R.id.resultado);
        textView.setText(String.valueOf(fanh) + " F°");

    }

}
