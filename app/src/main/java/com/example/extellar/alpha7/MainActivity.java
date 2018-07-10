package com.example.extellar.alpha7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Tamplate> posts = new ArrayList<>();
    private ViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ViewAdapter(posts, this);
        recyclerView.setAdapter(adapter);
        postsList();
        adapter.notifyDataSetChanged();

    }

    public void postsList(){
Tamplate t = new Tamplate(1,1,"r","f");
posts.add(t);
        Tamplate v = new Tamplate(1,1,"r","f");
        posts.add(v);

    }
}
