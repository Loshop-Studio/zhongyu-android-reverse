package com.xuexiang.xui.widget.textview.marqueen;

import android.text.TextUtils;
import java.util.Date;

/* loaded from: classes.dex */
public class DisplayEntity {
    private static final String TIME_PLACE_HOLDER = "$";
    private int mEffectiveInternal;
    private String mID;
    private final String mMessage;
    private long mTime;

    public DisplayEntity(String str) {
        this.mMessage = str;
    }

    private String updateMessage() {
        if (!isValid() || this.mTime == 0 || !this.mMessage.contains(TIME_PLACE_HOLDER)) {
            return this.mMessage;
        }
        return this.mMessage.replace(TIME_PLACE_HOLDER, String.valueOf(calculateNumberOfMinutes(this.mTime)));
    }

    public int calculateNumberOfMinutes(long j4) {
        return (int) ((getCurrentDate().getTime() - j4) / 60000);
    }

    public Date getCurrentDate() {
        return new Date(System.currentTimeMillis());
    }

    public int getEffectiveInternal() {
        return this.mEffectiveInternal;
    }

    public String getID() {
        return this.mID;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public long getTime() {
        return this.mTime;
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.mMessage);
    }

    public DisplayEntity setEffectiveInternal(int i4) {
        this.mEffectiveInternal = i4;
        return this;
    }

    public DisplayEntity setID(String str) {
        this.mID = str;
        return this;
    }

    public DisplayEntity setTime(long j4) {
        this.mTime = j4;
        return this;
    }

    public String toString() {
        return updateMessage();
    }

    public DisplayEntity(String str, String str2, long j4, int i4) {
        this.mID = str;
        this.mMessage = str2;
        this.mTime = j4;
        this.mEffectiveInternal = i4;
    }
}
