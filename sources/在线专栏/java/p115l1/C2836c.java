package p115l1;

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
import com.aliyun.ams.emas.push.AgooMessageReceiver;
import com.taobao.accs.utl.ALog;
import java.util.Random;
import org.android.agoo.common.AgooConstants;

/* renamed from: l1.c */
/* loaded from: classes.dex */
public class C2836c extends AbstractC2837d {

    /* renamed from: f */
    private static Random f10937f;

    /* renamed from: l */
    private Bitmap m9518l(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* renamed from: m */
    private static String m9519m(String str) {
        try {
            Class<?>[] clsArr = {String.class};
            Object[] objArr = {str};
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", clsArr).invoke(cls, objArr);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: n */
    private static boolean m9520n() {
        try {
            String strM9519m = m9519m("ro.vivo.os.build.display.id");
            if (!Build.MANUFACTURER.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO) && !strM9519m.startsWith("Funtouch")) {
                String strM9519m2 = m9519m("ro.iqoo.os.build.display.id");
                if (strM9519m2 == null) {
                    return false;
                }
                if (TextUtils.isEmpty(strM9519m2.trim())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // p115l1.AbstractC2837d
    /* renamed from: a */
    public Notification mo9521a(Context context) {
        int i4;
        try {
            i4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon;
        } catch (PackageManager.NameNotFoundException e4) {
            ALog.m6091e("BasicNotificationBuilder", "Get system icon error, package name not found, ", e4, new Object[0]);
            i4 = R.drawable.stat_notify_chat;
        }
        Bitmap bitmapM9518l = m9518l(context.getResources().getDrawable(i4));
        int i5 = Build.VERSION.SDK_INT;
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentTitle(m9522b()).setContentText(m9525e()).setSmallIcon(i4).setVibrate(new long[]{100, 250, 100, 250, 100, 250}).setSound(RingtoneManager.getDefaultUri(2)).setPriority(m9527g()).setAutoCancel(true).setLargeIcon(bitmapM9518l).setWhen(System.currentTimeMillis()).setTicker("");
        if (!TextUtils.isEmpty(m9531k())) {
            builder.setGroup(m9531k());
        }
        builder.setShowWhen(true);
        if (i5 >= 26 && !TextUtils.isEmpty(m9529i())) {
            builder.setChannelId(m9529i());
        }
        if (m9520n()) {
            builder.setGroupSummary(true);
            if (f10937f == null) {
                f10937f = new Random(System.currentTimeMillis());
            }
            builder.setGroup(AgooMessageReceiver.NOTIFICATION_GROUP + f10937f.nextInt());
        } else {
            builder.setGroupSummary(false);
            builder.setGroup(AgooMessageReceiver.NOTIFICATION_GROUP);
        }
        return builder.build();
    }
}
