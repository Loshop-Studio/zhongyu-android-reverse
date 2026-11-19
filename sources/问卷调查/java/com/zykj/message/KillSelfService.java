package com.zykj.message;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import p160d.p162f.p164b.C1011d;

/* loaded from: classes.dex */
public final class KillSelfService extends Service {

    /* renamed from: b */
    public final Handler f5427b = new Handler();

    /* renamed from: com.zykj.message.KillSelfService$a */
    public static final class RunnableC0983a implements Runnable {
        public RunnableC0983a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PackageManager packageManager = KillSelfService.this.getPackageManager();
            Application application = KillSelfService.this.getApplication();
            C1011d.m2806b(application, "application");
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(application.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268435456);
                launchIntentForPackage.addFlags(67108864);
                KillSelfService.this.startActivity(launchIntentForPackage);
                KillSelfService.this.stopSelf();
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        C1011d.m2810f(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.f5427b.postDelayed(new RunnableC0983a(), 200L);
        return super.onStartCommand(intent, i, i2);
    }
}
