package com.tanloc2017.appmau;

public class color_name {
    int rm;
    int bm;
    int gm;
    String tenmau;

    public int getRm() {
        return rm;
    }

    public int getBm() {
        return bm;
    }

    public int getGm() {
        return gm;
    }

    public String getTenmau() {
        return tenmau;
    }

    public color_name(int rm, int bm, int gm, String tenmau) {
        this.rm = rm;
        this.bm = bm;
        this.gm = gm;

        this.tenmau = tenmau;
    }
}
