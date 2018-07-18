package com.example.hbacak07.tarihiyerler;

/**
 * Created by Hasan on 11.8.2017.
 */

public class TYer {
    String isim;
    String x;
    String y;
    String mesafe;
    String sure;

    public TYer(String isim, String x, String y, String mesafe, String sure) {
        this.isim = isim;
        this.x = x;
        this.y = y;
        this.mesafe = mesafe;
        this.sure = sure;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getMesafe() {
        return mesafe;
    }

    public void setMesafe(String mesafe) {
        this.mesafe = mesafe;
    }

    public String getSure() {
        return sure;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }
}
