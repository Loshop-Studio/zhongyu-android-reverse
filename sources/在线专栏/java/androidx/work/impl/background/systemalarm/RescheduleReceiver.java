package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import p169x0.AbstractC3445n;
import p173y0.C3494i;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f4781a = AbstractC3445n.m10503f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC3445n.m10501c().mo10504a(f4781a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT < 23) {
            context.startService(C0817b.m4196e(context));
            return;
        }
        try {
            C3494i.m10599n(context).m10618y(goAsync());
        } catch (IllegalStateException e4) {
            AbstractC3445n.m10501c().mo10505b(f4781a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e4);
        }
    }
}
