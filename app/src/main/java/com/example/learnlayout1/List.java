package com.example.learnlayout1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class List extends ListActivity {
     String[] lecturers;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

    final ListView listView = getListView();
    listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    listView.setTextFilterEnabled(true);

    lecturers = getResources().getStringArray(R.array.lecturers_array);

    setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,lecturers));

       Button btnList =(Button)findViewById(R.id.btnlist);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemsSelected = "item yang dipilih :";
                for (int i=0;i<listView.getCount();i++){
                    if (listView.isItemChecked(i)){
                        itemsSelected += "\n"+listView.getItemAtPosition(i);
                    }
                }
                Toast.makeText(List.this, itemsSelected, Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    protected void onListItemClick(ListView I,View view,int position,long id){
        Toast.makeText(this, "Anda memili h"+lecturers[position], Toast.LENGTH_SHORT).show();
    }
}
