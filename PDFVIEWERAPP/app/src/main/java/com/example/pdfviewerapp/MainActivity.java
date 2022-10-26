 package com.example.pdfviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

 public class MainActivity extends AppCompatActivity {
  PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfView = findViewById(R.id.pdfView);

        //Getting PDF File from Assets
  pdfView
          .fromAsset("acadreg_form.pdf")
         .nightMode(false)     // IN NIGHT MODE
          .swipeHorizontal(true)
          .scrollHandle(null)
          .load();
    }
}