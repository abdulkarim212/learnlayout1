package com.example.learnlayout1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button gotorelative,gotable, goscroll,golist,goGrid ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gotorelative = (Button)findViewById(R.id.gotorelative1);
        gotorelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LearnRelative.class);
                startActivity(i);
            }
        });


        gotable = (Button)findViewById(R.id.goTable);
        gotable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Tabel.class);
                startActivity(i);
            }
        });

        goscroll = (Button) findViewById(R.id.goScroll);
        goscroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Scroll.class);
                startActivity(i);
            }
        });

        golist = (Button)findViewById(R.id.goList);
        golist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, List.class);
                startActivity(i);
            }
        });

        goGrid = (Button)findViewById(R.id.goGrid);
        goGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, GridView.class);
                startActivity(i);
            }
        });


    }


}
