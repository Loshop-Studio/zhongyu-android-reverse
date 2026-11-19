package com.alibaba.sdk.android.push.notification;

import android.R;
import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.push.common.global.C1162b;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.alibaba.sdk.android.push.notification.a */
/* loaded from: classes.dex */
public class C1185a extends AbstractC1187c {

    /* renamed from: o */
    private static final AmsLogger f6868o = AmsLogger.getLogger("MPS:BasicNotificationBuilder");

    /* renamed from: a */
    private Bitmap m5279a(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0216  */
    @Override // com.alibaba.sdk.android.push.notification.AbstractC1187c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Notification mo5280a(android.content.Context r11, com.alibaba.sdk.android.push.notification.PushData r12, com.alibaba.sdk.android.push.notification.NotificationConfigure r13) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.push.notification.C1185a.mo5280a(android.content.Context, com.alibaba.sdk.android.push.notification.PushData, com.alibaba.sdk.android.push.notification.NotificationConfigure):android.app.Notification");
    }

    @Override // com.alibaba.sdk.android.push.notification.AbstractC1187c
    /* renamed from: b */
    public Notification mo5281b(Context context, PushData pushData, NotificationConfigure notificationConfigure) {
        String strM5345e = m5345e();
        String strM5347f = m5347f();
        if (TextUtils.isEmpty(strM5345e) && TextUtils.isEmpty(strM5347f)) {
            f6868o.m5016d("body group and emas group all empty");
            return null;
        }
        int iM5171c = C1162b.m5171c() != 0 ? C1162b.m5171c() : context.getResources().getIdentifier(CustomNotificationBuilder.NOTIFICATION_SMALL_ICON_FILE, CustomNotificationBuilder.NOTIFICATION_ICON_RES_TYPE, context.getPackageName());
        int i4 = R.drawable.stat_notify_chat;
        try {
            i4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon;
        } catch (PackageManager.NameNotFoundException e4) {
            f6868o.m5020e("Get system icon error, package name not found, ", e4);
        }
        if (iM5171c == 0) {
            iM5171c = i4;
        }
        Notification.Builder builder = new Notification.Builder(context);
        builder.setSmallIcon(iM5171c);
        if (!TextUtils.isEmpty(m5349g())) {
            String strM5349g = m5349g();
            for (Field field : Notification.class.getDeclaredFields()) {
                if (field.getName().equals(strM5349g)) {
                    try {
                        builder.setCategory((String) field.get(null));
                    } catch (IllegalAccessException unused) {
                        f6868o.m5019e("set category error: " + strM5349g);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(strM5345e)) {
            builder.setGroup(strM5345e);
        } else if (!TextUtils.isEmpty(strM5347f)) {
            builder.setGroup(strM5347f);
        }
        builder.setGroupSummary(true);
        Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
        if (!TextUtils.isEmpty(this.f6909k)) {
            try {
                JSONArray jSONArray = new JSONArray(this.f6909k);
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    inboxStyle.addLine(jSONArray.getString(i5));
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        builder.setStyle(inboxStyle);
        if (Build.VERSION.SDK_INT >= 26 && !TextUtils.isEmpty(m5343d())) {
            builder.setChannelId(m5343d());
        }
        return builder.build();
    }
}
