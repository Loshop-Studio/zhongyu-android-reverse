package com.zykj.message;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m5175d2 = {"Lcom/zykj/message/KillSelfService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "Landroid/os/IBinder;", "onBind", "Landroid/os/Handler;", C3335ai.f1705at, "Landroid/os/Handler;", "handler", "<init>", "()V", "messageclient_release"}, m5176k = 1, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class KillSelfService extends Service {

    /* renamed from: a, reason: from kotlin metadata */
    public final Handler handler = new Handler();

    /* renamed from: com.zykj.message.KillSelfService$a */
    public static final class RunnableC3670a implements Runnable {
        public RunnableC3670a() {
        }

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
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        this.handler.postDelayed(new RunnableC3670a(), 200L);
        return super.onStartCommand(intent, flags, startId);
    }
}
