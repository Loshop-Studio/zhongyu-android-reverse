package com.aliyun.ams.emas.push;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.aliyun.ams.emas.push.notification.CPushMessage;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.JsonUtility;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.json.JSONException;
import org.json.JSONObject;
import p110k1.C2707a;
import p115l1.C2834a;
import p115l1.C2835b;

/* renamed from: com.aliyun.ams.emas.push.f */
/* loaded from: classes.dex */
class C1198f {
    /* renamed from: a */
    public static void m5378a(Context context, Intent intent, InterfaceC1194b interfaceC1194b) {
        try {
            String stringExtra = intent.getStringExtra(AgooMessageReceiver.MESSAGE_ID);
            String stringExtra2 = intent.getStringExtra("title");
            String stringExtra3 = intent.getStringExtra(AgooMessageReceiver.SUMMARY);
            String stringExtra4 = intent.getStringExtra(AgooMessageReceiver.EXTRA_MAP);
            String stringExtra5 = intent.getStringExtra(AgooMessageReceiver.NOTIFICATION_GROUP);
            int intExtra = intent.getIntExtra(AgooMessageReceiver.NOTIFICATION_OPEN_TYPE, 1);
            C1204l.f6942a.mo5083d("notification opened " + stringExtra);
            if (!TextUtils.isEmpty(stringExtra5)) {
                C2707a.m9029a().m9033d(stringExtra5);
            }
            interfaceC1194b.onNotificationOpened(context, stringExtra2, stringExtra3, stringExtra4, intExtra);
        } catch (Throwable th) {
            ALog.m6091e("AgooPushHandler", "Handle notification open action failed.", th, new Object[0]);
        }
    }

