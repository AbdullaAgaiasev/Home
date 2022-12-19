package com.example.home;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeViewHolder extends RecyclerView.ViewHolder {

    private TextView tvHome;

    public HomeViewHolder(@NonNull View itemView) {
        super(itemView);
        tvHome = itemView.findViewById(R.id.tv_home);
    }

    public void bind(String home){
        tvHome.setText(home);
    }
}
