package com.xuexiang.xui.widget.popupwindow.status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Status {
    public static final Status COMPLETE;
    public static final Status CUSTOM;
    public static final Status ERROR;
    public static final Status LOADING;
    public static final Status NONE;

    /* renamed from: a */
    public static final /* synthetic */ Status[] f4627a;

    static {
        Status status = new Status("NONE", 0);
        NONE = status;
        Status status2 = new Status("LOADING", 1);
        LOADING = status2;
        Status status3 = new Status("ERROR", 2);
        ERROR = status3;
        Status status4 = new Status("COMPLETE", 3);
        COMPLETE = status4;
        Status status5 = new Status("CUSTOM", 4);
        CUSTOM = status5;
        f4627a = new Status[]{status, status2, status3, status4, status5};
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) f4627a.clone();
    }
}
