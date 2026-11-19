package com.alibaba.sdk.android.push.notification;

import android.R;
import android.app.Notification;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.util.StringUtil;
import com.alibaba.sdk.android.push.common.global.C5653b;
import com.alibaba.sdk.android.push.common.util.JSONUtils;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.push.notification.d */
/* loaded from: classes3.dex */
public class C5682d {

    /* renamed from: a */
    static AmsLogger f4439a = AmsLogger.getLogger("MPS:MessageNotification");

    /* renamed from: a */
    public Notification m3811a(Context context, C5680b c5680b, PushData pushData, NotificationConfigure notificationConfigure) {
        try {
            C5679a c5679a = new C5679a();
            c5679a.m3788a(c5680b.m3738b());
            c5679a.m3791b(c5680b.m3741c());
            c5679a.m3787a(c5680b.m3775p());
            c5679a.m3793c(c5680b.m3776q());
            c5679a.m3795d(c5680b.m3777r());
            c5679a.m3790b(c5680b.m3778s());
            c5679a.m3797e(c5680b.m3779t());
            c5679a.m3799f(c5680b.m3780u());
            c5679a.m3801g(c5680b.m3781v());
            c5679a.m3802h(c5680b.m3782w());
            c5679a.m3803i(c5680b.m3733a());
            if (TextUtils.isEmpty(c5680b.m3783x())) {
                String strM3784y = c5680b.m3784y();
                if (!TextUtils.isEmpty(strM3784y)) {
                    c5679a.m3805k(strM3784y);
                }
            } else {
                c5679a.m3804j(c5680b.m3783x());
            }
            Notification notificationMo3732b = c5679a.mo3732b(context, pushData, notificationConfigure);
            if (notificationMo3732b == null) {
                notificationMo3732b = new Notification(R.drawable.stat_notify_chat, "", System.currentTimeMillis());
            }
            if (1 == c5680b.m3753g() || c5680b.m3774o()) {
                m3808a(context, c5680b, notificationMo3732b);
                if (c5680b.m3749e()) {
                    notificationMo3732b.flags |= 32;
                } else {
                    notificationMo3732b.flags |= 16;
                }
            } else {
                f4439a.m3417d("custom notification option first");
                m3810b(context, c5680b, notificationMo3732b);
                notificationMo3732b.flags = c5680b.m3756h();
            }
            if (notificationConfigure != null) {
                notificationConfigure.configNotification(notificationMo3732b, pushData);
            }
            return notificationMo3732b;
        } catch (Throwable th) {
            f4439a.m3421e("onNotification createSummaryNotification error", th);
            return null;
        }
    }

    /* renamed from: b */
    public Notification m3813b(Context context, C5680b c5680b, PushData pushData, NotificationConfigure notificationConfigure) {
        String strM3741c;
        Notification notificationMo3731a;
        try {
            C5679a c5679a = new C5679a();
            String strM3783x = c5680b.m3783x();
            String strM3784y = c5680b.m3784y();
            c5679a.m3788a(c5680b.m3738b());
            if (TextUtils.isEmpty(strM3783x)) {
                if (!TextUtils.isEmpty(strM3784y)) {
                    c5679a.m3805k(c5680b.m3784y());
                }
                strM3741c = c5680b.m3741c();
            } else {
                c5679a.m3804j(c5680b.m3783x());
                strM3741c = c5680b.m3741c();
            }
            c5679a.m3791b(strM3741c);
            c5679a.m3787a(c5680b.m3775p());
            c5679a.m3793c(c5680b.m3776q());
            c5679a.m3795d(c5680b.m3777r());
            c5679a.m3790b(c5680b.m3778s());
            c5679a.m3797e(c5680b.m3779t());
            c5679a.m3799f(c5680b.m3780u());
            c5679a.m3801g(c5680b.m3781v());
            c5679a.m3802h(c5680b.m3782w());
            c5679a.m3803i(c5680b.m3733a());
            c5679a.m3806l(c5680b.m3785z());
            if (1 != c5680b.m3753g()) {
                f4439a.m3417d("building customNotification");
                notificationMo3731a = CustomNotificationBuilder.getInstance().m3728a(context, c5680b, pushData, notificationConfigure);
                if (notificationMo3731a == null) {
                    f4439a.m3420e("build custom notification failed, build default notification");
                    notificationMo3731a = c5679a.mo3731a(context, pushData, notificationConfigure);
                }
            } else {
                notificationMo3731a = c5679a.mo3731a(context, pushData, notificationConfigure);
            }
            if (notificationMo3731a == null) {
                notificationMo3731a = new Notification(R.drawable.stat_notify_chat, "", System.currentTimeMillis());
            }
            if (1 == c5680b.m3753g() || c5680b.m3774o()) {
                m3808a(context, c5680b, notificationMo3731a);
                if (c5680b.m3749e()) {
                    notificationMo3731a.flags |= 32;
                } else {
                    notificationMo3731a.flags |= 16;
                }
            } else {
                f4439a.m3417d("custom notification option first");
                m3810b(context, c5680b, notificationMo3731a);
                notificationMo3731a.flags = c5680b.m3756h();
            }
            if (notificationConfigure != null) {
                notificationConfigure.configNotification(notificationMo3731a, pushData);
            }
            return notificationMo3731a;
        } catch (Throwable th) {
            f4439a.m3421e("onNotification", th);
            return null;
        }
    }

