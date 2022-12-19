package com.example.home;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeViewHolder> {

    private ArrayList<String> homeList;

    public HomeAdapter(ArrayList<String> homeList) {
        this.homeList = homeList;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder viewHolder, int position) {
        viewHolder.bind(homeList.get(position));

    }

    @Override
    public int getItemCount() {
        return homeList.size();
    }
}
