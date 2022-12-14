package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class quotes extends AppCompatActivity {
    RecyclerView recyclerView1;

    int i;
    List<ModelData> l1=new ArrayList();

    int position;
    int position1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
        getIntentData();
        initBinding();
        for(int i=0;i<15;i++)
        {
            ModelData m1=new ModelData();
        }
        initSetupData();
    }
    private void getIntentData() {
        position=getIntent().getIntExtra("txtquotes",0);
        position1=getIntent().getIntExtra("imgquotes",0);
    }
    private void initSetupData() {
        quoteAdapter adapter =new quoteAdapter(this,l1,position,position1);
        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView1.setLayoutManager(layoutManager);
        recyclerView1.setAdapter(adapter);
    }

    private void initBinding() {

        recyclerView1=findViewById(R.id.recyclerview1);
    }
}