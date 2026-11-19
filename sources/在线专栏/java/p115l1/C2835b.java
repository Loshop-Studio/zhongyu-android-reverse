package p115l1;

import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.aliyun.ams.emas.push.AgooMessageReceiver;
import com.aliyun.ams.emas.push.C1204l;
import com.aliyun.ams.emas.push.MsgService;
import com.aliyun.ams.emas.push.NotificationActivity;
import com.aliyun.ams.emas.push.notification.CPushMessage;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.JsonUtility;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p110k1.C2707a;

/* renamed from: l1.b */
/* loaded from: classes.dex */
public class C2835b {
    /* renamed from: a */
    private PendingIntent m9513a(Context context, C2834a c2834a, int i4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), MsgService.class.getName());
        intent.setAction(C1204l.f6943b);
        intent.putExtra(AgooConstants.ACTION_TYPE, AgooConstants.NOTIFICATION_TYPE_DELETE);
        intent.putExtra(AgooConstants.MESSAGE_TASK_ID, c2834a.m9510x());
        intent.putExtra(AgooConstants.MESSAGE_EXT, c2834a.m9512z());
        intent.putExtra("msgId", c2834a.m9500n());
        intent.putExtra("title", c2834a.m9491e());
        intent.putExtra(AgooMessageReceiver.SUMMARY, c2834a.m9494h());
        intent.putExtra(AgooMessageReceiver.NOTIFICATION_OPEN_TYPE, c2834a.m9487a());
        intent.putExtra(AgooMessageReceiver.NOTIFICATION_ID, c2834a.m9506t());
        intent.putExtra(AgooMessageReceiver.NOTIFICATION_GROUP, c2834a.m9485F());
        if (c2834a.m9498l() != null) {
            intent.putExtra(AgooMessageReceiver.EXTRA_MAP, new JSONObject(c2834a.m9498l()).toString());
        }
        ALog.m6090d("MPS:MessageNotification", "delete content messageId:" + c2834a.m9500n(), new Object[0]);
        intent.putExtra("appId", c2834a.m9502p());
        return Build.VERSION.SDK_INT >= 23 ? PendingIntent.getService(context, i4, intent, 201326592) : PendingIntent.getService(context, i4, intent, 134217728);
    }

    /* renamed from: b */
    private PendingIntent m9514b(Context context, C2834a c2834a, Intent intent, int i4) {
        Intent intent2 = new Intent();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 30 || context.getApplicationInfo().targetSdkVersion > 30) {
            intent2.setClassName(context.getPackageName(), NotificationActivity.class.getName());
        } else {
            intent2.setClassName(context.getPackageName(), MsgService.class.getName());
        }
        intent2.setAction(C1204l.f6943b);
        intent2.putExtra(AgooConstants.ACTION_TYPE, AgooConstants.NOTIFICATION_TYPE_OPEN);
        intent2.putExtra(AgooConstants.MESSAGE_TASK_ID, c2834a.m9510x());
        intent2.putExtra(AgooConstants.MESSAGE_EXT, c2834a.m9512z());
        String strM9485F = c2834a.m9485F();
        if (!TextUtils.isEmpty(strM9485F)) {
            intent2.putExtra(AgooMessageReceiver.NOTIFICATION_GROUP, strM9485F);
        }
        intent.putExtra("title", c2834a.m9491e());
        intent.putExtra(AgooMessageReceiver.SUMMARY, c2834a.m9494h());
        intent.putExtra("msgId", c2834a.m9500n());
        intent.putExtra("appId", c2834a.m9502p());
        intent.putExtra(AgooMessageReceiver.NOTIFICATION_OPEN_TYPE, c2834a.m9487a());
        intent.putExtra(AgooMessageReceiver.NOTIFICATION_ID, c2834a.m9506t());
        if (!TextUtils.isEmpty(strM9485F)) {
            intent.putExtra(AgooMessageReceiver.NOTIFICATION_GROUP, strM9485F);
        }
        intent2.putExtra("msgId", c2834a.m9500n());
        if (c2834a.m9498l() != null) {
            intent.putExtra(AgooMessageReceiver.EXTRA_MAP, new JSONObject(c2834a.m9498l()).toString());
        }
        ALog.m6090d("MPS:MessageNotification", "build content messageId:" + c2834a.m9500n(), new Object[0]);
        intent2.putExtra(AgooConstants.KEY_REAL_INTENT, intent);
        return (i5 > 30 || context.getApplicationInfo().targetSdkVersion > 30) ? PendingIntent.getActivity(context, i4, intent2, 201326592) : i5 >= 23 ? PendingIntent.getService(context, i4, intent2, 201326592) : PendingIntent.getService(context, i4, intent2, 134217728);
    }

    /* renamed from: c */
    public CPushMessage m9515c(Map<String, String> map, String str, String str2) {
        String str3 = map.get("title");
        String str4 = map.get("content");
        String str5 = map.get(AgooConstants.MESSAGE_EXT);
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            ALog.m6092e("MPS:MessageNotification", "Message title or content is empty:" + map.toString(), new Object[0]);
            return null;
        }
        CPushMessage cPushMessage = new CPushMessage();
        cPushMessage.m5408h(str2);
        cPushMessage.m5406f(str);
        cPushMessage.m5409i(str3);
        cPushMessage.m5407g(str4);
        cPushMessage.m5410j(str5);
        return cPushMessage;
    }

    /* renamed from: d */
    public void m9516d(Context context, Notification notification, Notification notification2, C2834a c2834a) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            String str = "";
            if (notification == null) {
                C2836c c2836c = new C2836c();
                c2836c.m9524d(c2834a.m9491e());
                c2836c.m9526f(c2834a.m9494h());
                c2836c.m9523c(c2834a.m9508v());
                c2836c.m9528h(c2834a.m9481B());
                c2836c.m9530j(c2834a.m9485F());
                notification = c2836c.mo9521a(context);
                if (notification == null) {
                    notification = new Notification(R.drawable.stat_notify_chat, "", System.currentTimeMillis());
                }
            }
            Intent intent = new Intent();
            intent.putExtra("appId", c2834a.m9502p());
            intent.putExtra("msgId", c2834a.m9500n());
            intent.putExtra(AgooConstants.MESSAGE_TASK_ID, c2834a.m9510x());
            intent.putExtra(AgooConstants.MESSAGE_EXT, c2834a.m9512z());
            intent.putExtra(AgooConstants.MESSAGE_SOURCE, c2834a.m9483D());
            intent.setFlags(270532608);
            try {
                int iM9487a = c2834a.m9487a();
                if (iM9487a == 1) {
                    str = "app";
                    intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                } else if (iM9487a == 2) {
                    str = AgooConstants.OPEN_ACTIIVTY_NAME;
                    try {
                        intent.setClass(context, Class.forName(c2834a.m9504r()));
                    } catch (Throwable th) {
                        ALog.m6091e("MPS:MessageNotification", "can't find certain activity class: ", th, new Object[0]);
                    }
                } else if (iM9487a == 3) {
                    str = AgooConstants.OPEN_URL;
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse(c2834a.m9496j()));
                } else if (iM9487a == 4) {
                    str = "no action";
                }
                ALog.m6093i("MPS:MessageNotification", "open type:" + str, new Object[0]);
            } catch (Throwable th2) {
                ALog.m6091e("MPS:MessageNotification", "openType exception", th2, new Object[0]);
            }
            notification.contentIntent = m9514b(context, c2834a, intent, C1204l.m5400l());
            notification.deleteIntent = m9513a(context, c2834a, C1204l.m5400l());
            try {
                ALog.m6093i("MPS:MessageNotification", "messageId=" + c2834a.m9500n() + ";appId=" + c2834a.m9502p() + ";messageType=notify", null, 1);
            } catch (Throwable th3) {
                ALog.m6091e("MPS:MessageNotification", "ut log error", th3, new Object[0]);
            }
            C2707a.m9029a().m9031b(c2834a.m9506t());
            notificationManager.notify(c2834a.m9506t(), notification);
            C1204l.f6942a.mo5083d("push notify notification");
            String strM9485F = c2834a.m9485F();
            String strM9486G = c2834a.m9486G();
            if (notification2 != null) {
                if (!TextUtils.isEmpty(strM9485F)) {
                    notificationManager.notify(strM9485F.hashCode(), notification2);
                } else {
                    if (TextUtils.isEmpty(strM9486G)) {
                        return;
                    }
                    notificationManager.notify(0, notification2);
                }
            }
        } catch (Throwable th4) {
            C1204l.f6942a.mo5086e("onNotification", th4);
            Log.e("MPS:MessageNotification", Log.getStackTraceString(th4));
        }
    }

    /* renamed from: e */
    public C2834a m9517e(Map<String, String> map, String str, String str2) {
        String str3 = map.get("title");
        String str4 = map.get("content");
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            ALog.m6092e("MPS:MessageNotification", "title or content of notify is empty: " + map, new Object[0]);
            return null;
        }
        C2834a c2834a = new C2834a();
        String strValueOf = map.get("open");
        if (TextUtils.isEmpty(strValueOf)) {
            strValueOf = String.valueOf(1);
        }
        String str5 = map.get(AgooConstants.OPEN_URL);
        String str6 = map.get(AgooConstants.OPEN_ACTIIVTY_NAME);
        String str7 = map.get("ext");
        String str8 = map.get(AgooConstants.MESSAGE_TASK_ID);
        String str9 = map.get(AgooConstants.MESSAGE_EXT);
        String str10 = map.get("notification_channel");
        String str11 = map.get("notify_id");
        String str12 = map.get(AgooConstants.MESSAGE_BODY_GROUP);
        String str13 = map.get(AgooConstants.KEY_BADGE);
        int i4 = !TextUtils.isEmpty(str11) ? Integer.parseInt(str11) : C1204l.m5399k();
        c2834a.m9499m(str);
        c2834a.m9497k(str2);
        c2834a.m9505s(str8);
        c2834a.m9507u(str9);
        c2834a.m9511y(map.get(AgooConstants.MESSAGE_SOURCE));
        c2834a.m9489c(str3);
        c2834a.m9493g(str4);
        c2834a.m9488b(Integer.parseInt(strValueOf));
        if (TextUtils.isEmpty(str5)) {
            str5 = null;
        }
        c2834a.m9495i(str5);
        if (TextUtils.isEmpty(str6)) {
            str6 = null;
        }
        c2834a.m9501o(str6);
        c2834a.m9492f(i4);
        c2834a.m9509w(str10);
        c2834a.m9480A(str12);
        if (!TextUtils.isEmpty(str7)) {
            try {
                Map<String, String> map2 = JsonUtility.toMap(new JSONObject(str7));
                map2.put("_ALIYUN_NOTIFICATION_ID_", String.valueOf(c2834a.m9506t()));
                if (map2.containsKey("_ALIYUN_NOTIFICATION_PRIORITY_")) {
                    c2834a.m9503q(map2.get("_ALIYUN_NOTIFICATION_PRIORITY_"));
                } else {
                    c2834a.m9503q(String.valueOf(0));
                }
                map2.put(AgooConstants.MESSAGE_BODY_MSG_ID_ALIYUN_FLAG, map.get(AgooConstants.MESSAGE_BODY_MSG_ID_ALIYUN_FLAG));
                c2834a.m9490d(map2);
            } catch (JSONException e4) {
                ALog.m6091e("MPS:MessageNotification", "Parse inner json(ext) error:", e4, new Object[0]);
            }
        }
        if (!TextUtils.isEmpty(str13)) {
            if (c2834a.m9498l() == null) {
                c2834a.m9490d(new HashMap());
            }
            c2834a.m9498l().put(AgooConstants.LOCAL_ALIYUN_NOTIFICATION_BADGE, str13);
            c2834a.m9484E(str13);
        }
        return c2834a;
    }
}
