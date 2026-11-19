package com.zykj.message;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import com.zykj.message.client.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KillSelfService.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m18d2 = {"Lcom/zykj/message/KillSelfService;", "Landroid/app/Service;", "()V", "handler", "Landroid/os/Handler;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onStartCommand", BuildConfig.FLAVOR, "flags", "startId", "messageclient_release"}, m19k = 1, m20mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class KillSelfService extends Service {
    private final Handler handler = new Handler();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        this.handler.postDelayed(new Runnable() { // from class: com.zykj.message.KillSelfService.onStartCommand.1
            @Override // java.lang.Runnable
            public final void run() {
                PackageManager packageManager = KillSelfService.this.getPackageManager();
                Application application = KillSelfService.this.getApplication();
                Intrinsics.checkExpressionValueIsNotNull(application, "application");
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(application.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(268435456);
                    launchIntentForPackage.addFlags(67108864);
                    KillSelfService.this.startActivity(launchIntentForPackage);
                    KillSelfService.this.stopSelf();
                }
            }
        }, 200L);
        return super.onStartCommand(intent, flags, startId);
    }
}
