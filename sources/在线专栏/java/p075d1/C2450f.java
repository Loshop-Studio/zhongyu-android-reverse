package p075d1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3445n;

/* renamed from: d1.f */
/* loaded from: classes.dex */
public class C2450f extends AbstractC2447c<Boolean> {

    /* renamed from: i */
    private static final String f10024i = AbstractC3445n.m10503f("StorageNotLowTracker");

    public C2450f(Context context, InterfaceC2654a interfaceC2654a) {
        super(context, interfaceC2654a);
    }

    @Override // p075d1.AbstractC2447c
    /* renamed from: g */
    public IntentFilter mo8176g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // p075d1.AbstractC2447c
    /* renamed from: h */
    public void mo8177h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        AbstractC3445n.m10501c().mo10504a(f10024i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            m8184d(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            m8184d(Boolean.TRUE);
        }
    }

    @Override // p075d1.AbstractC2448d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo8175b() {
        Intent intentRegisterReceiver = this.f10012b.registerReceiver(null, mo8176g());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
