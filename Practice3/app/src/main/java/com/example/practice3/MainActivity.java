package com.example.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private static final  String TAG = "Message";
  Button button;
  Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        Toast.makeText(this, "Welcome to my app", Toast.LENGTH_SHORT).show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Intent i = new Intent(getApplicationContext(),ActivityB.class);
            //    startActivity(i);
                GoToActivityB();
            }

            private void GoToActivityB() {
                Intent i = new Intent(getApplicationContext(),ActivityB.class);
                startActivity(i);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse("https://www.google.com"));
                startActivity(i2);
            }
        });

        Log.i(TAG,"onCreate method is called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart Method is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart method is called");
                                                                 // ON START ,ON RESUME,ON  PAUSE,ON RESTART METHODS IN ANDROID STUDIO

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG,"onResume method is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPasue method is called");
    }
}