package com.example.taskbarappworkingtabbar;

import androidx.annotation.FractionRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView btnNav = findViewById(R.id.bottomNavigationView);
        btnNav.setOnItemSelectedListener(navListener);


  // SETTING UP THE HOME FRAGMENT
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_layout,new HomeFragment()).commit();

    }

    private NavigationBarView.OnItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectFragmnet = null;
            switch (item.getItemId()){
                case R.id.item1:
                    selectFragmnet= new HomeFragment();
                    break;
                case R.id.item2:
                    selectFragmnet= new AchievementFragment();
                    break;
                case R.id.item3:
                    selectFragmnet = new SettingsFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_layout,selectFragmnet).commit();
            return  true;
        }
    };
}