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
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.p020a.C1096a;
import com.alibaba.sdk.android.push.common.global.C1162b;
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

/* loaded from: classes.dex */
public class CustomNotificationBuilder {
    public static final String NOTIFICATION_ICON_RES_TYPE = "drawable";
    public static final String NOTIFICATION_LARGE_ICON_FILE = "alicloud_notification_largeicon";
    public static final String NOTIFICATION_SMALL_ICON_FILE = "alicloud_notification_smallicon";

    /* renamed from: a */
    static AmsLogger f6865a = AmsLogger.getLogger("MPS:CustomNotificationBuilder");

    /* renamed from: c */
    private static CustomNotificationBuilder f6866c = null;

    /* renamed from: b */
    private Map<String, Object> f6867b;

    private CustomNotificationBuilder() {
        this.f6867b = null;
        this.f6867b = new HashMap();
    }

    /* renamed from: a */
    private int m5272a(Context context, C1186b c1186b) {
        int iM5299f = c1186b.m5299f();
        if (iM5299f != 0) {
            return iM5299f;
        }
        int iM5171c = C1162b.m5171c() != 0 ? C1162b.m5171c() : context.getResources().getIdentifier(NOTIFICATION_SMALL_ICON_FILE, NOTIFICATION_ICON_RES_TYPE, context.getPackageName());
        int i4 = R.drawable.stat_notify_chat;
        try {
            i4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon;
        } catch (PackageManager.NameNotFoundException e4) {
            f6865a.m5020e("Get system icon error, package name not found, ", e4);
        }
        return iM5171c == 0 ? i4 : iM5171c;
    }

    /* renamed from: a */
    private Bitmap m5273a(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
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
    private android.app.Notification m5274b(android.content.Context r17, com.alibaba.sdk.android.push.notification.C1186b r18, com.alibaba.sdk.android.push.notification.PushData r19, com.alibaba.sdk.android.push.notification.NotificationConfigure r20) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.push.notification.CustomNotificationBuilder.m5274b(android.content.Context, com.alibaba.sdk.android.push.notification.b, com.alibaba.sdk.android.push.notification.PushData, com.alibaba.sdk.android.push.notification.NotificationConfigure):android.app.Notification");
    }

    /* renamed from: b */
    private Bitmap m5275b(Context context, C1186b c1186b) {
        Bitmap bitmapDownloadImage = !TextUtils.isEmpty(c1186b.m5326r()) ? DownloadUtil.downloadImage(context, c1186b.m5326r(), "image") : null;
        if (bitmapDownloadImage != null) {
            return bitmapDownloadImage;
        }
        if (C1162b.m5170b() != null) {
            return C1162b.m5170b();
        }
        int identifier = context.getResources().getIdentifier(NOTIFICATION_LARGE_ICON_FILE, NOTIFICATION_ICON_RES_TYPE, context.getPackageName());
        return identifier != 0 ? m5273a(context.getResources().getDrawable(identifier)) : bitmapDownloadImage;
    }

