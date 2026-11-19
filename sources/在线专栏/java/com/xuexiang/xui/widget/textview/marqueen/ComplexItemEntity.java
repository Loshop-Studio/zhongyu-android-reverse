package com.xuexiang.xui.widget.textview.marqueen;

/* loaded from: classes.dex */
public class ComplexItemEntity {
    private String subTitle;
    private String time;
    private String title;

    public ComplexItemEntity(String str, String str2, String str3) {
        this.title = str;
        this.subTitle = str2;
        this.time = str3;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTime() {
        return this.time;
    }

    public String getTitle() {
        return this.title;
    }

    public ComplexItemEntity setSubTitle(String str) {
        this.subTitle = str;
        return this;
    }

    public ComplexItemEntity setTime(String str) {
        this.time = str;
        return this;
    }

    public ComplexItemEntity setTitle(String str) {
        this.title = str;
        return this;
    }

    public String toString() {
        return "主标题:" + this.title + ", 副标题:" + this.subTitle + ", 时间:" + this.time;
    }
}
