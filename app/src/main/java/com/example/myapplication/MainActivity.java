package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private EditText txtedit;
    private TextView resulta;
    private TextView txtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtedit = (EditText) findViewById(R.id.editText);

        btn1 = (Button) findViewById(R.id.boton1);
                txtTexto = findViewById(R.id.resultad);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (view == btn1) {
                    int numero = 0;
                    numero = Integer.valueOf(txtedit.getText().toString());
                    Calendar c = Calendar.getInstance();
                    int semana = c.get(Calendar.WEEK_OF_YEAR);

                    if (numero == semana) {
                        Intent btn1 = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(btn1);

                    } else {
                        Intent btn1 = new Intent(MainActivity.this, MainActivity3.class);
                        startActivity(btn1);

                    }

                }
            }
        });

    }
}