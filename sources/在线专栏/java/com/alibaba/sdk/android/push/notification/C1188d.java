package com.alibaba.sdk.android.push.notification;

import android.R;
import android.app.Notification;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.util.StringUtil;
import com.alibaba.sdk.android.push.common.global.C1162b;
import com.alibaba.sdk.android.push.common.util.JSONUtils;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.push.notification.d */
/* loaded from: classes.dex */
public class C1188d {

    /* renamed from: a */
    static AmsLogger f6913a = AmsLogger.getLogger("MPS:MessageNotification");

    /* renamed from: a */
    private Uri m5356a(Context context, C1186b c1186b) {
        String str;
        Uri uri;
        Uri defaultUri = Uri.EMPTY;
        if (!TextUtils.isEmpty(c1186b.m5282a())) {
            String strM5282a = c1186b.m5282a();
            if (strM5282a.startsWith("android.resource://")) {
                uri = Uri.parse(strM5282a);
            } else {
                if (strM5282a.startsWith("/raw/")) {
                    str = "android.resource://" + context.getPackageName() + strM5282a;
                } else {
                    str = "android.resource://" + context.getPackageName() + "/raw/" + strM5282a;
                }
                uri = Uri.parse(str);
            }
            defaultUri = uri;
        } else if (C1162b.m5169a() != null) {
            defaultUri = Uri.parse(C1162b.m5169a());
        } else {
            int identifier = context.getResources().getIdentifier("alicloud_notification_sound", "raw", context.getPackageName());
            f6913a.m5016d("sound resId:" + identifier);
            if (identifier != 0) {
                defaultUri = Uri.parse("android.resource://" + context.getPackageName() + "/" + identifier);
                f6913a.m5016d("sound resId:" + identifier + "  ;uri:" + defaultUri.toString());
            }
        }
        if (defaultUri == Uri.EMPTY) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        f6913a.m5016d("soundUri:" + defaultUri.toString());
        return defaultUri;
    }

    /* renamed from: a */
    private void m5357a(Context context, C1186b c1186b, Notification notification) {
        String strM5169a;
        String str;
        Uri uri;
        long[] jArr = {100, 250, 100, 250, 100, 250};
        int iM5293d = c1186b.m5293d();
        if (iM5293d == 1) {
            notification.vibrate = jArr;
            return;
        }
        if (iM5293d != 2) {
            if (iM5293d != 3) {
                return;
            } else {
                notification.vibrate = jArr;
            }
        }
        Uri defaultUri = Uri.EMPTY;
        if (TextUtils.isEmpty(c1186b.m5282a())) {
            if (C1162b.m5169a() != null) {
                strM5169a = C1162b.m5169a();
            } else {
                int identifier = context.getResources().getIdentifier("alicloud_notification_sound", "raw", context.getPackageName());
                if (identifier != 0) {
                    strM5169a = "android.resource://" + context.getPackageName() + "/" + identifier;
                }
            }
            defaultUri = Uri.parse(strM5169a);
        } else {
            String strM5282a = c1186b.m5282a();
            if (strM5282a.startsWith("android.resource://")) {
                uri = Uri.parse(strM5282a);
            } else {
                if (strM5282a.startsWith("/raw/")) {
                    str = "android.resource://" + context.getPackageName() + strM5282a;
                } else {
                    str = "android.resource://" + context.getPackageName() + "/raw/" + strM5282a;
                }
                uri = Uri.parse(str);
            }
            defaultUri = uri;
        }
        if (defaultUri == Uri.EMPTY) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        notification.sound = defaultUri;
    }

    /* renamed from: a */
    public static boolean m5358a(Map<String, String> map) {
        int i4;
        BasicCustomPushNotification basicCustomPushNotificationM5278a;
        if (!map.containsKey(PushData.KEY_CUSTOM_NOTIFICAITON_ID) || (i4 = Integer.parseInt(map.get(PushData.KEY_CUSTOM_NOTIFICAITON_ID))) == 0 || (basicCustomPushNotificationM5278a = CustomNotificationBuilder.getInstance().m5278a(i4)) == null) {
            return true;
        }
        return basicCustomPushNotificationM5278a.isBuildWhenAppInForeground();
    }

