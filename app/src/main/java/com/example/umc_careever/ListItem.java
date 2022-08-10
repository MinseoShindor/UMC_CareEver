package com.example.umc_careever;

public class ListItem {

    private String Group;
    private String Title;

    public String getGroup() {
        return Group;
    }

    public String getTitle() {
        return Title;
    }


    public void setGroup(String group) {
        this.Group = group;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public ListItem(String group, String title) {
        this.Group = group;
        this.Title = title;
    }

}
