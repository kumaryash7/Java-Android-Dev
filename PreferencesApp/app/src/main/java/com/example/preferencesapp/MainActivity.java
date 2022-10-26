package com.example.preferencesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences ;
    TextView name;
    TextView email;

  
    public static final String mypreferences = "mypref";  //MAKING SOME CONSTANTS
    public static final String Name ="nameKey";
    public static final String Email ="emailKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.etName);
        email =findViewById(R.id.etEmail);

//        MOSTLY USE MODE PRIVATE
        sharedPreferences = getSharedPreferences(mypreferences, Context.MODE_PRIVATE);


        if(sharedPreferences.contains(Name))
            name.setText(sharedPreferences.getString(Name," "));

        if(sharedPreferences.contains(Email))
            email.setText(sharedPreferences.getString(Email," "));




    }

    //SAVING DATA
    public void  Save(View view){
        String n = name.getText().toString();
        String e = email.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Name,n);
        editor.putString(Email,e);
        editor.commit();
    }
    public void Clear(View view){
        name = findViewById(R.id.etName);
        email = findViewById(R.id.etEmail);
        email.setText("");
        name.setText("");

    }
    public  void Get(View view){
        name = findViewById(R.id.etName);
        email = findViewById(R.id.etEmail);
        SharedPreferences sharedPreferences = getSharedPreferences(mypreferences,Context.MODE_PRIVATE);

        if(sharedPreferences.contains(Name)) {
            name.setText(sharedPreferences.getString(Name, ""));
        }
        if(sharedPreferences.contains(Email)){
    email.setText(sharedPreferences.getString(Email,""));
        }
    }
   //This is just an extra on click method made by me for fun
    public  void Greet(View view){
        Toast.makeText(MainActivity.this, "just Practise", Toast.LENGTH_SHORT).show();
    }

}