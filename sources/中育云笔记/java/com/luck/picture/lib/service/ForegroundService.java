package com.luck.picture.lib.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.AbstractC5792j;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import p008a7.AbstractC0077j;
import p200j2.AbstractC9661a;
import p235l6.AbstractC10150d;

/* loaded from: classes5.dex */
public class ForegroundService extends Service {

    /* renamed from: c */
    public static final String f12474c = "com.luck.picture.lib." + ForegroundService.class.getName();

    /* renamed from: d */
    public static boolean f12475d = false;

    /* renamed from: c */
    public static void m9470c(Context context) {
        try {
            if (f12475d || !PictureSelectionConfig.m9328c().f12372u0) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) ForegroundService.class);
            if (AbstractC0077j.m216d()) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m9471d(Context context) {
        try {
            if (f12475d) {
                context.stopService(new Intent(context, (Class<?>) ForegroundService.class));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    public final Notification m9472a() {
        int i10 = AbstractC0077j.m213a() ? 4 : 0;
        if (AbstractC0077j.m216d()) {
            AbstractC9661a.m19061a();
            NotificationChannel notificationChannelM3900a = AbstractC5792j.m3900a(f12474c, "com.luck.picture.lib", i10);
            notificationChannelM3900a.setLightColor(-16776961);
            notificationChannelM3900a.canBypassDnd();
            notificationChannelM3900a.setBypassDnd(true);
            notificationChannelM3900a.setLockscreenVisibility(0);
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannelM3900a);
        }
        return new NotificationCompat.Builder(this, f12474c).setSmallIcon(R$drawable.ps_ic_trans_1px).setContentTitle(m9473b()).setContentText(getString(PictureSelectionConfig.m9328c().f12337c == AbstractC10150d.m21191b() ? R$string.ps_use_sound : R$string.ps_use_camera)).setOngoing(true).build();
    }

    /* renamed from: b */
    public final String m9473b() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo.loadLabel(getPackageManager()).toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        startForeground(1, m9472a());
    }

    @Override // android.app.Service
    public void onDestroy() {
        f12475d = false;
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        f12475d = true;
        return super.onStartCommand(intent, i10, i11);
    }
}
