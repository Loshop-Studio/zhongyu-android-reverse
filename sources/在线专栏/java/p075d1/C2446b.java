package p075d1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3445n;

/* renamed from: d1.b */
/* loaded from: classes.dex */
public class C2446b extends AbstractC2447c<Boolean> {

    /* renamed from: i */
    private static final String f10006i = AbstractC3445n.m10503f("BatteryNotLowTracker");

    public C2446b(Context context, InterfaceC2654a interfaceC2654a) {
        super(context, interfaceC2654a);
    }

    @Override // p075d1.AbstractC2447c
    /* renamed from: g */
    public IntentFilter mo8176g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p075d1.AbstractC2447c
    /* renamed from: h */
    public void mo8177h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        AbstractC3445n.m10501c().mo10504a(f10006i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            m8184d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            m8184d(Boolean.FALSE);
        }
    }

    @Override // p075d1.AbstractC2448d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo8175b() {
        Intent intentRegisterReceiver = this.f10012b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        AbstractC3445n.m10501c().mo10505b(f10006i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
