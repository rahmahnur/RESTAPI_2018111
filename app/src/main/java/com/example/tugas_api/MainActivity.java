package com.example.tugas_api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.tugas_api.adapter.SportAdapter;
import com.example.tugas_api.model.SportList;
import com.example.tugas_api.viewmodel.SportViewModel;

public class MainActivity extends AppCompatActivity {
    RecyclerView recylerView;
    SportAdapter adapter;
    SportViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recylerView.setLayoutManager(linearLayoutManager);
        viewModel = new SportViewModel();
        viewModel.getSport().observe(this, new Observer<SportList>() {
            @Override
            public void onChanged(SportList sportList) {
                if (sportList.getSports() != null) {
                    adapter = new SportAdapter(MainActivity.this, sportList.getSports());
                    adapter.notifyDataSetChanged();
                    recylerView.setAdapter(adapter);
                } else {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}