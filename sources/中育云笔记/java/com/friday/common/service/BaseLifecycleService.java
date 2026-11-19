package com.friday.common.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleService;
import com.blankj.utilcode.util.AbstractC5792j;
import kotlin.jvm.internal.AbstractC9979u;
import p200j2.AbstractC9661a;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public class BaseLifecycleService extends LifecycleService {

    /* renamed from: c */
    public static final int f6150c = 8;

    /* renamed from: a */
    public final void m5372a() {
        if (Build.VERSION.SDK_INT < 26) {
            startForeground(1, new Notification());
            return;
        }
        String packageName = getPackageName();
        AbstractC9661a.m19061a();
        NotificationChannel notificationChannelM3900a = AbstractC5792j.m3900a(packageName, "My Background Service", 0);
        notificationChannelM3900a.setLightColor(-16776961);
        notificationChannelM3900a.setLockscreenVisibility(0);
        Object systemService = getSystemService("notification");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannelM3900a);
        Notification notificationBuild = new NotificationCompat.Builder(this, packageName).setOngoing(true).setContentTitle("服务正在运行").setPriority(1).setCategory("service").build();
        AbstractC9979u.m20293f(notificationBuild, "build(...)");
        startForeground(1, notificationBuild);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        m5372a();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
    }
}
