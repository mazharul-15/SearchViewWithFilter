package com.example.searchviewwithfilter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    ListView listView;

    String[] data = {"Google", "Moogle", "Foogle", "Microsoft", "Nicrosoft", "Apple", "Mapple", "Cro",
                     "Netflix", "Metflix", "Fiflix", "Onflix", "Snapchat", "Rapchat", "Kapple", "Fro",
                     "Professor", "Wood", "Good", "Nood", "Mood", "Google", "Foogle", "Google"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = (SearchView) findViewById(R.id.search_view);
        listView = (ListView) findViewById(R.id.list_view);

        SearchAdapter searchAdapter = new SearchAdapter(this, data);
        listView.setAdapter(searchAdapter);


    }
}