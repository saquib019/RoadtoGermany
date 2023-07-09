package com.studyabroad.roadtogermany.pojo;

public class CityItems {

    private String cityName,cityDescription,cityImage,cityWikiLink;

    public CityItems(String cityName, String cityDescription, String cityImage, String cityWikiLink) {
        this.cityName = cityName;
        this.cityDescription = cityDescription;
        this.cityImage = cityImage;
        this.cityWikiLink = cityWikiLink;
    }

    public CityItems(){}

    public String getCityName() {
        return cityName;
    }

    public String getCityDescription() {
        return cityDescription;
    }

    public String getCityImage() {
        return cityImage;
    }
    public String getCityWikiLink()  {
        return cityWikiLink;
    }
}
