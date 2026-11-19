package com.zykj.message;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class KillSelfService extends Service {

    /* renamed from: a */
    private final Handler f9798a = new Handler();

    /* renamed from: com.zykj.message.KillSelfService$a */
    static final class RunnableC2408a implements Runnable {
        RunnableC2408a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PackageManager packageManager = KillSelfService.this.getPackageManager();
            Application application = KillSelfService.this.getApplication();
            C2769l.m9238b(application, "application");
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
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        C2769l.m9242f(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i4, int i5) {
        this.f9798a.postDelayed(new RunnableC2408a(), 200L);
        return super.onStartCommand(intent, i4, i5);
    }
}
