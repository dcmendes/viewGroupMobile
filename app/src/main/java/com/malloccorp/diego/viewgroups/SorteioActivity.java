package com.malloccorp.diego.viewgroups;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class SorteioActivity extends AppCompatActivity {

    EditText txt1;
    EditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteio);

        txt1 = (EditText) findViewById(R.id.minText);
        txt2 = (EditText) findViewById(R.id.maxText);

    }

    public void sorteioOnClick(View view){


        int num = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        Random gerador = new Random();
        int res = gerador.nextInt(num2 -num) + num;
        if (res == num){
            res++;
        }

        TextView textView = (TextView) findViewById(R.id.resultadoView);
        textView.setText(Integer.toString(res));
    }

}
