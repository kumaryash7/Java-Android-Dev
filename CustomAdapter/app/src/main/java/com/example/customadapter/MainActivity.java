package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  ListView listView;
  String[] title = {"Master android Pro App","Master Flutter App","Master Android App","Youtube Channel","Rate Us"};
  String[] description = {"Learn Android Development From Zero to Hero","Learn Flutter From Scratch","Helping more than 780K + Users/Developers to learn Android","Android Master Appp is our Official Channel"};
   int[] imgss = { R.drawable.play_date_poster,R.drawable.sajna_poster,R.drawable.sky,R.drawable.sky2,R.drawable.scenery};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter = new MyListAdapter(this,title,description,imgss);
        listView = findViewById(R.id.listView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==0){
                    Toast.makeText(MainActivity.this, "Item 1 is selected", Toast.LENGTH_SHORT).show();
                }
                if (position ==1){
                    Toast.makeText(MainActivity.this, "Item 2 is selected", Toast.LENGTH_SHORT).show();
                }if (position ==2){
                    Toast.makeText(MainActivity.this, "Item 3 is selected", Toast.LENGTH_SHORT).show();
                }if (position ==3){
                    Toast.makeText(MainActivity.this, "Item 4 is selected", Toast.LENGTH_SHORT).show();
                }
            }
        });









    }
}