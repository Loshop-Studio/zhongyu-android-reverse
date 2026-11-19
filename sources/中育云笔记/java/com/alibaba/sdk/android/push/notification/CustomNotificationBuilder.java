package com.alibaba.sdk.android.push.notification;

import android.R;
import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import anet.channel.request.Request;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.p050a.C5571a;
import com.alibaba.sdk.android.push.common.global.C5653b;
import com.alibaba.sdk.android.push.util.DownloadUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class CustomNotificationBuilder {
    public static final String NOTIFICATION_ICON_RES_TYPE = "drawable";
    public static final String NOTIFICATION_LARGE_ICON_FILE = "alicloud_notification_largeicon";
    public static final String NOTIFICATION_SMALL_ICON_FILE = "alicloud_notification_smallicon";

    /* renamed from: a */
    static AmsLogger f4391a = AmsLogger.getLogger("MPS:CustomNotificationBuilder");

    /* renamed from: c */
    private static CustomNotificationBuilder f4392c = null;

    /* renamed from: b */
    private Map<String, Object> f4393b;

    private CustomNotificationBuilder() {
        this.f4393b = null;
        this.f4393b = new HashMap();
    }

    /* renamed from: a */
    private int m3723a(Context context, C5680b c5680b) {
        int i10;
        int iM3750f = c5680b.m3750f();
        if (iM3750f != 0) {
            return iM3750f;
        }
        int iM3622c = C5653b.m3622c() != 0 ? C5653b.m3622c() : context.getResources().getIdentifier(NOTIFICATION_SMALL_ICON_FILE, NOTIFICATION_ICON_RES_TYPE, context.getPackageName());
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon;
        } catch (PackageManager.NameNotFoundException e10) {
            f4391a.m3421e("Get system icon error, package name not found, ", e10);
            i10 = R.drawable.stat_notify_chat;
        }
        return iM3622c == 0 ? i10 : iM3622c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.app.Notification$Style] */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.app.Notification$BigTextStyle] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.app.Notification$BigPictureStyle] */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.alibaba.sdk.android.push.notification.NotificationConfigure] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.app.Notification m3725b(android.content.Context r17, com.alibaba.sdk.android.push.notification.C5680b r18, com.alibaba.sdk.android.push.notification.PushData r19, com.alibaba.sdk.android.push.notification.NotificationConfigure r20) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.push.notification.CustomNotificationBuilder.m3725b(android.content.Context, com.alibaba.sdk.android.push.notification.b, com.alibaba.sdk.android.push.notification.PushData, com.alibaba.sdk.android.push.notification.NotificationConfigure):android.app.Notification");
    }

    /* renamed from: c */
    private Notification m3727c(Context context, C5680b c5680b, PushData pushData, NotificationConfigure notificationConfigure) {
        int iM3765k;
        int iM3772n;
        Uri uri;
        String strM3733a = c5680b.m3733a();
        f4391a.m3417d("building advanced custom notification");
        if (c5680b.m3762j() == 0) {
            return null;
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), c5680b.m3762j());
        remoteViews.setTextViewText(c5680b.m3768l(), c5680b.m3738b());
        remoteViews.setTextViewText(c5680b.m3770m(), c5680b.m3741c());
        if (c5680b.m3772n() != 0) {
            iM3765k = c5680b.m3765k();
            iM3772n = c5680b.m3772n();
        } else {
            iM3765k = c5680b.m3765k();
            iM3772n = R.drawable.stat_notify_chat;
        }
        remoteViews.setImageViewResource(iM3765k, iM3772n);
        String strM3783x = c5680b.m3783x();
        String strM3784y = c5680b.m3784y();
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContent(remoteViews).setPriority(c5680b.m3775p()).setSmallIcon(m3723a(context, c5680b)).setTicker("").setWhen(System.currentTimeMillis());
        if (!TextUtils.isEmpty(strM3783x)) {
            builder.setGroup(strM3783x);
        } else if (!TextUtils.isEmpty(strM3784y)) {
            builder.setGroup(strM3784y);
        }
        builder.setShowWhen(true);
        if (i10 >= 26 && !TextUtils.isEmpty(c5680b.m3776q())) {
            builder.setChannelId(c5680b.m3776q());
        }
        if (!TextUtils.isEmpty(strM3733a)) {
            if (strM3733a.startsWith("android.resource://")) {
                uri = Uri.parse(strM3733a);
            } else {
                uri = Uri.parse(strM3733a.startsWith("/raw/") ? "android.resource://" + context.getPackageName() + strM3733a : "android.resource://" + context.getPackageName() + "/raw/" + strM3733a);
            }
            builder.setSound(uri);
        }
        if (notificationConfigure != null) {
            notificationConfigure.configBuilder(builder, pushData);
        }
        if (!TextUtils.isEmpty(c5680b.m3785z())) {
            String strM3785z = c5680b.m3785z();
            for (Field field : Notification.class.getDeclaredFields()) {
                if (field.getName().equals(strM3785z)) {
                    try {
                        builder.setCategory((String) field.get(null));
                    } catch (IllegalAccessException unused) {
                        f4391a.m3420e("set category error: " + strM3785z);
                    }
                }
            }
        }
        return builder.build();
    }

    public static CustomNotificationBuilder getInstance() {
        if (f4392c == null) {
            f4392c = new CustomNotificationBuilder();
        }
        return f4392c;
    }

    public boolean setCustomNotification(int i10, BasicCustomPushNotification basicCustomPushNotification) throws IOException {
        AmsLogger amsLogger;
        String str;
        boolean z10 = false;
        if (C5571a.m3382a() == null) {
            amsLogger = f4391a;
            str = "need init push first";
        } else if (i10 <= 0) {
            amsLogger = f4391a;
            str = "custom notification id must be an integer greater than 0";
        } else {
            if (basicCustomPushNotification != null) {
                SharedPreferences sharedPreferencesM3390h = C5571a.m3390h();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(basicCustomPushNotification);
                    String strEncode = URLEncoder.encode(byteArrayOutputStream.toString("ISO-8859-1"), Request.DEFAULT_CHARSET);
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    SharedPreferences.Editor editorEdit = sharedPreferencesM3390h.edit();
                    editorEdit.putString(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10, strEncode);
                    editorEdit.commit();
                    z10 = true;
                } catch (IOException e10) {
                    f4391a.m3421e("get custom notification failed", e10);
                }
                if (z10) {
                    if (this.f4393b.containsKey(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10)) {
                        this.f4393b.remove(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10);
                    }
                    f4391a.m3417d("save the notification to cache");
                    this.f4393b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10, basicCustomPushNotification);
                }
                return z10;
            }
            amsLogger = f4391a;
            str = "notification cannot be null";
        }
        amsLogger.m3420e(str);
        return false;
    }

    /* renamed from: b */
    private Bitmap m3726b(Context context, C5680b c5680b) {
        Bitmap bitmapDownloadImage = !TextUtils.isEmpty(c5680b.m3777r()) ? DownloadUtil.downloadImage(context, c5680b.m3777r(), "image") : null;
        if (bitmapDownloadImage == null) {
            if (C5653b.m3621b() != null) {
                return C5653b.m3621b();
            }
            int identifier = context.getResources().getIdentifier(NOTIFICATION_LARGE_ICON_FILE, NOTIFICATION_ICON_RES_TYPE, context.getPackageName());
            if (identifier != 0) {
                return m3724a(context.getResources().getDrawable(identifier));
            }
        }
        return bitmapDownloadImage;
    }

    /* renamed from: a */
    public Notification m3728a(Context context, C5680b c5680b, PushData pushData, NotificationConfigure notificationConfigure) {
        if (2 == c5680b.m3753g()) {
            return m3725b(context, c5680b, pushData, notificationConfigure);
        }
        if (3 == c5680b.m3753g()) {
            return m3727c(context, c5680b, pushData, notificationConfigure);
        }
        return null;
    }

    /* renamed from: a */
    private Bitmap m3724a(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* renamed from: a */
    public BasicCustomPushNotification m3729a(int i10) {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        BasicCustomPushNotification basicCustomPushNotification;
        if (this.f4393b.containsKey(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10)) {
            f4391a.m3417d("find custom notification from cache");
            return (BasicCustomPushNotification) this.f4393b.get(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10);
        }
        f4391a.m3417d("do not find custom notification from cache, find it from SharedPreferences");
        BasicCustomPushNotification basicCustomPushNotification2 = null;
        String string = C5571a.m3390h().getString(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10, null);
        try {
            if (string == null) {
                f4391a.m3420e("no corresponding custom notificaiton");
                return null;
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(URLDecoder.decode(string, Request.DEFAULT_CHARSET).getBytes("ISO-8859-1"));
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                basicCustomPushNotification = (BasicCustomPushNotification) objectInputStream.readObject();
            } catch (OptionalDataException e10) {
                e = e10;
            } catch (StreamCorruptedException e11) {
                e = e11;
            } catch (UnsupportedEncodingException e12) {
                e = e12;
            } catch (IOException e13) {
                e = e13;
            } catch (ClassNotFoundException e14) {
                e = e14;
            }
            try {
                objectInputStream.close();
                byteArrayInputStream.close();
                f4391a.m3417d(basicCustomPushNotification.toString());
                this.f4393b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10, basicCustomPushNotification);
                return basicCustomPushNotification;
            } catch (OptionalDataException e15) {
                e = e15;
                basicCustomPushNotification2 = basicCustomPushNotification;
                f4391a.m3421e("get custom notification failed", e);
                f4391a.m3417d(basicCustomPushNotification2.toString());
                this.f4393b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10, basicCustomPushNotification2);
                return basicCustomPushNotification2;
            } catch (StreamCorruptedException e16) {
                e = e16;
                basicCustomPushNotification2 = basicCustomPushNotification;
                f4391a.m3421e("get custom notification failed", e);
                f4391a.m3417d(basicCustomPushNotification2.toString());
                this.f4393b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10, basicCustomPushNotification2);
                return basicCustomPushNotification2;
            } catch (UnsupportedEncodingException e17) {
                e = e17;
                basicCustomPushNotification2 = basicCustomPushNotification;
                f4391a.m3421e("get custom notification failed", e);
                f4391a.m3417d(basicCustomPushNotification2.toString());
                this.f4393b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10, basicCustomPushNotification2);
                return basicCustomPushNotification2;
            } catch (IOException e18) {
                e = e18;
                basicCustomPushNotification2 = basicCustomPushNotification;
                f4391a.m3421e("get custom notification failed", e);
                f4391a.m3417d(basicCustomPushNotification2.toString());
                this.f4393b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10, basicCustomPushNotification2);
                return basicCustomPushNotification2;
            } catch (ClassNotFoundException e19) {
                e = e19;
                basicCustomPushNotification2 = basicCustomPushNotification;
                f4391a.m3421e("get custom notification failed", e);
                f4391a.m3417d(basicCustomPushNotification2.toString());
                this.f4393b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10, basicCustomPushNotification2);
                return basicCustomPushNotification2;
            } catch (Throwable unused) {
                basicCustomPushNotification2 = basicCustomPushNotification;
                f4391a.m3417d(basicCustomPushNotification2.toString());
                this.f4393b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i10, basicCustomPushNotification2);
                return basicCustomPushNotification2;
            }
        } catch (Throwable unused2) {
        }
    }
}
