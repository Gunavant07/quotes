package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView, rcy;
    androidx.appcompat.widget.SearchView search1;
    TextView txtNotfound;
    List<ModelData> l1 = new ArrayList<>();
    List<ModelData> l2 = new ArrayList<>();
    List<ModelData> l3 = new ArrayList<>();

    int[] icon = {R.mipmap.balloons, R.mipmap.loneliness, R.mipmap.sad, R.mipmap.angry, R.mipmap.calendar, R.mipmap.wink,
            R.mipmap.swag2, R.mipmap.man, R.mipmap.rainbow, R.mipmap.best, R.mipmap.bycicle, R.mipmap.happybirthday,
            R.mipmap.divorce, R.mipmap.people, R.mipmap.busy, R.mipmap.fraudulent, R.mipmap.blocks, R.mipmap.gifted,
            R.mipmap.college, R.mipmap.cool, R.mipmap.idea, R.mipmap.cute, R.mipmap.dance, R.mipmap.emotions,
            R.mipmap.exam, R.mipmap.facebook, R.mipmap.home, R.mipmap.fathersday, R.mipmap.maternity, R.mipmap.smile,
            R.mipmap.restaurant, R.mipmap.forgiveness};
    String[] type = {"Love", "Alone", "Sad", "Angry", "Anniversary", "Attitude", "Awesome", "Beard", "Beautiful", "Best", "Bike", "Birthday", "Break up", "Brother",
            "Busy", "Cheat", "Childhood", "Clever", "College", "Cool", "Creative", "cute", "Dance", "Emotional", "Exam", "Facebook", "Family", "Father's Day", "Mothe's Day", "Flirt"
            , "Food", "Forgiveness"};
    String[] option = {"new", "today", "popular", "latest","for you"};

    RvAdapter rvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();
        initSearchData();
        for (int i = 0; i < option.length; i++) {
            ModelData m1 = new ModelData();
            m1.setOption(option[i]);
            l2.add(m1);

        }
        initSetData();

        for (int j = 0; j < type.length; j++) {
            ModelData m1 = new ModelData();
            m1.setType(type[j]);
            m1.setIcon(icon[j]);
            l1.add(m1);
        }
        initSetupData();

    }

    private void initBinding() {
        recyclerView = findViewById(R.id.recyclerview);
        rcy = findViewById(R.id.rcy);
        search1 = findViewById(R.id.search1);
        txtNotfound = findViewById(R.id.txtNotfound);
    }

    private void initSetData() {
        optionAdapter adapter = new optionAdapter(this, l2);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rcy.setLayoutManager(layoutManager1);
        rcy.setAdapter(adapter);
    }

    private void initSetupData() {
        rvAdapter = new RvAdapter(this, l1);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(rvAdapter);
    }

    private void initSearchData() {
        search1.setOnQueryTextListener(new androidx.appcompat.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                l3.clear();
                for(int i=0;i<l1.size();i++)
                {
                    if(l1.get(i).getType().toLowerCase().contains(newText.toLowerCase()))
                    {
                        l3.add(l1.get(i));
                    }
                }
                if(l3.size()==0)
                {
                    txtNotfound.setVisibility(View.VISIBLE);
                }
                else if (newText.isEmpty())
                {
                    txtNotfound.setVisibility(View.GONE);
                }
                else if (l3.size()>0)
                {
                    txtNotfound.setVisibility(View.GONE);
                }
                rvAdapter.filterlist(l3);

                return false;
            }
        });


    }
}