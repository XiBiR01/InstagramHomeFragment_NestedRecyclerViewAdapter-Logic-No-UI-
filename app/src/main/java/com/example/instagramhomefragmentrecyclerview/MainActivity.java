package com.example.instagramhomefragmentrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ArrayList<HomeRvModel> homeRvModels=new ArrayList<>();
        ArrayList<StoryRvModel> storyRvModels=new ArrayList<>();
        populateData(storyRvModels,homeRvModels);


    }

    private void populateData(ArrayList<StoryRvModel> storyRvModels,ArrayList<HomeRvModel> homeRvModels) {
        storyRvModels.add(new StoryRvModel(R.drawable.pixels));
        storyRvModels.add(new StoryRvModel(R.drawable.plus));
        storyRvModels.add(new StoryRvModel(R.drawable.user));
        storyRvModels.add(new StoryRvModel(R.drawable.video));
        storyRvModels.add(new StoryRvModel(R.drawable.pixels));
        storyRvModels.add(new StoryRvModel(R.drawable.pixels));
        storyRvModels.add(new StoryRvModel(R.drawable.pixels));


        homeRvModels.add(new HomeRvModel(0,storyRvModels,""));
        homeRvModels.add(new HomeRvModel(1,"one",R.drawable.plus));
        homeRvModels.add(new HomeRvModel(1,"Two",R.drawable.plus));
        homeRvModels.add(new HomeRvModel(1,"Three",R.drawable.plus));
        homeRvModels.add(new HomeRvModel(1,"Four",R.drawable.plus));
        homeRvModels.add(new HomeRvModel(1,"Five",R.drawable.plus));
        homeRvModels.add(new HomeRvModel(1,"Six",R.drawable.plus));
        RecyclerView homeRecyclerView=findViewById(R.id.homeRecyclerView);


        HomeRvAdapter adapter=new HomeRvAdapter(getApplicationContext(),homeRvModels);
        StoryRvAdapter adapter1=new StoryRvAdapter(storyRvModels);

        homeRecyclerView.setAdapter(adapter);


        homeRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}