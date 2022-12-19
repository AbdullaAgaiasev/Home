package com.example.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView homeRecyclerView;
    private ArrayList<String> homeList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        HomeAdapter adapter = new HomeAdapter(homeList);
        homeRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        homeList.add("Home");
        homeList.add("Двух этажные");
        homeList.add("Небоскреб");
        homeList.add("Много этажные");
        homeList.add("Виллы");
        homeList.add("Коттеджи");
        homeList.add("Шалаш");
        homeList.add("Дом на колесах");
        homeList.add("Отели(⭐⭐⭐⭐⭐)");
        homeList.add("Отели(⭐⭐⭐⭐)");
        homeList.add("Отели(⭐⭐⭐)");
        homeList.add("Отели(⭐⭐)");
        homeList.add("Бревенчатые");
        homeList.add("Кирпичные");
        homeList.add("Капсульные");
    }
}