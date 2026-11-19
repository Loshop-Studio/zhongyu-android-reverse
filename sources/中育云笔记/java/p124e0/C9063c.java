package p124e0;

import android.R;
import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import java.util.Random;
import org.android.agoo.common.AgooConstants;
import p038c0.AbstractC5206b;

/* renamed from: e0.c */
/* loaded from: classes3.dex */
public class C9063c extends AbstractC9065e {

    /* renamed from: f */
    public static Random f21231f;

    /* renamed from: m */
    public static String m17835m(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: n */
    public static boolean m17836n() {
        try {
            String strM17835m = m17835m("ro.vivo.os.build.display.id");
            if (!Build.MANUFACTURER.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO) && !strM17835m.startsWith("Funtouch")) {
                String strM17835m2 = m17835m("ro.iqoo.os.build.display.id");
                if (strM17835m2 == null) {
                    return false;
                }
                if (TextUtils.isEmpty(strM17835m2.trim())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // p124e0.AbstractC9065e
    /* renamed from: a */
    public Notification mo17837a(Context context) {
        int i10;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon;
        } catch (PackageManager.NameNotFoundException e10) {
            ALog.m10117e("BasicNotificationBuilder", "Get system icon error, package name not found, ", e10, new Object[0]);
            i10 = R.drawable.stat_notify_chat;
        }
        Bitmap bitmapM17838l = m17838l(context.getResources().getDrawable(i10));
        int i11 = Build.VERSION.SDK_INT;
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentTitle(m17841b()).setContentText(m17844e()).setSmallIcon(i10).setVibrate(new long[]{100, 250, 100, 250, 100, 250}).setSound(RingtoneManager.getDefaultUri(2)).setPriority(m17846g()).setAutoCancel(true).setLargeIcon(bitmapM17838l).setWhen(System.currentTimeMillis()).setTicker("");
        if (!TextUtils.isEmpty(m17850k())) {
            builder.setGroup(m17850k());
        }
        builder.setShowWhen(true);
        if (i11 >= 26 && !TextUtils.isEmpty(m17848i())) {
            builder.setChannelId(m17848i());
        }
        if (m17836n()) {
            builder.setGroupSummary(true);
            if (f21231f == null) {
                f21231f = new Random(System.currentTimeMillis());
            }
            builder.setGroup(AbstractC5206b.NOTIFICATION_GROUP + f21231f.nextInt());
        } else {
            builder.setGroupSummary(false);
            builder.setGroup(AbstractC5206b.NOTIFICATION_GROUP);
        }
        return builder.build();
    }

    /* renamed from: l */
    public final Bitmap m17838l(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