    /* renamed from: c */
    private Notification m5276c(Context context, C1186b c1186b, PushData pushData, NotificationConfigure notificationConfigure) {
        int iM5314k;
        int iM5321n;
        Uri uri;
        String strM5282a = c1186b.m5282a();
        f6865a.m5016d("building advanced custom notification");
        if (c1186b.m5311j() == 0) {
            return null;
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), c1186b.m5311j());
        remoteViews.setTextViewText(c1186b.m5317l(), c1186b.m5287b());
        remoteViews.setTextViewText(c1186b.m5319m(), c1186b.m5290c());
        if (c1186b.m5321n() != 0) {
            iM5314k = c1186b.m5314k();
            iM5321n = c1186b.m5321n();
        } else {
            iM5314k = c1186b.m5314k();
            iM5321n = R.drawable.stat_notify_chat;
        }
        remoteViews.setImageViewResource(iM5314k, iM5321n);
        String strM5332x = c1186b.m5332x();
        String strM5333y = c1186b.m5333y();
        int i4 = Build.VERSION.SDK_INT;
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContent(remoteViews).setPriority(c1186b.m5324p()).setSmallIcon(m5272a(context, c1186b)).setTicker("").setWhen(System.currentTimeMillis());
        if (!TextUtils.isEmpty(strM5332x)) {
            builder.setGroup(strM5332x);
        } else if (!TextUtils.isEmpty(strM5333y)) {
            builder.setGroup(strM5333y);
        }
        builder.setShowWhen(true);
        if (i4 >= 26 && !TextUtils.isEmpty(c1186b.m5325q())) {
            builder.setChannelId(c1186b.m5325q());
        }
        if (!TextUtils.isEmpty(strM5282a)) {
            if (strM5282a.startsWith("android.resource://")) {
                uri = Uri.parse(strM5282a);
            } else {
                uri = Uri.parse(strM5282a.startsWith("/raw/") ? "android.resource://" + context.getPackageName() + strM5282a : "android.resource://" + context.getPackageName() + "/raw/" + strM5282a);
            }
            builder.setSound(uri);
        }
        if (notificationConfigure != null) {
            notificationConfigure.configBuilder(builder, pushData);
        }
        if (!TextUtils.isEmpty(c1186b.m5334z())) {
            String strM5334z = c1186b.m5334z();
            for (Field field : Notification.class.getDeclaredFields()) {
                if (field.getName().equals(strM5334z)) {
                    try {
                        builder.setCategory((String) field.get(null));
                    } catch (IllegalAccessException unused) {
                        f6865a.m5019e("set category error: " + strM5334z);
                    }
                }
            }
        }
        return builder.build();
    }

    public static CustomNotificationBuilder getInstance() {
        if (f6866c == null) {
            f6866c = new CustomNotificationBuilder();
        }
        return f6866c;
    }

    /* renamed from: a */
    public Notification m5277a(Context context, C1186b c1186b, PushData pushData, NotificationConfigure notificationConfigure) {
        if (2 == c1186b.m5302g()) {
            return m5274b(context, c1186b, pushData, notificationConfigure);
        }
        if (3 == c1186b.m5302g()) {
            return m5276c(context, c1186b, pushData, notificationConfigure);
        }
        return null;
    }

    /* renamed from: a */
    public BasicCustomPushNotification m5278a(int i4) {
        if (this.f6867b.containsKey(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4)) {
            f6865a.m5016d("find custom notification from cache");
            return (BasicCustomPushNotification) this.f6867b.get(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4);
        }
        f6865a.m5016d("do not find custom notification from cache, find it from SharedPreferences");
        BasicCustomPushNotification basicCustomPushNotification = null;
        String string = C1096a.m4989h().getString(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4, null);
        try {
            if (string == null) {
                f6865a.m5019e("no corresponding custom notificaiton");
                return null;
            }
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(URLDecoder.decode(string, "UTF-8").getBytes("ISO-8859-1"));
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                BasicCustomPushNotification basicCustomPushNotification2 = (BasicCustomPushNotification) objectInputStream.readObject();
                try {
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    f6865a.m5016d(basicCustomPushNotification2.toString());
                    this.f6867b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4, basicCustomPushNotification2);
                    return basicCustomPushNotification2;
                } catch (OptionalDataException e4) {
                    e = e4;
                    basicCustomPushNotification = basicCustomPushNotification2;
                    f6865a.m5020e("get custom notification failed", e);
                    f6865a.m5016d(basicCustomPushNotification.toString());
                    this.f6867b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4, basicCustomPushNotification);
                    return basicCustomPushNotification;
                } catch (StreamCorruptedException e5) {
                    e = e5;
                    basicCustomPushNotification = basicCustomPushNotification2;
                    f6865a.m5020e("get custom notification failed", e);
                    f6865a.m5016d(basicCustomPushNotification.toString());
                    this.f6867b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4, basicCustomPushNotification);
                    return basicCustomPushNotification;
                } catch (UnsupportedEncodingException e6) {
                    e = e6;
                    basicCustomPushNotification = basicCustomPushNotification2;
                    f6865a.m5020e("get custom notification failed", e);
                    f6865a.m5016d(basicCustomPushNotification.toString());
                    this.f6867b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4, basicCustomPushNotification);
                    return basicCustomPushNotification;
                } catch (IOException e7) {
                    e = e7;
                    basicCustomPushNotification = basicCustomPushNotification2;
                    f6865a.m5020e("get custom notification failed", e);
                    f6865a.m5016d(basicCustomPushNotification.toString());
                    this.f6867b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4, basicCustomPushNotification);
                    return basicCustomPushNotification;
                } catch (ClassNotFoundException e8) {
                    e = e8;
                    basicCustomPushNotification = basicCustomPushNotification2;
                    f6865a.m5020e("get custom notification failed", e);
                    f6865a.m5016d(basicCustomPushNotification.toString());
                    this.f6867b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4, basicCustomPushNotification);
                    return basicCustomPushNotification;
                } catch (Throwable unused) {
                    basicCustomPushNotification = basicCustomPushNotification2;
                    f6865a.m5016d(basicCustomPushNotification.toString());
                    this.f6867b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4, basicCustomPushNotification);
                    return basicCustomPushNotification;
                }
            } catch (OptionalDataException e9) {
                e = e9;
            } catch (StreamCorruptedException e10) {
                e = e10;
            } catch (UnsupportedEncodingException e11) {
                e = e11;
            } catch (IOException e12) {
                e = e12;
            } catch (ClassNotFoundException e13) {
                e = e13;
            }
        } catch (Throwable unused2) {
        }
    }

    public boolean setCustomNotification(int i4, BasicCustomPushNotification basicCustomPushNotification) throws IOException {
        AmsLogger amsLogger;
        String str;
        boolean z3 = false;
        if (C1096a.m4981a() == null) {
            amsLogger = f6865a;
            str = "need init push first";
        } else if (i4 <= 0) {
            amsLogger = f6865a;
            str = "custom notification id must be an integer greater than 0";
        } else {
            if (basicCustomPushNotification != null) {
                SharedPreferences sharedPreferencesM4989h = C1096a.m4989h();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(basicCustomPushNotification);
                    String strEncode = URLEncoder.encode(byteArrayOutputStream.toString("ISO-8859-1"), "UTF-8");
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    SharedPreferences.Editor editorEdit = sharedPreferencesM4989h.edit();
                    editorEdit.putString(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4, strEncode);
                    editorEdit.commit();
                    z3 = true;
                } catch (IOException e4) {
                    f6865a.m5020e("get custom notification failed", e4);
                }
                if (z3) {
                    if (this.f6867b.containsKey(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4)) {
                        this.f6867b.remove(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4);
                    }
                    f6865a.m5016d("save the notification to cache");
                    this.f6867b.put(BasicCustomPushNotification.CUSTOM_NOTIFICATION_TAG + i4, basicCustomPushNotification);
                }
                return z3;
            }
            amsLogger = f6865a;
            str = "notification cannot be null";
        }
        amsLogger.m5019e(str);
        return false;
    }
}
