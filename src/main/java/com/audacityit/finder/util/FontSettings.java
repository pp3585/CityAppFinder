package com.audacityit.finder.util;


import android.content.Context;
import android.graphics.Typeface;


public class FontSettings {
    public static Typeface typeFace = null;
    public Context context;

    public FontSettings(Context context) {
        this.context = context;
    }

    public Typeface getThinFontSettings() {
        typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/roboto_medium.ttf");
        return typeFace;
    }

}
