package com.malloccorp.diego.viewgroups;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btIMC, btConv, btSorteio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btIMC = (Button) findViewById(R.id.imcBtn);

    }


    public void openIMC(View view){
        Intent intent = new Intent(this, IMCActivity.class);
        startActivity(intent);
    }

    public void openConversor(View view){
        Intent intent = new Intent(this, ConversorActivity.class);
        startActivity(intent);
    }

    public void openSorteio(View view){
        Intent intent = new Intent(this, SorteioActivity.class);
        startActivity(intent);
    }
}
