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
import com.alibaba.sdk.android.push.common.global.C5653b;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.alibaba.sdk.android.push.notification.a */
/* loaded from: classes3.dex */
public class C5679a extends AbstractC5681c {

    /* renamed from: o */
    private static final AmsLogger f4394o = AmsLogger.getLogger("MPS:BasicNotificationBuilder");

    /* JADX WARN: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0216  */
    @Override // com.alibaba.sdk.android.push.notification.AbstractC5681c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Notification mo3731a(android.content.Context r11, com.alibaba.sdk.android.push.notification.PushData r12, com.alibaba.sdk.android.push.notification.NotificationConfigure r13) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.push.notification.C5679a.mo3731a(android.content.Context, com.alibaba.sdk.android.push.notification.PushData, com.alibaba.sdk.android.push.notification.NotificationConfigure):android.app.Notification");
    }

    @Override // com.alibaba.sdk.android.push.notification.AbstractC5681c
    /* renamed from: b */
    public Notification mo3732b(Context context, PushData pushData, NotificationConfigure notificationConfigure) {
        int i10;
        String strM3796e = m3796e();
        String strM3798f = m3798f();
        if (TextUtils.isEmpty(strM3796e) && TextUtils.isEmpty(strM3798f)) {
            f4394o.m3417d("body group and emas group all empty");
            return null;
        }
        int iM3622c = C5653b.m3622c() != 0 ? C5653b.m3622c() : context.getResources().getIdentifier(CustomNotificationBuilder.NOTIFICATION_SMALL_ICON_FILE, CustomNotificationBuilder.NOTIFICATION_ICON_RES_TYPE, context.getPackageName());
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon;
        } catch (PackageManager.NameNotFoundException e10) {
            f4394o.m3421e("Get system icon error, package name not found, ", e10);
            i10 = R.drawable.stat_notify_chat;
        }
        if (iM3622c == 0) {
            iM3622c = i10;
        }
        Notification.Builder builder = new Notification.Builder(context);
        builder.setSmallIcon(iM3622c);
        if (!TextUtils.isEmpty(m3800g())) {
            String strM3800g = m3800g();
            for (Field field : Notification.class.getDeclaredFields()) {
                if (field.getName().equals(strM3800g)) {
                    try {
                        builder.setCategory((String) field.get(null));
                    } catch (IllegalAccessException unused) {
                        f4394o.m3420e("set category error: " + strM3800g);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(strM3796e)) {
            builder.setGroup(strM3796e);
        } else if (!TextUtils.isEmpty(strM3798f)) {
            builder.setGroup(strM3798f);
        }
        builder.setGroupSummary(true);
        Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
        if (!TextUtils.isEmpty(this.f4435k)) {
            try {
                JSONArray jSONArray = new JSONArray(this.f4435k);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    inboxStyle.addLine(jSONArray.getString(i11));
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        builder.setStyle(inboxStyle);
        if (Build.VERSION.SDK_INT >= 26 && !TextUtils.isEmpty(m3794d())) {
            builder.setChannelId(m3794d());
        }
        return builder.build();
    }

    /* renamed from: a */
    private Bitmap m3730a(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
