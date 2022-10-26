package com.example.viewmodelandlivedataapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button ;
TextView textView;
MainActivityViewModel mainActivityViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

//
//        textView.setText("You Clicked Me :"+mainActivityViewModel.getInitialCcounter()+" times ");

        LiveData<Integer> count = mainActivityViewModel.getInitialCcounter();
        count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textView.setText("You Clicked Me "+mainActivityViewModel.getInitialCcounter()+"times");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView.setText("You clicked me :"+mainActivityViewModel.getCounter()+"times");
                mainActivityViewModel.getCounter();

            }
        });
    }
}