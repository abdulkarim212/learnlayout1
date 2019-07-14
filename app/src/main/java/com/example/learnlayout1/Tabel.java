package com.example.learnlayout1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tabel extends AppCompatActivity {
    private Button menu ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel);
   menu = (Button)findViewById(R.id.backtomenu);
   menu.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent i = new Intent(Tabel.this, MainActivity.class);
           startActivity(i);
       }
   });
    }
}
