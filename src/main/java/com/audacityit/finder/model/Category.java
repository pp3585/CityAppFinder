package com.audacityit.finder.model;

/**
 * Created by tusharaits on 6/24/15.
 */

public class Category {

    private String id;
    private String title;
    private int weight;
    private String iconUrl;
    private String imageUrl;
    private String colorCode;
    private String colorCodeRGB;

    public Category() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCodeRGB() {
        return colorCodeRGB;
    }

    public void setColorCodeRGB(String colorCodeRGB) {
        this.colorCodeRGB = colorCodeRGB;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
