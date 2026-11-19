package com.alibaba.sdk.android.push.notification;

import android.R;
import java.io.Serializable;

/* loaded from: classes.dex */
public class BasicCustomPushNotification implements Serializable {
    public static final String CUSTOM_NOTIFICATION_TAG = "custom_notification_";
    public static final int NOTIFICATION_TYPE_CUSTOM_ADVANCED = 3;
    public static final int NOTIFICATION_TYPE_CUSTOM_BASIC = 2;
    public static final int NOTIFICATION_TYPE_DEFAULT = 1;
    public static final int REMIND_TYPE_SILENT = 0;
    public static final int REMIND_TYPE_SOUND = 2;
    public static final int REMIND_TYPE_VIBRATE = 1;
    public static final int REMIND_TYPE_VIBRATE_AND_SOUND = 3;
    protected boolean buildWhenAppInForeground;
    protected int notificationFlags;
    protected int notificationType;
    protected int remindType;
    protected boolean serverOptionFirst;
    protected int statusBarDrawable;

    public BasicCustomPushNotification() {
        this.buildWhenAppInForeground = true;
        this.statusBarDrawable = R.drawable.stat_notify_chat;
        this.remindType = 3;
        this.notificationFlags = 16;
        this.serverOptionFirst = false;
        this.notificationType = 2;
    }

    public BasicCustomPushNotification(int i4, int i5, int i6) {
        this.buildWhenAppInForeground = true;
        this.serverOptionFirst = false;
        this.notificationType = 2;
        this.statusBarDrawable = i4;
        this.remindType = i6;
        this.notificationFlags = i5;
    }

    public int getNotificationFlags() {
        return this.notificationFlags;
    }

    public int getNotificationType() {
        return this.notificationType;
    }

    public int getRemindType() {
        return this.remindType;
    }

    public int getStatusBarDrawable() {
        return this.statusBarDrawable;
    }

    public boolean isBuildWhenAppInForeground() {
        return this.buildWhenAppInForeground;
    }

    public boolean isServerOptionFirst() {
        return this.serverOptionFirst;
    }

    public void setBuildWhenAppInForeground(boolean z3) {
        this.buildWhenAppInForeground = z3;
    }

    public void setNotificationFlags(int i4) {
        this.notificationFlags = i4;
    }

    public void setRemindType(int i4) {
        if (i4 == 0 || 1 == i4 || 2 == i4 || 3 == i4) {
            this.remindType = i4;
        }
    }

    public void setServerOptionFirst(boolean z3) {
        this.serverOptionFirst = z3;
    }

    public void setStatusBarDrawable(int i4) {
        this.statusBarDrawable = i4;
    }

    public String toString() {
        return "type:" + this.notificationType + ", statusBarDrawable:" + this.statusBarDrawable + ", remindType:" + this.remindType + ", flags:" + this.notificationFlags + ", serverOptionFirst:" + this.serverOptionFirst + ", buildWhenAppInForeground:" + isBuildWhenAppInForeground();
    }
}
