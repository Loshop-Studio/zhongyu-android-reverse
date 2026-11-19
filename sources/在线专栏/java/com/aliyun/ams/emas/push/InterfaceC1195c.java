package com.aliyun.ams.emas.push;

import android.app.Notification;
import android.content.Context;
import java.util.Map;

/* renamed from: com.aliyun.ams.emas.push.c */
/* loaded from: classes.dex */
public interface InterfaceC1195c {
    boolean checkNotificationShowInInnerGroup(Map<String, String> map);

    Notification customNotificationUI(Context context, Map<String, String> map);

    Notification customSummaryNotification(Context context, Map<String, String> map);

    boolean showNotificationNow(Context context, Map<String, String> map);
}
