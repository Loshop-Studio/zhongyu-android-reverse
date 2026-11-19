package p344t5;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.blankj.utilcode.util.AbstractC5792j;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.push.EnumC7321k;
import com.huawei.hms.support.api.push.TransActivity;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import org.android.agoo.message.MessageService;
import p200j2.AbstractC9661a;

/* renamed from: t5.l */
/* loaded from: classes5.dex */
public abstract class AbstractC11238l {

    /* renamed from: a */
    public static int f26945a;

    /* renamed from: a */
    public static Notification m25013a(Context context, C11239m c11239m, int[] iArr) {
        Notification.Builder builder = new Notification.Builder(context);
        if (AbstractC11235i.m25009a(c11239m) == EnumC7321k.STYLE_BIGTEXT) {
            AbstractC11235i.m25010b(builder, c11239m.m25052m(), c11239m);
        }
        AbstractC11233g.m25005c(context, builder, c11239m);
        m25024l(c11239m, builder);
        m25027o(c11239m, builder);
        m25018f(context, c11239m, builder);
        m25015c(builder);
        m25019g(c11239m, builder);
        m25026n(c11239m, builder);
        builder.setContentIntent(m25025m(context, c11239m, iArr));
        builder.setDeleteIntent(m25022j(context, c11239m, iArr));
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId("HwPushChannelID");
        }
        m25023k(context, builder, c11239m);
        m25016d(context, builder, c11239m);
        return builder.build();
    }

    /* renamed from: b */
    public static Intent m25014b(Context context, C11239m c11239m, int[] iArr, String str, int i10) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
        intent.putExtra("selfshow_info", c11239m.m25028A()).putExtra("selfshow_token", c11239m.m25038K()).putExtra("selfshow_event_id", str).putExtra("selfshow_notify_id", iArr[0]).putExtra("selfshow_auto_clear_id", iArr[3]).setPackage(context.getPackageName()).setFlags(i10);
        return intent;
    }

    /* renamed from: c */
    public static void m25015c(Notification.Builder builder) {
        builder.setShowWhen(true);
        builder.setWhen(System.currentTimeMillis());
    }

    /* renamed from: d */
    public static void m25016d(Context context, Notification.Builder builder, C11239m c11239m) {
        if (HwBuildEx.VERSION.EMUI_SDK_INT < 11 || !AbstractC11231e.m24997d(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        String strM25060u = c11239m.m25060u();
        HMSLog.m8727i("PushSelfShowLog", "the package name of notification is:" + strM25060u);
        if (!TextUtils.isEmpty(strM25060u)) {
            String strM24996c = AbstractC11231e.m24996c(context, strM25060u);
            HMSLog.m8727i("PushSelfShowLog", "the app name is:" + strM24996c);
            if (strM24996c != null) {
                bundle.putCharSequence("android.extraAppName", strM24996c);
            }
        }
        builder.setExtras(bundle);
    }

    /* renamed from: e */
    public static synchronized void m25017e(Context context, C11239m c11239m) {
        int iHashCode;
        int iHashCode2;
        int i10;
        int iHashCode3;
        if (context != null) {
            try {
                if (!m25021i(c11239m)) {
                    HMSLog.m8722d("PushSelfShowLog", "showNotification, the msg id = " + c11239m.m25029B());
                    if (f26945a == 0) {
                        f26945a = (context.getPackageName() + System.currentTimeMillis()).hashCode();
                    }
                    if (TextUtils.isEmpty(c11239m.m25062w())) {
                        String strM25030C = c11239m.m25030C();
                        if (!TextUtils.isEmpty(strM25030C)) {
                            int iHashCode4 = strM25030C.hashCode();
                            c11239m.m25043d(iHashCode4);
                            HMSLog.m8722d("PushSelfShowLog", "notification msgTag = " + iHashCode4);
                        }
                        if (c11239m.m25032E() != -1) {
                            iHashCode = c11239m.m25032E();
                            iHashCode3 = (c11239m.m25060u() + System.currentTimeMillis()).hashCode();
                            i10 = iHashCode3 + 1;
                            iHashCode2 = (c11239m.m25032E() + c11239m.m25060u() + context.getPackageName()).hashCode();
                        } else {
                            int i11 = f26945a;
                            int i12 = i11 + 1;
                            int i13 = i11 + 2;
                            int i14 = i11 + 3;
                            int i15 = i11 + 4;
                            f26945a = i15;
                            iHashCode2 = i15;
                            iHashCode = i12;
                            iHashCode3 = i13;
                            i10 = i14;
                        }
                    } else {
                        iHashCode = (c11239m.m25062w() + c11239m.m25060u()).hashCode();
                        int i16 = f26945a;
                        int i17 = i16 + 1;
                        int i18 = i16 + 2;
                        f26945a = i18;
                        iHashCode2 = (c11239m.m25062w() + c11239m.m25060u() + context.getPackageName()).hashCode();
                        i10 = i18;
                        iHashCode3 = i17;
                    }
                    HMSLog.m8722d("PushSelfShowLog", "notifyId:" + iHashCode + ",openNotifyId:" + iHashCode3 + ",delNotifyId:" + i10 + ",alarmNotifyId:" + iHashCode2);
                    if (c11239m.m25050k() <= 0) {
                        iHashCode2 = 0;
                    }
                    Notification notificationM25013a = AbstractC11231e.m25002i() ? m25013a(context, c11239m, new int[]{iHashCode, iHashCode3, i10, iHashCode2}) : null;
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null && notificationM25013a != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            String string = context.getString(ResourceLoaderUtil.getStringId("hms_push_channel"));
                            AbstractC9661a.m19061a();
                            notificationManager.createNotificationChannel(AbstractC5792j.m3900a("HwPushChannelID", string, 3));
                        }
                        notificationManager.notify(iHashCode, notificationM25013a);
                        AbstractC11236j.m25012b(context, c11239m.m25029B(), c11239m.m25044e(), MessageService.MSG_DB_COMPLETE);
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: f */
    public static void m25018f(Context context, C11239m c11239m, Notification.Builder builder) {
        Bitmap bitmapM25004b = AbstractC11233g.m25004b(context, c11239m);
        if (bitmapM25004b != null) {
            builder.setLargeIcon(bitmapM25004b);
        }
    }

    /* renamed from: g */
    public static void m25019g(C11239m c11239m, Notification.Builder builder) {
        builder.setAutoCancel(c11239m.m25048i() == 1);
        builder.setOngoing(false);
    }

    /* renamed from: h */
    public static boolean m25020h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: i */
    public static boolean m25021i(C11239m c11239m) {
        if (c11239m != null) {
            return TextUtils.isEmpty(c11239m.m25034G()) && TextUtils.isEmpty(c11239m.m25058s());
        }
        return true;
    }

    /* renamed from: j */
    public static PendingIntent m25022j(Context context, C11239m c11239m, int[] iArr) {
        return PendingIntent.getBroadcast(context, iArr[2], m25014b(context, c11239m, iArr, "2", 268435456), AbstractC11231e.m24994a());
    }

    /* renamed from: k */
    public static void m25023k(Context context, Notification.Builder builder, C11239m c11239m) {
        if ("com.huawei.android.pushagent".equals(context.getPackageName())) {
            Bundle bundle = new Bundle();
            String strM25060u = c11239m.m25060u();
            if (TextUtils.isEmpty(strM25060u)) {
                return;
            }
            bundle.putString("hw_origin_sender_package_name", strM25060u);
            builder.setExtras(bundle);
        }
    }

    /* renamed from: l */
    public static void m25024l(C11239m c11239m, Notification.Builder builder) {
        String strM25033F = c11239m.m25033F();
        if (TextUtils.isEmpty(strM25033F)) {
            return;
        }
        builder.setSubText(strM25033F);
    }

    /* renamed from: m */
    public static PendingIntent m25025m(Context context, C11239m c11239m, int[] iArr) {
        Intent intentM25014b = m25014b(context, c11239m, iArr, "1", 268435456);
        if (!m25020h()) {
            return PendingIntent.getBroadcast(context, iArr[1], intentM25014b, AbstractC11231e.m24994a());
        }
        intentM25014b.setClass(context, TransActivity.class);
        intentM25014b.setFlags(268468224);
        return PendingIntent.getActivity(context, iArr[1], intentM25014b, AbstractC11231e.m24994a());
    }

    /* renamed from: n */
    public static void m25026n(C11239m c11239m, Notification.Builder builder) {
        builder.setTicker(c11239m.m25037J());
    }

    /* renamed from: o */
    public static void m25027o(C11239m c11239m, Notification.Builder builder) {
        String strM25034G = c11239m.m25034G();
        String strM25058s = c11239m.m25058s();
        if (TextUtils.isEmpty(strM25058s)) {
            builder.setContentText(strM25034G);
            return;
        }
        builder.setContentText(strM25058s);
        if (TextUtils.isEmpty(strM25034G)) {
            return;
        }
        builder.setContentTitle(strM25034G);
    }
}
