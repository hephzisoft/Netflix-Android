package com.hephzisoft.netflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MovieActivity extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        gridView = findViewById(R.id.grid);
        ArrayList<Movie> movieArrayList = new ArrayList<>();
        movieArrayList.add(new Movie(R.drawable.download));
        movieArrayList.add(new Movie(R.drawable.pics1));
        movieArrayList.add(new Movie(R.drawable.pics2));
        movieArrayList.add(new Movie(R.drawable.pics3));
        movieArrayList.add(new Movie(R.drawable.pics4));
        movieArrayList.add(new Movie(R.drawable.pics5));


    }
}