    /* renamed from: b */
    private void m5359b(Context context, C1186b c1186b, Notification notification) {
        f6913a.m5016d("custom notification feedback");
        long[] jArr = {100, 250, 100, 250, 100, 250};
        if (c1186b.m5308i() == 0) {
            return;
        }
        if (2 == c1186b.m5308i()) {
            notification.sound = m5356a(context, c1186b);
            return;
        }
        if (1 != c1186b.m5308i()) {
            if (3 != c1186b.m5308i()) {
                notification.defaults = -1;
                return;
            }
            notification.sound = m5356a(context, c1186b);
        }
        notification.vibrate = jArr;
    }

    /* renamed from: a */
    public Notification m5360a(Context context, C1186b c1186b, PushData pushData, NotificationConfigure notificationConfigure) {
        try {
            C1185a c1185a = new C1185a();
            c1185a.m5337a(c1186b.m5287b());
            c1185a.m5340b(c1186b.m5290c());
            c1185a.m5336a(c1186b.m5324p());
            c1185a.m5342c(c1186b.m5325q());
            c1185a.m5344d(c1186b.m5326r());
            c1185a.m5339b(c1186b.m5327s());
            c1185a.m5346e(c1186b.m5328t());
            c1185a.m5348f(c1186b.m5329u());
            c1185a.m5350g(c1186b.m5330v());
            c1185a.m5351h(c1186b.m5331w());
            c1185a.m5352i(c1186b.m5282a());
            if (TextUtils.isEmpty(c1186b.m5332x())) {
                String strM5333y = c1186b.m5333y();
                if (!TextUtils.isEmpty(strM5333y)) {
                    c1185a.m5354k(strM5333y);
                }
            } else {
                c1185a.m5353j(c1186b.m5332x());
            }
            Notification notificationMo5281b = c1185a.mo5281b(context, pushData, notificationConfigure);
            if (notificationMo5281b == null) {
                notificationMo5281b = new Notification(R.drawable.stat_notify_chat, "", System.currentTimeMillis());
            }
            if (1 == c1186b.m5302g() || c1186b.m5323o()) {
                m5357a(context, c1186b, notificationMo5281b);
                if (c1186b.m5298e()) {
                    notificationMo5281b.flags |= 32;
                } else {
                    notificationMo5281b.flags |= 16;
                }
            } else {
                f6913a.m5016d("custom notification option first");
                m5359b(context, c1186b, notificationMo5281b);
                notificationMo5281b.flags = c1186b.m5305h();
            }
            if (notificationConfigure != null) {
                notificationConfigure.configNotification(notificationMo5281b, pushData);
            }
            return notificationMo5281b;
        } catch (Throwable th) {
            f6913a.m5020e("onNotification createSummaryNotification error", th);
            return null;
        }
    }

    /* renamed from: a */
    public C1186b m5361a(Context context, Map<String, String> map) throws NumberFormatException {
        String str = map.get("title");
        String str2 = map.get("content");
        if (StringUtil.isEmpty(str) || StringUtil.isEmpty(str2)) {
            f6913a.m5019e("title or content of notify is empty: " + map);
            return null;
        }
        C1186b c1186b = new C1186b();
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
        String str13 = map.get(AgooConstants.MESSAGE_BODY_CATEGORY);
        c1186b.m5289b(str);
        c1186b.m5295d(str2);
        c1186b.m5292c(str2);
        c1186b.m5283a(Integer.parseInt(strValueOf));
        c1186b.m5301f(str5);
        c1186b.m5304g(map.get("image"));
        c1186b.m5318l(str11);
        c1186b.m5320m(str12);
        c1186b.m5322n(str13);
        if (!TextUtils.isEmpty(str6)) {
            try {
                c1186b.m5315k(Integer.parseInt(str6));
            } catch (Throwable unused) {
            }
        }
        c1186b.m5307h(str7);
        c1186b.m5310i(str8);
        c1186b.m5313j(str9);
        c1186b.m5316k(str10);
        c1186b.m5284a(StringUtil.isEmpty(str3) ? null : str3);
        if (!StringUtil.isEmpty(str4)) {
            try {
                Map<String, String> map2 = JSONUtils.toMap(new JSONObject(str4));
                c1186b.m5297e(map2.containsKey("_ALIYUN_NOTIFICATION_PRIORITY_") ? map2.get("_ALIYUN_NOTIFICATION_PRIORITY_") : String.valueOf(0));
                c1186b.m5285a(map2);
            } catch (JSONException e4) {
                f6913a.m5020e("Parse inner json(ext) error:", e4);
            }
        }
        if (map.containsKey(PushData.KEY_CUSTOM_NOTIFICAITON_ID)) {
            int i4 = Integer.parseInt(map.get(PushData.KEY_CUSTOM_NOTIFICAITON_ID));
            if (i4 != 0) {
                BasicCustomPushNotification basicCustomPushNotificationM5278a = CustomNotificationBuilder.getInstance().m5278a(i4);
                if (basicCustomPushNotificationM5278a == null) {
                    f6913a.m5025w("custom notification is null");
                } else {
                    c1186b.m5291c(basicCustomPushNotificationM5278a.getNotificationType());
                    c1186b.m5288b(basicCustomPushNotificationM5278a.getStatusBarDrawable());
                    c1186b.m5296e(basicCustomPushNotificationM5278a.getRemindType());
                    c1186b.m5294d(basicCustomPushNotificationM5278a.getNotificationFlags());
                    c1186b.m5286a(basicCustomPushNotificationM5278a.isServerOptionFirst());
                    if (3 == basicCustomPushNotificationM5278a.getNotificationType()) {
                        AdvancedCustomPushNotification advancedCustomPushNotification = (AdvancedCustomPushNotification) basicCustomPushNotificationM5278a;
                        c1186b.m5309i(advancedCustomPushNotification.getContentView());
                        c1186b.m5300f(advancedCustomPushNotification.getNotificationView());
                        c1186b.m5306h(advancedCustomPushNotification.getTitleView());
                        c1186b.m5303g(advancedCustomPushNotification.getIconView());
                        c1186b.m5312j(advancedCustomPushNotification.getIcon());
                    }
                }
            } else {
                f6913a.m5016d("default notification");
            }
        }
        return c1186b;
    }

