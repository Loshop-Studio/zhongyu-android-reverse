package com.alibaba.sdk.android.push.notification;

import android.app.Notification;
import androidx.core.app.C0326g;

/* loaded from: classes.dex */
public interface NotificationConfigure {
    void configBuilder(Notification.Builder builder, PushData pushData);

    void configBuilder(C0326g c0326g, PushData pushData);

    void configNotification(Notification notification, PushData pushData);
}
