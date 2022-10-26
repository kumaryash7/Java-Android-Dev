package com.example.practice6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  ListView listView;

  String[] mobileTypes = {"Note 8 Galaxy", "MAte 20 pro","Nte 9 +","Note 10 +","Iphone X","One plus nord","One plus 7T Mclaren"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter<String >(this, android.R.layout.simple_list_item_1,mobileTypes);

        listView.setAdapter(adapter);

        //HANDLING CLICK EVENTS IN LIST VIEWS

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(MainActivity.this, "I will buy "+adapter.getItem(position), Toast.LENGTH_SHORT).show();
           }
       });

    }
}