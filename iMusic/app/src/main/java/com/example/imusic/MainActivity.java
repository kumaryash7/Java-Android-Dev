package com.example.imusic;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);


     Dexter.withContext(this)
                .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                .withListener(new PermissionListener() {
                    @RequiresApi(api = Build.VERSION_CODES.R)
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {


                    Toast.makeText(MainActivity.this, "RUN TIME PERMISSION GIVEN", Toast.LENGTH_SHORT).show();
                    ArrayList<File> mySongs = fetchSongs(Environment.getStorageDirectory());
                   String [] items = new String[mySongs.size()];
                   for(int i =0;i<mySongs.size();i++){
                       items[i] = mySongs.get(i).getName().replace(".mp3"," ");

                   }

                        ArrayAdapter<String> adapter = new ArrayAdapter<String>();

                        
                        listView.setAdapter(adapter);
                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                       permissionToken.continuePermissionRequest();
                    }
                })
                .check();

    }
    public ArrayList<File> fetchSongs (File file){
        ArrayList arrayList = new ArrayList();
        File[ ] songs = file.listFiles();
        if (songs != null){
            for( File myFile: songs ){
                if(!myFile.isHidden() && myFile.isDirectory()){
                    arrayList.addAll(fetchSongs(myFile));
                }
                else {
                    if(myFile.getName().endsWith(".mp3") && !myFile.getName().startsWith(" . ")){
                        arrayList.add(myFile);

                    }
                }
            }
        }
        return arrayList;

    }
}