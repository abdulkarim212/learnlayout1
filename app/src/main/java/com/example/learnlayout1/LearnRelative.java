package com.example.learnlayout1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LearnRelative extends AppCompatActivity {
    private Button btBack, save ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_relative);

        btBack = (Button)findViewById(R.id.btBack);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LearnRelative.this, MainActivity.class);
                startActivity(i);
            }
        });

        save = (Button)findViewById(R.id.btSave);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LearnRelative.this, "Saved Success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
