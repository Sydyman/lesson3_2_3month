package com.ex.lesson3_2_3month;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroViewHolder> {
    private ArrayList<String> heroesList;
    public HeroAdapter(ArrayList<String> heroesList){
     this.heroesList = heroesList;
    }
    @NonNull
    @Override
    public HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HeroViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hero,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HeroViewHolder holder, int position) {
        holder.onBind(heroesList.get(position));

    }

    @Override
    public int getItemCount() {
        return heroesList.size();
    }
}
