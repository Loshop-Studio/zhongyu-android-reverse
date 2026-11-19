package p038c0;

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
import p108d0.C8899a;
import p124e0.C9061a;
import p124e0.C9062b;

/* renamed from: c0.h */
/* loaded from: classes3.dex */
public abstract class AbstractC5212h {
    /* renamed from: a */
    public static void m2773a(Context context, Intent intent, InterfaceC5208d interfaceC5208d) {
        try {
            String stringExtra = intent.getStringExtra(AbstractC5206b.MESSAGE_ID);
            String stringExtra2 = intent.getStringExtra("title");
            String stringExtra3 = intent.getStringExtra(AbstractC5206b.SUMMARY);
            String stringExtra4 = intent.getStringExtra(AbstractC5206b.EXTRA_MAP);
            String stringExtra5 = intent.getStringExtra(AbstractC5206b.NOTIFICATION_GROUP);
            int intExtra = intent.getIntExtra(AbstractC5206b.NOTIFICATION_OPEN_TYPE, 1);
            AbstractC5218n.f3101a.mo3533d("notification opened " + stringExtra);
            if (!TextUtils.isEmpty(stringExtra5)) {
                C8899a.m17429a().m17432d(stringExtra5);
            }
            interfaceC5208d.onNotificationOpened(context, stringExtra2, stringExtra3, stringExtra4, intExtra);
        } catch (Throwable th) {
            ALog.m10117e("AgooPushHandler", "Handle notification open action failed.", th, new Object[0]);
        }
    }