    /* renamed from: a */
    private Uri m3807a(Context context, C5680b c5680b) {
        Uri defaultUri;
        String strM3620a;
        Uri uri = Uri.EMPTY;
        if (!TextUtils.isEmpty(c5680b.m3733a())) {
            String strM3733a = c5680b.m3733a();
            if (strM3733a.startsWith("android.resource://")) {
                defaultUri = Uri.parse(strM3733a);
            } else {
                if (strM3733a.startsWith("/raw/")) {
                    strM3620a = "android.resource://" + context.getPackageName() + strM3733a;
                } else {
                    strM3620a = "android.resource://" + context.getPackageName() + "/raw/" + strM3733a;
                }
                defaultUri = Uri.parse(strM3620a);
            }
        } else if (C5653b.m3620a() != null) {
            strM3620a = C5653b.m3620a();
            defaultUri = Uri.parse(strM3620a);
        } else {
            int identifier = context.getResources().getIdentifier("alicloud_notification_sound", "raw", context.getPackageName());
            f4439a.m3417d("sound resId:" + identifier);
            if (identifier != 0) {
                defaultUri = Uri.parse("android.resource://" + context.getPackageName() + MqttTopic.TOPIC_LEVEL_SEPARATOR + identifier);
                f4439a.m3417d("sound resId:" + identifier + "  ;uri:" + defaultUri.toString());
            } else {
                defaultUri = uri;
            }
        }
        if (defaultUri == uri) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        f4439a.m3417d("soundUri:" + defaultUri.toString());
        return defaultUri;
    }

    /* renamed from: b */
    private void m3810b(Context context, C5680b c5680b, Notification notification) {
        f4439a.m3417d("custom notification feedback");
        long[] jArr = {100, 250, 100, 250, 100, 250};
        if (c5680b.m3759i() == 0) {
            return;
        }
        if (2 == c5680b.m3759i()) {
            notification.sound = m3807a(context, c5680b);
            return;
        }
        if (1 == c5680b.m3759i()) {
            notification.vibrate = jArr;
        } else if (3 != c5680b.m3759i()) {
            notification.defaults = -1;
        } else {
            notification.sound = m3807a(context, c5680b);
            notification.vibrate = jArr;
        }
    }

