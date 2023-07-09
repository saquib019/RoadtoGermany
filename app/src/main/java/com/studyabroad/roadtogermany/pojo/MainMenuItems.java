package com.studyabroad.roadtogermany.pojo;

public class MainMenuItems {

    private String item;
    private String definition;

    public MainMenuItems(String item, String definition) {

        this.item = item;
        this.definition = definition;
    }

    public MainMenuItems() {
        //constructor
    }

    public String getItem() {
        return item;
    }
    public  String getDefinition() {

        return definition;
    }


}