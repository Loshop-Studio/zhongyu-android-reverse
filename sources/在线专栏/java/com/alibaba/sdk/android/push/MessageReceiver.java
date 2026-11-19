package com.alibaba.sdk.android.push;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.sdk.android.push.notification.C1188d;
import com.alibaba.sdk.android.push.notification.C1189e;
import com.alibaba.sdk.android.push.notification.CPushMessage;
import com.alibaba.sdk.android.push.notification.NotificationConfigure;
import com.alibaba.sdk.android.push.notification.PushData;
import com.alibaba.sdk.android.push.p028a.C1154b;
import com.alibaba.sdk.android.push.util.C1190a;
import com.aliyun.ams.emas.push.AgooMessageReceiver;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes.dex */
public abstract class MessageReceiver extends AgooMessageReceiver {
    private final C1188d mMessageNotification = new C1188d();

    @Override // com.aliyun.ams.emas.push.InterfaceC1195c
    public boolean checkNotificationShowInInnerGroup(Map<String, String> map) {
        boolean zM5152c = C1154b.m5144a().m5152c();
        if (zM5152c) {
            map.put(AgooConstants.MESSAGE_BODY_EMAS_GROUP, AgooConstants.ACCS_PUSH_GROUP);
        }
        return zM5152c;
    }

    public Notification customNotificationUI(Context context, PushData pushData) {
        return null;
    }

    @Override // com.aliyun.ams.emas.push.InterfaceC1195c
    public Notification customNotificationUI(Context context, Map<String, String> map) throws NumberFormatException {
        PushData pushData = PushData.parse(context, map);
        NotificationConfigure notificationConfigureHookNotificationBuild = hookNotificationBuild();
        Notification notificationCustomNotificationUI = customNotificationUI(context, pushData);
        if (notificationCustomNotificationUI != null) {
            return notificationCustomNotificationUI;
        }
        return this.mMessageNotification.m5362b(context, this.mMessageNotification.m5361a(context, map), pushData, notificationConfigureHookNotificationBuild);
    }

    @Override // com.aliyun.ams.emas.push.InterfaceC1195c
    public Notification customSummaryNotification(Context context, Map<String, String> map) throws NumberFormatException {
        PushData pushData = PushData.parse(context, map);
        NotificationConfigure notificationConfigureHookNotificationBuild = hookNotificationBuild();
        return this.mMessageNotification.m5360a(context, this.mMessageNotification.m5361a(context, map), pushData, notificationConfigureHookNotificationBuild);
    }

    public NotificationConfigure hookNotificationBuild() {
        return null;
    }

    protected abstract void onMessage(Context context, CPushMessage cPushMessage);

    @Override // com.aliyun.ams.emas.push.InterfaceC1194b
    public void onMessageArrived(Context context, com.aliyun.ams.emas.push.notification.CPushMessage cPushMessage) {
        onMessage(context, CPushMessage.from(cPushMessage));
    }

    protected abstract void onNotification(Context context, String str, String str2, Map<String, String> map);

    protected abstract void onNotificationClickedWithNoAction(Context context, String str, String str2, String str3);

    protected abstract void onNotificationOpened(Context context, String str, String str2, String str3);

    @Override // com.aliyun.ams.emas.push.InterfaceC1194b
    public void onNotificationOpened(Context context, String str, String str2, String str3, int i4) {
        if (i4 == 4) {
            onNotificationClickedWithNoAction(context, str, str2, str3);
        } else {
            onNotificationOpened(context, str, str2, str3);
        }
    }

    protected abstract void onNotificationReceivedInApp(Context context, String str, String str2, Map<String, String> map, int i4, String str3, String str4);

    @Override // com.aliyun.ams.emas.push.InterfaceC1194b
    public void onNotificationReceivedWithoutShow(Context context, String str, String str2, Map<String, String> map, int i4, String str3, String str4) {
        onNotificationReceivedInApp(context, str, str2, map, i4, str3, str4);
    }

    protected abstract void onNotificationRemoved(Context context, String str);

    @Override // com.aliyun.ams.emas.push.InterfaceC1194b
    public void onNotificationRemoved(Context context, String str, String str2, String str3, int i4, String str4) {
        onNotificationRemoved(context, str4);
    }

    @Override // com.aliyun.ams.emas.push.InterfaceC1194b
    public void onNotificationShow(Context context, String str, String str2, Map<String, String> map) {
        if (map != null && map.containsKey(AgooConstants.LOCAL_ALIYUN_NOTIFICATION_BADGE)) {
            String str3 = map.get(AgooConstants.LOCAL_ALIYUN_NOTIFICATION_BADGE);
            if (!TextUtils.isEmpty(str3)) {
                try {
                    C1190a.m5365a(context, Integer.parseInt(str3));
                } catch (Exception unused) {
                }
            }
        }
        onNotification(context, str, str2, map);
    }

    @Override // com.aliyun.ams.emas.push.AgooMessageReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    @Override // com.aliyun.ams.emas.push.InterfaceC1195c
    public boolean showNotificationNow(Context context, Map<String, String> map) {
        return C1188d.m5358a(map) || !C1189e.m5363a(context);
    }
}
