package com.example.instagramhomefragmentrecyclerview;

import java.util.ArrayList;

public class HomeRvModel {
    int viewType;
    String postName;
    int postImage;
    ArrayList<StoryRvModel> storyRvItems;

    public HomeRvModel(int viewType, String postName, int postImage) {
        this.viewType = viewType;
        this.postName = postName;
        this.postImage = postImage;
    }

    public HomeRvModel(int viewType, ArrayList<StoryRvModel> storyRvItems, String leaveBlank) {
        this.viewType = viewType;
        this.storyRvItems = storyRvItems;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public int getPostImage() {
        return postImage;
    }

    public void setPostImage(int postImage) {
        this.postImage = postImage;
    }

    public ArrayList<StoryRvModel> getStoryRvItems() {
        return storyRvItems;
    }

    public void setStoryRvItems(ArrayList<StoryRvModel> storyRvItems) {
        this.storyRvItems = storyRvItems;
    }
}
