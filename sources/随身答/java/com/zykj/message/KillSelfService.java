package com.zykj.message;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m13413d2 = {"Lcom/zykj/message/KillSelfService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "handler", "messageclient_release"}, m13414k = 1, m13415mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class KillSelfService extends Service {

    /* renamed from: a, reason: from kotlin metadata */
    public final Handler handler = new Handler();

    /* renamed from: com.zykj.message.KillSelfService$a */
    public static final class RunnableC7219a implements Runnable {
        public RunnableC7219a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PackageManager packageManager = KillSelfService.this.getPackageManager();
            Application application = KillSelfService.this.getApplication();
            Intrinsics.checkExpressionValueIsNotNull(application, "application");
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
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        this.handler.postDelayed(new RunnableC7219a(), 200L);
        return super.onStartCommand(intent, flags, startId);
    }
}
