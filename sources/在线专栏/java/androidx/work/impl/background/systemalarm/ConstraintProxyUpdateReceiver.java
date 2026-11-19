package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import p090g1.C2633e;
import p169x0.AbstractC3445n;
import p173y0.C3494i;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f4776a = AbstractC3445n.m10503f("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    class RunnableC0815a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Intent f4777a;

        /* renamed from: b */
        final /* synthetic */ Context f4778b;

        /* renamed from: c */
        final /* synthetic */ BroadcastReceiver.PendingResult f4779c;

        RunnableC0815a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f4777a = intent;
            this.f4778b = context;
            this.f4779c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f4777a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f4777a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f4777a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f4777a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AbstractC3445n.m10501c().mo10504a(ConstraintProxyUpdateReceiver.f4776a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                C2633e.m8834a(this.f4778b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C2633e.m8834a(this.f4778b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C2633e.m8834a(this.f4778b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C2633e.m8834a(this.f4778b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f4779c.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m4186a(Context context, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z4).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z5).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z6);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C3494i.m10599n(context).m10615u().mo8914b(new RunnableC0815a(intent, context, goAsync()));
        } else {
            AbstractC3445n.m10501c().mo10504a(f4776a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