    /* renamed from: b */
    public Notification m5362b(Context context, C1186b c1186b, PushData pushData, NotificationConfigure notificationConfigure) {
        String strM5290c;
        Notification notificationMo5280a;
        try {
            C1185a c1185a = new C1185a();
            String strM5332x = c1186b.m5332x();
            String strM5333y = c1186b.m5333y();
            c1185a.m5337a(c1186b.m5287b());
            if (TextUtils.isEmpty(strM5332x)) {
                if (!TextUtils.isEmpty(strM5333y)) {
                    c1185a.m5354k(c1186b.m5333y());
                }
                strM5290c = c1186b.m5290c();
            } else {
                c1185a.m5353j(c1186b.m5332x());
                strM5290c = c1186b.m5290c();
            }
            c1185a.m5340b(strM5290c);
            c1185a.m5336a(c1186b.m5324p());
            c1185a.m5342c(c1186b.m5325q());
            c1185a.m5344d(c1186b.m5326r());
            c1185a.m5339b(c1186b.m5327s());
            c1185a.m5346e(c1186b.m5328t());
            c1185a.m5348f(c1186b.m5329u());
            c1185a.m5350g(c1186b.m5330v());
            c1185a.m5351h(c1186b.m5331w());
            c1185a.m5352i(c1186b.m5282a());
            c1185a.m5355l(c1186b.m5334z());
            if (1 != c1186b.m5302g()) {
                f6913a.m5016d("building customNotification");
                notificationMo5280a = CustomNotificationBuilder.getInstance().m5277a(context, c1186b, pushData, notificationConfigure);
                if (notificationMo5280a == null) {
                    f6913a.m5019e("build custom notification failed, build default notification");
                    notificationMo5280a = c1185a.mo5280a(context, pushData, notificationConfigure);
                }
            } else {
                notificationMo5280a = c1185a.mo5280a(context, pushData, notificationConfigure);
            }
            if (notificationMo5280a == null) {
                notificationMo5280a = new Notification(R.drawable.stat_notify_chat, "", System.currentTimeMillis());
            }
            if (1 == c1186b.m5302g() || c1186b.m5323o()) {
                m5357a(context, c1186b, notificationMo5280a);
                if (c1186b.m5298e()) {
                    notificationMo5280a.flags |= 32;
                } else {
                    notificationMo5280a.flags |= 16;
                }
            } else {
                f6913a.m5016d("custom notification option first");
                m5359b(context, c1186b, notificationMo5280a);
                notificationMo5280a.flags = c1186b.m5305h();
            }
            if (notificationConfigure != null) {
                notificationConfigure.configNotification(notificationMo5280a, pushData);
            }
            return notificationMo5280a;
        } catch (Throwable th) {
            f6913a.m5020e("onNotification", th);
            return null;
        }
    }
}
