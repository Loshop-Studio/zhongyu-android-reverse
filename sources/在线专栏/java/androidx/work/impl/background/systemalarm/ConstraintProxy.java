package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import p085f1.C2520r;
import p169x0.AbstractC3445n;
import p169x0.C3434c;
import p169x0.EnumC3446o;

/* loaded from: classes.dex */
abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f4775a = AbstractC3445n.m10503f("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    /* renamed from: a */
    static void m4185a(Context context, List<C2520r> list) {
        Iterator<C2520r> it = list.iterator();
        boolean zM10467f = false;
        boolean zM10468g = false;
        boolean zM10470i = false;
        boolean z3 = false;
        while (it.hasNext()) {
            C3434c c3434c = it.next().f10174j;
            zM10467f |= c3434c.m10467f();
            zM10468g |= c3434c.m10468g();
            zM10470i |= c3434c.m10470i();
            z3 |= c3434c.m10463b() != EnumC3446o.NOT_REQUIRED;
            if (zM10467f && zM10468g && zM10470i && z3) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m4186a(context, zM10467f, zM10468g, zM10470i, z3));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC3445n.m10501c().mo10504a(f4775a, String.format("onReceive : %s", intent), new Throwable[0]);
        context.startService(C0817b.m4193b(context));
    }
}
