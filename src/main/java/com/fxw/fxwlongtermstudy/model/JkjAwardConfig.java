package com.fxw.fxwlongtermstudy.model;

public class JkjAwardConfig {

    private String day;
    /** 顶部文案*/
    private String top;
    /** 底部图片*/
    private String bottom;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        return "JkjAwardConfig{" +
                "day='" + day + '\'' +
                ", top='" + top + '\'' +
                ", bottom='" + bottom + '\'' +
                '}';
    }

}
