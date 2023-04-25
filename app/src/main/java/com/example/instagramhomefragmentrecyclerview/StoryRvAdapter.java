package com.example.instagramhomefragmentrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoryRvAdapter extends RecyclerView.Adapter<StoryRvAdapter.viewHolder>{
    ArrayList<StoryRvModel> list;

    public StoryRvAdapter(ArrayList<StoryRvModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View holder= LayoutInflater.from(parent.getContext()).inflate(R.layout.story_rv_item,parent,false);
        return new viewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        StoryRvModel obj=list.get(position);
        holder.storyImage.setImageResource(obj.getStoryImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView storyImage;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            storyImage=itemView.findViewById(R.id.storyImage);
        }
    }

}
