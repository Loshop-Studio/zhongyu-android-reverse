package com.alibaba.sdk.android.push.notification;

/* loaded from: classes.dex */
public class AdvancedCustomPushNotification extends BasicCustomPushNotification {
    private final int mContentView;
    private int mIcon = 0;
    private final int mIconView;
    private final int mNotificationView;
    private final int mTitleView;

    public AdvancedCustomPushNotification(int i4, int i5, int i6, int i7) {
        this.notificationType = 3;
        this.mNotificationView = i4;
        this.mTitleView = i6;
        this.mIconView = i5;
        this.mContentView = i7;
    }

    public int getContentView() {
        return this.mContentView;
    }

    public int getIcon() {
        return this.mIcon;
    }

    public int getIconView() {
        return this.mIconView;
    }

    public int getNotificationView() {
        return this.mNotificationView;
    }

    public int getTitleView() {
        return this.mTitleView;
    }

    public void setIcon(int i4) {
        this.mIcon = i4;
    }

    @Override // com.alibaba.sdk.android.push.notification.BasicCustomPushNotification
    public String toString() {
        return super.toString() + ", notificationView:" + this.mNotificationView + ", titleView:" + this.mTitleView + ", iconView:" + this.mTitleView + ", contentView:" + this.mContentView;
    }
}