    /* renamed from: a */
    public C5680b m3812a(Context context, Map<String, String> map) throws NumberFormatException {
        String str = map.get("title");
        String str2 = map.get("content");
        if (StringUtil.isEmpty(str) || StringUtil.isEmpty(str2)) {
            f4439a.m3420e("title or content of notify is empty: " + map);
            return null;
        }
        C5680b c5680b = new C5680b();
        String strValueOf = map.get("remind");
        if (StringUtil.isEmpty(strValueOf)) {
            strValueOf = String.valueOf(3);
        }
        String str3 = map.get("music");
        String str4 = map.get("ext");
        String str5 = map.get("notification_channel");
        String str6 = map.get("style");
        String str7 = map.get("title");
        String str8 = map.get("big_body");
        String str9 = map.get("big_picture");
        String str10 = map.get("inbox_content");
        String str11 = map.get(AgooConstants.MESSAGE_BODY_GROUP);
        String str12 = map.get(AgooConstants.MESSAGE_BODY_EMAS_GROUP);
        String str13 = strValueOf;
        String str14 = map.get(AgooConstants.MESSAGE_BODY_CATEGORY);
        c5680b.m3740b(str);
        c5680b.m3746d(str2);
        c5680b.m3743c(str2);
        c5680b.m3734a(Integer.parseInt(str13));
        c5680b.m3752f(str5);
        c5680b.m3755g(map.get("image"));
        c5680b.m3769l(str11);
        c5680b.m3771m(str12);
        c5680b.m3773n(str14);
        if (!TextUtils.isEmpty(str6)) {
            try {
                c5680b.m3766k(Integer.parseInt(str6));
            } catch (Throwable unused) {
            }
        }
        c5680b.m3758h(str7);
        c5680b.m3761i(str8);
        c5680b.m3764j(str9);
        c5680b.m3767k(str10);
        c5680b.m3735a(StringUtil.isEmpty(str3) ? null : str3);
        if (!StringUtil.isEmpty(str4)) {
            try {
                Map<String, String> map2 = JSONUtils.toMap(new JSONObject(str4));
                c5680b.m3748e(map2.containsKey("_ALIYUN_NOTIFICATION_PRIORITY_") ? map2.get("_ALIYUN_NOTIFICATION_PRIORITY_") : String.valueOf(0));
                c5680b.m3736a(map2);
            } catch (JSONException e10) {
                f4439a.m3421e("Parse inner json(ext) error:", e10);
            }
        }
        if (map.containsKey(PushData.KEY_CUSTOM_NOTIFICAITON_ID)) {
            int i10 = Integer.parseInt(map.get(PushData.KEY_CUSTOM_NOTIFICAITON_ID));
            if (i10 != 0) {
                BasicCustomPushNotification basicCustomPushNotificationM3729a = CustomNotificationBuilder.getInstance().m3729a(i10);
                if (basicCustomPushNotificationM3729a == null) {
                    f4439a.m3426w("custom notification is null");
                } else {
                    c5680b.m3742c(basicCustomPushNotificationM3729a.getNotificationType());
                    c5680b.m3739b(basicCustomPushNotificationM3729a.getStatusBarDrawable());
                    c5680b.m3747e(basicCustomPushNotificationM3729a.getRemindType());
                    c5680b.m3745d(basicCustomPushNotificationM3729a.getNotificationFlags());
                    c5680b.m3737a(basicCustomPushNotificationM3729a.isServerOptionFirst());
                    if (3 == basicCustomPushNotificationM3729a.getNotificationType()) {
                        AdvancedCustomPushNotification advancedCustomPushNotification = (AdvancedCustomPushNotification) basicCustomPushNotificationM3729a;
                        c5680b.m3760i(advancedCustomPushNotification.getContentView());
                        c5680b.m3751f(advancedCustomPushNotification.getNotificationView());
                        c5680b.m3757h(advancedCustomPushNotification.getTitleView());
                        c5680b.m3754g(advancedCustomPushNotification.getIconView());
                        c5680b.m3763j(advancedCustomPushNotification.getIcon());
                    }
                }
            } else {
                f4439a.m3417d("default notification");
            }
        }
        return c5680b;
    }

    /* renamed from: a */
    private void m3808a(Context context, C5680b c5680b, Notification notification) {
        Uri defaultUri;
        StringBuilder sb2;
        String strM3620a;
        long[] jArr = {100, 250, 100, 250, 100, 250};
        int iM3744d = c5680b.m3744d();
        if (iM3744d == 1) {
            notification.vibrate = jArr;
            return;
        }
        if (iM3744d != 2) {
            if (iM3744d != 3) {
                return;
            } else {
                notification.vibrate = jArr;
            }
        }
        Uri uri = Uri.EMPTY;
        if (!TextUtils.isEmpty(c5680b.m3733a())) {
            String strM3733a = c5680b.m3733a();
            if (strM3733a.startsWith("android.resource://")) {
                defaultUri = Uri.parse(strM3733a);
            } else if (strM3733a.startsWith("/raw/")) {
                sb2 = new StringBuilder();
                sb2.append("android.resource://");
                sb2.append(context.getPackageName());
                sb2.append(strM3733a);
                strM3620a = sb2.toString();
                defaultUri = Uri.parse(strM3620a);
            } else {
                strM3620a = "android.resource://" + context.getPackageName() + "/raw/" + strM3733a;
                defaultUri = Uri.parse(strM3620a);
            }
        } else if (C5653b.m3620a() != null) {
            strM3620a = C5653b.m3620a();
            defaultUri = Uri.parse(strM3620a);
        } else {
            int identifier = context.getResources().getIdentifier("alicloud_notification_sound", "raw", context.getPackageName());
            if (identifier != 0) {
                sb2 = new StringBuilder();
                sb2.append("android.resource://");
                sb2.append(context.getPackageName());
                sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
                sb2.append(identifier);
                strM3620a = sb2.toString();
                defaultUri = Uri.parse(strM3620a);
            } else {
                defaultUri = uri;
            }
        }
        if (defaultUri == uri) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        notification.sound = defaultUri;
    }

    /* renamed from: a */
    public static boolean m3809a(Map<String, String> map) {
        int i10;
        BasicCustomPushNotification basicCustomPushNotificationM3729a;
        if (!map.containsKey(PushData.KEY_CUSTOM_NOTIFICAITON_ID) || (i10 = Integer.parseInt(map.get(PushData.KEY_CUSTOM_NOTIFICAITON_ID))) == 0 || (basicCustomPushNotificationM3729a = CustomNotificationBuilder.getInstance().m3729a(i10)) == null) {
            return true;
        }
        return basicCustomPushNotificationM3729a.isBuildWhenAppInForeground();
    }
}