    /* renamed from: b */
    public static void m5379b(Context context, Intent intent, InterfaceC1195c interfaceC1195c, InterfaceC1194b interfaceC1194b) throws JSONException {
        try {
            String stringExtra = intent.getStringExtra("id");
            if (TextUtils.isEmpty(stringExtra)) {
                ALog.m6092e("AgooPushHandler", "handle message Null messageId!", new Object[0]);
                return;
            }
            String stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
            String stringExtra3 = intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID);
            String stringExtra4 = intent.getStringExtra(AgooConstants.MESSAGE_EXT);
            String stringExtra5 = intent.getStringExtra(AgooConstants.MESSAGE_SOURCE);
            if (TextUtils.isEmpty(stringExtra2)) {
                ALog.m6092e("AgooPushHandler", "handle message json body is Empty!", new Object[0]);
                return;
            }
            Map<String, String> map = null;
            try {
                map = JsonUtility.toMap(new JSONObject(stringExtra2));
            } catch (JSONException e4) {
                ALog.m6091e("AgooPushHandler", "Parse json error:", e4, new Object[0]);
            }
            try {
                int i4 = Integer.parseInt(map.get("type"));
                C1204l.f6942a.mo5083d("handle message, messageId:" + stringExtra + ", type:" + i4 + ", msg receive:" + stringExtra2);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    C1204l.f6942a.mo5083d(entry.getKey() + " --> " + entry.getValue());
                }
                String str = map.get("msg_id");
                map.put(AgooConstants.MESSAGE_TASK_ID, stringExtra3);
                map.put(AgooConstants.MESSAGE_EXT, stringExtra4);
                map.put(AgooConstants.MESSAGE_SOURCE, stringExtra5);
                map.put(AgooConstants.MESSAGE_BODY_MSG_ID_ALIYUN_FLAG, str);
                if (C1204l.m5398j()) {
                    C1204l.f6942a.mo5083d("Push received in DoNotDisturb time window, ignored.");
                } else {
                    m5380c(context, interfaceC1195c, interfaceC1194b, stringExtra, map, i4);
                }
            } catch (Throwable th) {
                ALog.m6091e("AgooPushHandler", "Wrong message Type Define!", th, new Object[0]);
            }
        } catch (Throwable th2) {
            ALog.m6091e("AgooPushHandler", "onHandleCallException", th2, new Object[0]);
        }
    }

    /* renamed from: c */
    private static void m5380c(Context context, InterfaceC1195c interfaceC1195c, InterfaceC1194b interfaceC1194b, String str, Map<String, String> map, int i4) {
        C2835b c2835b = new C2835b();
        if (i4 != 1) {
            if (i4 != 2) {
                ALog.m6092e("AgooPushHandler", "Wrong message Type Define!", new Object[0]);
                return;
            }
            try {
                CPushMessage cPushMessageM9515c = c2835b.m9515c(map, Config.m10016b(context), str);
                if (cPushMessageM9515c != null) {
                    C1204l.m5392d(context, cPushMessageM9515c.m5403c(), i4);
                    try {
                        ALog.m6093i("AgooPushHandler", "messageId=" + cPushMessageM9515c.m5403c() + ";appId=" + cPushMessageM9515c.m5401a() + ";messageType=msg", null, 1);
                    } catch (Throwable th) {
                        ALog.m6091e("AgooPushHandler", "ut log error", th, new Object[0]);
                    }
                    interfaceC1194b.onMessageArrived(context, cPushMessageM9515c);
                    return;
                }
                return;
            } catch (Throwable th2) {
                ALog.m6091e("AgooPushHandler", "Custom message parse error:", th2, new Object[0]);
                return;
            }
        }
        try {
            String strM10016b = Config.m10016b(context);
            C2834a c2834aM9517e = c2835b.m9517e(map, strM10016b, str);
            if (c2834aM9517e == null) {
                ALog.m6092e("AgooPushHandler", "Notify title is null or server push data Error appId =  " + strM10016b, new Object[0]);
                return;
            }
            C1204l.m5392d(context, c2834aM9517e.m9500n(), i4);
            if (!interfaceC1195c.showNotificationNow(context, map)) {
                C1204l.f6942a.mo5088i("do not build notification as user request");
                interfaceC1194b.onNotificationReceivedWithoutShow(context, c2834aM9517e.m9491e(), c2834aM9517e.m9494h(), c2834aM9517e.m9498l(), c2834aM9517e.m9487a(), c2834aM9517e.m9504r(), c2834aM9517e.m9496j());
            } else {
                String strM9485F = c2834aM9517e.m9485F();
                if (!TextUtils.isEmpty(strM9485F)) {
                    C2707a.m9029a().m9034e(strM9485F, c2834aM9517e);
                }
                m5381d(context, interfaceC1195c, map, new C1201i(map, c2834aM9517e, c2835b, context, interfaceC1194b));
            }
        } catch (Throwable th3) {
            ALog.m6091e("AgooPushHandler", "Notify message error:", th3, new Object[0]);
        }
    }

    /* renamed from: d */
    private static void m5381d(Context context, InterfaceC1195c interfaceC1195c, Map<String, String> map, InterfaceC1203k interfaceC1203k) {
        String str = map.get("image");
        String str2 = map.get("big_picture");
        String str3 = map.get(AgooConstants.MESSAGE_BODY_GROUP);
        boolean zCheckNotificationShowInInnerGroup = interfaceC1195c.checkNotificationShowInInnerGroup(map);
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            interfaceC1203k.mo5383a(interfaceC1195c.customNotificationUI(context, map), (!TextUtils.isEmpty(str3) || zCheckNotificationShowInInnerGroup) ? interfaceC1195c.customSummaryNotification(context, map) : null);
        } else {
            ThreadPoolExecutorFactory.execute(new RunnableC1199g(interfaceC1195c, context, map, str3, zCheckNotificationShowInInnerGroup, Looper.myLooper() != null ? new Handler(Looper.myLooper()) : null, interfaceC1203k));
        }
    }

    /* renamed from: e */
    public static void m5382e(Context context, Intent intent, InterfaceC1194b interfaceC1194b) {
        try {
            String stringExtra = intent.getStringExtra(AgooMessageReceiver.MESSAGE_ID);
            String stringExtra2 = intent.getStringExtra("title");
            String stringExtra3 = intent.getStringExtra(AgooMessageReceiver.SUMMARY);
            String stringExtra4 = intent.getStringExtra(AgooMessageReceiver.EXTRA_MAP);
            int intExtra = intent.getIntExtra(AgooMessageReceiver.NOTIFICATION_OPEN_TYPE, 1);
            String stringExtra5 = intent.getStringExtra(AgooMessageReceiver.NOTIFICATION_GROUP);
            C1204l.f6942a.mo5083d("notification deleted " + stringExtra);
            if (!TextUtils.isEmpty(stringExtra5)) {
                C2707a.m9029a().m9033d(stringExtra5);
            }
            interfaceC1194b.onNotificationRemoved(context, stringExtra2, stringExtra3, stringExtra4, intExtra, stringExtra);
        } catch (Throwable th) {
            ALog.m6091e("AgooPushHandler", "Handle notification delete action failed.", th, new Object[0]);
        }
    }
}
