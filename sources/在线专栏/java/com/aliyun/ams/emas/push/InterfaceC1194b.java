package com.aliyun.ams.emas.push;

import android.content.Context;
import com.aliyun.ams.emas.push.notification.CPushMessage;
import java.util.Map;

/* renamed from: com.aliyun.ams.emas.push.b */
/* loaded from: classes.dex */
public interface InterfaceC1194b {
    void onMessageArrived(Context context, CPushMessage cPushMessage);

    void onNotificationOpened(Context context, String str, String str2, String str3, int i4);

    void onNotificationReceivedWithoutShow(Context context, String str, String str2, Map<String, String> map, int i4, String str3, String str4);

    void onNotificationRemoved(Context context, String str, String str2, String str3, int i4, String str4);

    void onNotificationShow(Context context, String str, String str2, Map<String, String> map);
}
