package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn3 = (Button) findViewById(R.id.boton3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir = new Intent(Intent.ACTION_MAIN);
                salir.addCategory(Intent.CATEGORY_HOME);
                salir.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(salir);
                finish();

            }
        });
    }
}
