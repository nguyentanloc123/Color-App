package com.tanloc2017.appmau;

/* Credits:
 *    Atif Pervaiz
 * Websites:
 *    https://devofandroid.blogspot.com/
 *    https://atifsoftwares.blogspot.com/
 * Youtube:
 *    https://www.youtube.com/watch?v=_EIYM-wwObI&t=632s
 * Playstore:
 *    https://play.google.com/store/apps/dev?id=6868537621115215530*/

public class Model {
    String title;
    String desc;
    int icon;

    //constructor
    public Model(String title, String desc, int icon) {
        this.title = title;
        this.desc = desc;
        this.icon = icon;
    }

    //getters


    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getIcon() {
        return this.icon;
    }
}
