package com.audacityit.finder.model;

/**
 * Created by tusharaits on 8/11/15.
 */

public class District {

    private String id;
    private String title;

    public District(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
