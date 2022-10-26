package com.example.customlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.customlistview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        int[] imageId={R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9};
        String [] name={"Rohit","Craig","Vishnu","Dhoni","Virat","lee chonng wei","lin dan","loh kea yu","victor axelsen"};
        String [] lastMessage={"bye","meet you soon","see ya","hello","how r you?","good, amazing man","bye bye see ya","wow bro","chalo good talk,now bye"};
        String [] lastmsgTime={"8:10 am","9:10 am","10:10 am","18:10 pm","12:10 pm","15:00 pm","11:30 am","17:40 pm","8:00 am"};
        String [] phoneNo={"9098263562","1268263562","7009263562","9098262535","3593363562","99098263562","8888263562","7265263562","8821263562"};
        String [ ] country={"India","USA","Russia","Poland","Denmark","Canada","Sri lanka","Japan","Sweden"};

        ArrayList<User> userArrayList=new ArrayList<>();
        for(int i=0;i<imageId.length;i++){
            User user = new User(name[i],lastMessage[i],lastmsgTime[i],phoneNo[i],country[i],imageId[i]);
            userArrayList.add(user);
        }
        ListAdapter listAdapter = new ListAdapter(MainActivity.this,userArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =  new Intent(MainActivity.this,UserActivity.class);
                intent.putExtra("name",name[position]);
                intent.putExtra("phone",phoneNo[position]);
                intent.putExtra("country",country[position]);
                intent.putExtra("imageId",imageId[position]);
                startActivity(intent);

            }
        });
    }
}