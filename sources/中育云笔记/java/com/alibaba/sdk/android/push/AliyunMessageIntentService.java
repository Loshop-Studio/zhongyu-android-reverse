package com.alibaba.sdk.android.push;

import android.app.Notification;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.push.notification.C5682d;
import com.alibaba.sdk.android.push.notification.C5683e;
import com.alibaba.sdk.android.push.notification.CPushMessage;
import com.alibaba.sdk.android.push.notification.NotificationConfigure;
import com.alibaba.sdk.android.push.notification.PushData;
import com.alibaba.sdk.android.push.p058a.C5645b;
import com.alibaba.sdk.android.push.util.C5689a;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import p038c0.AbstractServiceC5205a;

/* loaded from: classes3.dex */
public abstract class AliyunMessageIntentService extends AbstractServiceC5205a {
    private final C5682d mMessageNotification = new C5682d();

    @Override // p038c0.InterfaceC5209e
    public boolean checkNotificationShowInInnerGroup(Map<String, String> map) {
        boolean zM3603c = C5645b.m3595a().m3603c();
        if (zM3603c) {
            map.put(AgooConstants.MESSAGE_BODY_EMAS_GROUP, AgooConstants.ACCS_PUSH_GROUP);
        }
        return zM3603c;
    }

    public Notification customNotificationUI(Context context, PushData pushData) {
        return null;
    }

    @Override // p038c0.InterfaceC5209e
    public Notification customSummaryNotification(Context context, Map<String, String> map) throws NumberFormatException {
        PushData pushData = PushData.parse(context, map);
        NotificationConfigure notificationConfigureHookNotificationBuild = hookNotificationBuild();
        return this.mMessageNotification.m3811a(context, this.mMessageNotification.m3812a(context, map), pushData, notificationConfigureHookNotificationBuild);
    }

    public NotificationConfigure hookNotificationBuild() {
        return null;
    }

    public abstract void onMessage(Context context, CPushMessage cPushMessage);

    @Override // p038c0.InterfaceC5208d
    public void onMessageArrived(Context context, com.aliyun.ams.emas.push.notification.CPushMessage cPushMessage) {
        onMessage(context, CPushMessage.from(cPushMessage));
    }

    public abstract void onNotification(Context context, String str, String str2, Map<String, String> map);

    public abstract void onNotificationClickedWithNoAction(Context context, String str, String str2, String str3);

    public abstract void onNotificationOpened(Context context, String str, String str2, String str3);

    @Override // p038c0.InterfaceC5208d
    public void onNotificationOpened(Context context, String str, String str2, String str3, int i10) {
        if (i10 == 4) {
            onNotificationClickedWithNoAction(context, str, str2, str3);
        } else {
            onNotificationOpened(context, str, str2, str3);
        }
    }

    public abstract void onNotificationReceivedInApp(Context context, String str, String str2, Map<String, String> map, int i10, String str3, String str4);

    @Override // p038c0.InterfaceC5208d
    public void onNotificationReceivedWithoutShow(Context context, String str, String str2, Map<String, String> map, int i10, String str3, String str4) {
        onNotificationReceivedInApp(context, str, str2, map, i10, str3, str4);
    }

    public abstract void onNotificationRemoved(Context context, String str);

    @Override // p038c0.InterfaceC5208d
    public void onNotificationRemoved(Context context, String str, String str2, String str3, int i10, String str4) {
        onNotificationRemoved(context, str4);
    }

    @Override // p038c0.InterfaceC5208d
    public void onNotificationShow(Context context, String str, String str2, Map<String, String> map) {
        if (map != null && map.containsKey(AgooConstants.LOCAL_ALIYUN_NOTIFICATION_BADGE)) {
            String str3 = map.get(AgooConstants.LOCAL_ALIYUN_NOTIFICATION_BADGE);
            if (!TextUtils.isEmpty(str3)) {
                try {
                    C5689a.m3817a(context, Integer.parseInt(str3));
                } catch (Exception unused) {
                }
            }
        }
        onNotification(context, str, str2, map);
    }

    @Override // p038c0.InterfaceC5209e
    public boolean showNotificationNow(Context context, Map<String, String> map) {
        return C5682d.m3809a(map) || !C5683e.m3814a(context);
    }

    @Override // p038c0.InterfaceC5209e
    public Notification customNotificationUI(Context context, Map<String, String> map) throws NumberFormatException {
        PushData pushData = PushData.parse(context, map);
        NotificationConfigure notificationConfigureHookNotificationBuild = hookNotificationBuild();
        Notification notificationCustomNotificationUI = customNotificationUI(context, pushData);
        if (notificationCustomNotificationUI != null) {
            return notificationCustomNotificationUI;
        }
        return this.mMessageNotification.m3813b(getApplicationContext(), this.mMessageNotification.m3812a(getApplicationContext(), map), pushData, notificationConfigureHookNotificationBuild);
    }
}
