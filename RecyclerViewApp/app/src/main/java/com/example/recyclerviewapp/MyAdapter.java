package com.example.recyclerviewapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter {
    private List<Movie> movieList ;

    public MyAdapter(List<Movie> movieList) {

        this.movieList = movieList;
    }

    //Creating a new class called : My View Holder
    public class MyViewHolder extends RecyclerView.ViewHolder{

       public TextView title,genre,date;
// Initiliasing the views
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
        }
    }
}
