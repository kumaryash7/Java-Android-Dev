package com.example.listviewapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  ListView listView;
  String [] arr = {" This is ", " Item 1 "," Item 2","Item 3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
       // ArrayAdapter<String> ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
       // listView.setAdapter(ad);
        YashAdapter ad = new YashAdapter(this,R.layout.my_yash_layout,arr);
        listView.setAdapter(ad);
    }
}