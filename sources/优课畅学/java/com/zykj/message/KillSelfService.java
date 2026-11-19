package com.zykj.message;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class KillSelfService extends Service {

    /* renamed from: a */
    public final Handler f10404a = new Handler();

    /* renamed from: com.zykj.message.KillSelfService$a */
    public static final class RunnableC7394a implements Runnable {
        public RunnableC7394a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PackageManager packageManager = KillSelfService.this.getPackageManager();
            Application application = KillSelfService.this.getApplication();
            AbstractC9133u.m16129c(application, "application");
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(application.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268435456);
                launchIntentForPackage.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                KillSelfService.this.startActivity(launchIntentForPackage);
                KillSelfService.this.stopSelf();
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC9133u.m16134h(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        this.f10404a.postDelayed(new RunnableC7394a(), 200L);
        return super.onStartCommand(intent, i10, i11);
    }
}
