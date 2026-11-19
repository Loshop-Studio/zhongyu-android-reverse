package p124e0;

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
import p038c0.AbstractC5206b;
import p038c0.AbstractC5218n;
import p108d0.C8899a;

/* renamed from: e0.b */
/* loaded from: classes3.dex */
public class C9062b {
    /* renamed from: a */
    public final PendingIntent m17830a(Context context, C9061a c9061a, int i10) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), MsgService.class.getName());
        intent.setAction(AbstractC5218n.f3102b);
        intent.putExtra(AgooConstants.ACTION_TYPE, AgooConstants.NOTIFICATION_TYPE_DELETE);
        intent.putExtra(AgooConstants.MESSAGE_TASK_ID, c9061a.m17827x());
        intent.putExtra(AgooConstants.MESSAGE_EXT, c9061a.m17829z());
        intent.putExtra("msgId", c9061a.m17817n());
        intent.putExtra("title", c9061a.m17808e());
        intent.putExtra(AbstractC5206b.SUMMARY, c9061a.m17811h());
        intent.putExtra(AbstractC5206b.NOTIFICATION_OPEN_TYPE, c9061a.m17804a());
        intent.putExtra(AbstractC5206b.NOTIFICATION_ID, c9061a.m17823t());
        intent.putExtra(AbstractC5206b.NOTIFICATION_GROUP, c9061a.m17802F());
        if (c9061a.m17815l() != null) {
            intent.putExtra(AbstractC5206b.EXTRA_MAP, new JSONObject(c9061a.m17815l()).toString());
        }
        ALog.m10116d("MPS:MessageNotification", "delete content messageId:" + c9061a.m17817n(), new Object[0]);
        intent.putExtra("appId", c9061a.m17819p());
        return PendingIntent.getService(context, i10, intent, 201326592);
    }

    /* renamed from: b */
    public final PendingIntent m17831b(Context context, C9061a c9061a, Intent intent, int i10) {
        Intent intent2 = new Intent();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 30 || context.getApplicationInfo().targetSdkVersion > 30) {
            intent2.setClassName(context.getPackageName(), NotificationActivity.class.getName());
        } else {
            intent2.setClassName(context.getPackageName(), MsgService.class.getName());
        }
        intent2.setAction(AbstractC5218n.f3102b);
        intent2.putExtra(AgooConstants.ACTION_TYPE, AgooConstants.NOTIFICATION_TYPE_OPEN);
        intent2.putExtra(AgooConstants.MESSAGE_TASK_ID, c9061a.m17827x());
        intent2.putExtra(AgooConstants.MESSAGE_EXT, c9061a.m17829z());
        String strM17802F = c9061a.m17802F();
        if (!TextUtils.isEmpty(strM17802F)) {
            intent2.putExtra(AbstractC5206b.NOTIFICATION_GROUP, strM17802F);
        }
        intent.putExtra("title", c9061a.m17808e());
        intent.putExtra(AbstractC5206b.SUMMARY, c9061a.m17811h());
        intent.putExtra("msgId", c9061a.m17817n());
        intent.putExtra("appId", c9061a.m17819p());
        intent.putExtra(AbstractC5206b.NOTIFICATION_OPEN_TYPE, c9061a.m17804a());
        intent.putExtra(AbstractC5206b.NOTIFICATION_ID, c9061a.m17823t());
        if (!TextUtils.isEmpty(strM17802F)) {
            intent.putExtra(AbstractC5206b.NOTIFICATION_GROUP, strM17802F);
        }
        intent2.putExtra("msgId", c9061a.m17817n());
        if (c9061a.m17815l() != null) {
            intent.putExtra(AbstractC5206b.EXTRA_MAP, new JSONObject(c9061a.m17815l()).toString());
        }
        ALog.m10116d("MPS:MessageNotification", "build content messageId:" + c9061a.m17817n(), new Object[0]);
        intent2.putExtra(AgooConstants.KEY_REAL_INTENT, intent);
        return (i11 > 30 || context.getApplicationInfo().targetSdkVersion > 30) ? PendingIntent.getActivity(context, i10, intent2, 201326592) : PendingIntent.getService(context, i10, intent2, 201326592);
    }

    /* renamed from: c */
    public CPushMessage m17832c(Map map, String str, String str2) {
        String str3 = (String) map.get("title");
        String str4 = (String) map.get("content");
        String str5 = (String) map.get(AgooConstants.MESSAGE_EXT);
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            ALog.m10118e("MPS:MessageNotification", "Message title or content is empty:" + map.toString(), new Object[0]);
            return null;
        }
        CPushMessage cPushMessage = new CPushMessage();
        cPushMessage.m3882k(str2);
        cPushMessage.m3880i(str);
        cPushMessage.m3883l(str3);
        cPushMessage.m3881j(str4);
        cPushMessage.m3884m(str5);
        return cPushMessage;
    }

    /* renamed from: d */
    public void m17833d(Context context, Notification notification, Notification notification2, C9061a c9061a) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            String str = "";
            if (notification == null) {
                C9063c c9063c = new C9063c();
                c9063c.m17843d(c9061a.m17808e());
                c9063c.m17845f(c9061a.m17811h());
                c9063c.m17842c(c9061a.m17825v());
                c9063c.m17847h(c9061a.m17798B());
                c9063c.m17849j(c9061a.m17802F());
                notification = c9063c.mo17837a(context);
                if (notification == null) {
                    notification = new Notification(R.drawable.stat_notify_chat, "", System.currentTimeMillis());
                }
            }
            Intent intent = new Intent();
            intent.putExtra("appId", c9061a.m17819p());
            intent.putExtra("msgId", c9061a.m17817n());
            intent.putExtra(AgooConstants.MESSAGE_TASK_ID, c9061a.m17827x());
            intent.putExtra(AgooConstants.MESSAGE_EXT, c9061a.m17829z());
            intent.putExtra(AgooConstants.MESSAGE_SOURCE, c9061a.m17800D());
            intent.setFlags(270532608);
            try {
                int iM17804a = c9061a.m17804a();
                if (iM17804a == 1) {
                    str = "app";
                    intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                } else if (iM17804a == 2) {
                    str = AgooConstants.OPEN_ACTIIVTY_NAME;
                    try {
                        intent.setClass(context, Class.forName(c9061a.m17821r()));
                    } catch (Throwable th) {
                        ALog.m10117e("MPS:MessageNotification", "can't find certain activity class: ", th, new Object[0]);
                    }
                } else if (iM17804a == 3) {
                    str = "url";
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse(c9061a.m17813j()));
                } else if (iM17804a == 4) {
                    str = "no action";
                }
                ALog.m10119i("MPS:MessageNotification", "open type:" + str, new Object[0]);
            } catch (Throwable th2) {
                ALog.m10117e("MPS:MessageNotification", "openType exception", th2, new Object[0]);
            }
            notification.contentIntent = m17831b(context, c9061a, intent, AbstractC5218n.m2795l());
            notification.deleteIntent = m17830a(context, c9061a, AbstractC5218n.m2795l());
            try {
                ALog.m10119i("MPS:MessageNotification", "messageId=" + c9061a.m17817n() + ";appId=" + c9061a.m17819p() + ";messageType=notify", null, 1);
            } catch (Throwable th3) {
                ALog.m10117e("MPS:MessageNotification", "ut log error", th3, new Object[0]);
            }
            C8899a.m17429a().m17430b(c9061a.m17823t());
            notificationManager.notify(c9061a.m17823t(), notification);
            AbstractC5218n.f3101a.mo3533d("push notify notification");
            String strM17802F = c9061a.m17802F();
            String strM17803G = c9061a.m17803G();
            if (notification2 != null) {
                if (!TextUtils.isEmpty(strM17802F)) {
                    notificationManager.notify(strM17802F.hashCode(), notification2);
                } else {
                    if (TextUtils.isEmpty(strM17803G)) {
                        return;
                    }
                    notificationManager.notify(0, notification2);
                }
            }
        } catch (Throwable th4) {
            AbstractC5218n.f3101a.mo3536e("onNotification", th4);
            Log.e("MPS:MessageNotification", Log.getStackTraceString(th4));
        }
    }

    /* renamed from: e */
    public C9061a m17834e(Map map, String str, String str2) {
        String str3 = (String) map.get("title");
        String str4 = (String) map.get("content");
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            ALog.m10118e("MPS:MessageNotification", "title or content of notify is empty: " + map, new Object[0]);
            return null;
        }
        C9061a c9061a = new C9061a();
        String strValueOf = (String) map.get("open");
        if (TextUtils.isEmpty(strValueOf)) {
            strValueOf = String.valueOf(1);
        }
        String str5 = (String) map.get("url");
        String str6 = (String) map.get(AgooConstants.OPEN_ACTIIVTY_NAME);
        String str7 = (String) map.get("ext");
        String str8 = (String) map.get(AgooConstants.MESSAGE_TASK_ID);
        String str9 = (String) map.get(AgooConstants.MESSAGE_EXT);
        String str10 = (String) map.get("notification_channel");
        String str11 = (String) map.get("notify_id");
        String str12 = (String) map.get(AgooConstants.MESSAGE_BODY_GROUP);
        String str13 = (String) map.get(AgooConstants.KEY_BADGE);
        String str14 = strValueOf;
        int i10 = !TextUtils.isEmpty(str11) ? Integer.parseInt(str11) : AbstractC5218n.m2794k();
        c9061a.m17816m(str);
        c9061a.m17814k(str2);
        c9061a.m17822s(str8);
        c9061a.m17824u(str9);
        c9061a.m17828y((String) map.get(AgooConstants.MESSAGE_SOURCE));
        c9061a.m17806c(str3);
        c9061a.m17810g(str4);
        c9061a.m17805b(Integer.parseInt(str14));
        c9061a.m17812i(TextUtils.isEmpty(str5) ? null : str5);
        if (TextUtils.isEmpty(str6)) {
            str6 = null;
        }
        c9061a.m17818o(str6);
        c9061a.m17809f(i10);
        c9061a.m17826w(str10);
        c9061a.m17797A(str12);
        if (!TextUtils.isEmpty(str7)) {
            try {
                Map map2 = JsonUtility.toMap(new JSONObject(str7));
                map2.put("_ALIYUN_NOTIFICATION_ID_", String.valueOf(c9061a.m17823t()));
                if (map2.containsKey("_ALIYUN_NOTIFICATION_PRIORITY_")) {
                    c9061a.m17820q((String) map2.get("_ALIYUN_NOTIFICATION_PRIORITY_"));
                } else {
                    c9061a.m17820q(String.valueOf(0));
                }
                map2.put(AgooConstants.MESSAGE_BODY_MSG_ID_ALIYUN_FLAG, map.get(AgooConstants.MESSAGE_BODY_MSG_ID_ALIYUN_FLAG));
                c9061a.m17807d(map2);
            } catch (JSONException e10) {
                ALog.m10117e("MPS:MessageNotification", "Parse inner json(ext) error:", e10, new Object[0]);
            }
        }
        if (!TextUtils.isEmpty(str13)) {
            if (c9061a.m17815l() == null) {
                c9061a.m17807d(new HashMap());
            }
            c9061a.m17815l().put(AgooConstants.LOCAL_ALIYUN_NOTIFICATION_BADGE, str13);
            c9061a.m17801E(str13);
        }
        return c9061a;
    }
}
