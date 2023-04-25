package com.example.instagramhomefragmentrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeRvAdapter extends RecyclerView.Adapter{
    ArrayList<HomeRvModel> list;
    Context ctx;

    public HomeRvAdapter(Context ctx,ArrayList<HomeRvModel> list) {
        this.list = list;
        this.ctx = ctx;
    }

    @Override
    public int getItemViewType(int position) {
        HomeRvModel obj=list.get(position);
        switch (obj.getViewType()){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                View storyRvHolder = LayoutInflater.from(ctx).inflate(R.layout.homerv_item_story_rv, parent, false);
                return new storyRv(storyRvHolder);
            case 1:
                View post = LayoutInflater.from(ctx).inflate(R.layout.homerv_item_post, parent, false);
                return new postClass(post);
            default:
                return null;
        }
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        HomeRvModel obj=list.get(position);

        switch (obj.getViewType()){
            case 0:
                StoryRvAdapter adapter=new StoryRvAdapter(obj.getStoryRvItems());
                LinearLayoutManager lm= new LinearLayoutManager(ctx,LinearLayoutManager.HORIZONTAL,false);
                ((storyRv)holder).setAdapter(adapter);
                ((storyRv)holder).setLm(lm);

            case 1:
                if (holder instanceof postClass) {
                    ((postClass)holder).setText(obj.getPostName());
                    ((postClass)holder).setImage(obj.getPostImage());
                }

        }
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class storyRv extends RecyclerView.ViewHolder{
        RecyclerView storyRecV;
        public storyRv(@NonNull View itemView) {
            super(itemView);
            storyRecV=itemView.findViewById(R.id.storyRecyclerView);
        }

        public void setAdapter(StoryRvAdapter adapter) {
            storyRecV.setAdapter(adapter);
        }

        public void setLm(LinearLayoutManager lm) {
            storyRecV.setLayoutManager(lm);
        }
    }



    public class postClass extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;


        public postClass(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.postName);
            imageView=itemView.findViewById(R.id.postImage);

        }

        public void setImage(int image) {
            imageView.setImageResource(image);
        }

        public void setText(String text) {
            textView.setText(text);
        }
    }
}