    /* renamed from: b */
    public static void m2774b(Context context, Intent intent, InterfaceC5209e interfaceC5209e, InterfaceC5208d interfaceC5208d) {
        Map<String, String> map;
        try {
            String stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_ID);
            if (TextUtils.isEmpty(stringExtra)) {
                ALog.m10118e("AgooPushHandler", "handle message Null messageId!", new Object[0]);
                return;
            }
            String stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
            String stringExtra3 = intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID);
            String stringExtra4 = intent.getStringExtra(AgooConstants.MESSAGE_EXT);
            String stringExtra5 = intent.getStringExtra(AgooConstants.MESSAGE_SOURCE);
            if (TextUtils.isEmpty(stringExtra2)) {
                ALog.m10118e("AgooPushHandler", "handle message json body is Empty!", new Object[0]);
                return;
            }
            try {
                map = JsonUtility.toMap(new JSONObject(stringExtra2));
            } catch (JSONException e10) {
                ALog.m10117e("AgooPushHandler", "Parse json error:", e10, new Object[0]);
                map = null;
            }
            Map<String, String> map2 = map;
            try {
                int i10 = Integer.parseInt(map2.get("type"));
                AbstractC5218n.f3101a.mo3533d("handle message, messageId:" + stringExtra + ", type:" + i10 + ", msg receive:" + stringExtra2);
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    AbstractC5218n.f3101a.mo3533d(entry.getKey() + " --> " + entry.getValue());
                }
                String str = map2.get("msg_id");
                map2.put(AgooConstants.MESSAGE_TASK_ID, stringExtra3);
                map2.put(AgooConstants.MESSAGE_EXT, stringExtra4);
                map2.put(AgooConstants.MESSAGE_SOURCE, stringExtra5);
                map2.put(AgooConstants.MESSAGE_BODY_MSG_ID_ALIYUN_FLAG, str);
                if (AbstractC5218n.m2793j()) {
                    AbstractC5218n.f3101a.mo3533d("Push received in DoNotDisturb time window, ignored.");
                } else {
                    m2775c(context, interfaceC5209e, interfaceC5208d, stringExtra, map2, i10);
                }
            } catch (Throwable th) {
                ALog.m10117e("AgooPushHandler", "Wrong message Type Define!", th, new Object[0]);
            }
        } catch (Throwable th2) {
            ALog.m10117e("AgooPushHandler", "onHandleCallException", th2, new Object[0]);
        }
    }

    /* renamed from: c */
    public static void m2775c(Context context, InterfaceC5209e interfaceC5209e, InterfaceC5208d interfaceC5208d, String str, Map map, int i10) {
        C9062b c9062b = new C9062b();
        if (i10 != 1) {
            if (i10 != 2) {
                ALog.m10118e("AgooPushHandler", "Wrong message Type Define!", new Object[0]);
                return;
            }
            try {
                CPushMessage cPushMessageM17832c = c9062b.m17832c(map, Config.m22234b(context), str);
                if (cPushMessageM17832c != null) {
                    AbstractC5218n.m2787d(context, cPushMessageM17832c.m3877c(), i10);
                    try {
                        ALog.m10119i("AgooPushHandler", "messageId=" + cPushMessageM17832c.m3877c() + ";appId=" + cPushMessageM17832c.m3875a() + ";messageType=msg", null, 1);
                    } catch (Throwable th) {
                        ALog.m10117e("AgooPushHandler", "ut log error", th, new Object[0]);
                    }
                    interfaceC5208d.onMessageArrived(context, cPushMessageM17832c);
                    return;
                }
                return;
            } catch (Throwable th2) {
                ALog.m10117e("AgooPushHandler", "Custom message parse error:", th2, new Object[0]);
                return;
            }
        }
        try {
            String strM22234b = Config.m22234b(context);
            C9061a c9061aM17834e = c9062b.m17834e(map, strM22234b, str);
            if (c9061aM17834e == null) {
                ALog.m10118e("AgooPushHandler", "Notify title is null or server push data Error appId =  " + strM22234b, new Object[0]);
                return;
            }
            AbstractC5218n.m2787d(context, c9061aM17834e.m17817n(), i10);
            if (!interfaceC5209e.showNotificationNow(context, map)) {
                AbstractC5218n.f3101a.mo3538i("do not build notification as user request");
                interfaceC5208d.onNotificationReceivedWithoutShow(context, c9061aM17834e.m17808e(), c9061aM17834e.m17811h(), c9061aM17834e.m17815l(), c9061aM17834e.m17804a(), c9061aM17834e.m17821r(), c9061aM17834e.m17813j());
            } else {
                String strM17802F = c9061aM17834e.m17802F();
                if (!TextUtils.isEmpty(strM17802F)) {
                    C8899a.m17429a().m17433e(strM17802F, c9061aM17834e);
                }
                m2776d(context, interfaceC5209e, map, new C5215k(map, c9061aM17834e, c9062b, context, interfaceC5208d));
            }
        } catch (Throwable th3) {
            ALog.m10117e("AgooPushHandler", "Notify message error:", th3, new Object[0]);
        }
    }

    /* renamed from: d */
    public static void m2776d(Context context, InterfaceC5209e interfaceC5209e, Map map, InterfaceC5217m interfaceC5217m) {
        String str = (String) map.get("image");
        String str2 = (String) map.get("big_picture");
        String str3 = (String) map.get(AgooConstants.MESSAGE_BODY_GROUP);
        boolean zCheckNotificationShowInInnerGroup = interfaceC5209e.checkNotificationShowInInnerGroup(map);
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            interfaceC5217m.mo2778a(interfaceC5209e.customNotificationUI(context, map), (!TextUtils.isEmpty(str3) || zCheckNotificationShowInInnerGroup) ? interfaceC5209e.customSummaryNotification(context, map) : null);
        } else {
            ThreadPoolExecutorFactory.execute(new RunnableC5213i(interfaceC5209e, context, map, str3, zCheckNotificationShowInInnerGroup, Looper.myLooper() != null ? new Handler(Looper.myLooper()) : null, interfaceC5217m));
        }
    }

    /* renamed from: e */
    public static void m2777e(Context context, Intent intent, InterfaceC5208d interfaceC5208d) {
        try {
            String stringExtra = intent.getStringExtra(AbstractC5206b.MESSAGE_ID);
            String stringExtra2 = intent.getStringExtra("title");
            String stringExtra3 = intent.getStringExtra(AbstractC5206b.SUMMARY);
            String stringExtra4 = intent.getStringExtra(AbstractC5206b.EXTRA_MAP);
            int intExtra = intent.getIntExtra(AbstractC5206b.NOTIFICATION_OPEN_TYPE, 1);
            String stringExtra5 = intent.getStringExtra(AbstractC5206b.NOTIFICATION_GROUP);
            AbstractC5218n.f3101a.mo3533d("notification deleted " + stringExtra);
            if (!TextUtils.isEmpty(stringExtra5)) {
                C8899a.m17429a().m17432d(stringExtra5);
            }
            interfaceC5208d.onNotificationRemoved(context, stringExtra2, stringExtra3, stringExtra4, intExtra, stringExtra);
        } catch (Throwable th) {
            ALog.m10117e("AgooPushHandler", "Handle notification delete action failed.", th, new Object[0]);
        }
    }
}
