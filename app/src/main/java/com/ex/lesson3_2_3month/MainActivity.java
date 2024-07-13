package com.ex.lesson3_2_3month;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> heroesList = new ArrayList<>();
    private RecyclerView  rvHeroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rvHeroes = findViewById(R.id.rv_heroes);
        heroesList.add("Kotl");
        heroesList.add("Slardar");
        heroesList.add("Phantom");
        heroesList.add("Babka");
        heroesList.add("Clock");
        heroesList.add("Shaker");
        heroesList.add("Lancer");
        heroesList.add("Evo");
        heroesList.add("Troll");
        heroesList.add("PA");
        heroesList.add("Invoker");
        heroesList.add("AntiMage");
        heroesList.add("Blind");
        heroesList.add("Thunder");
        heroesList.add("Marquez");

        HeroAdapter adapter = new HeroAdapter(heroesList);
        rvHeroes.setAdapter(adapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}