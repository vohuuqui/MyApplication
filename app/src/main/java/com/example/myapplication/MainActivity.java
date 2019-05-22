package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mytoast;
    Button mybutton;
    EditText mytext;
    Integer i=0,j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytext = findViewById(R.id.mytext);
        mytoast = findViewById(R.id.mytoast);
        mytoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello Mấy Cưng!",Toast.LENGTH_LONG).show();
            }
        });
        mybutton = findViewById(R.id.mybutton);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j=i++;
                mytext.setTextSize(200);
                mytext.setText(j.toString());
            }
        });
    }
}
