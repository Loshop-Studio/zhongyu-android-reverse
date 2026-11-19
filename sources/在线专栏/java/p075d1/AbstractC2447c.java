package p075d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3445n;

/* renamed from: d1.c */
/* loaded from: classes.dex */
public abstract class AbstractC2447c<T> extends AbstractC2448d<T> {

    /* renamed from: h */
    private static final String f10007h = AbstractC3445n.m10503f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    private final BroadcastReceiver f10008g;

    /* renamed from: d1.c$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                AbstractC2447c.this.mo8177h(context, intent);
            }
        }
    }

    public AbstractC2447c(Context context, InterfaceC2654a interfaceC2654a) {
        super(context, interfaceC2654a);
        this.f10008g = new a();
    }

    @Override // p075d1.AbstractC2448d
    /* renamed from: e */
    public void mo8180e() {
        AbstractC3445n.m10501c().mo10504a(f10007h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f10012b.registerReceiver(this.f10008g, mo8176g());
    }

    @Override // p075d1.AbstractC2448d
    /* renamed from: f */
    public void mo8181f() {
        AbstractC3445n.m10501c().mo10504a(f10007h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f10012b.unregisterReceiver(this.f10008g);
    }

    /* renamed from: g */
    public abstract IntentFilter mo8176g();

    /* renamed from: h */
    public abstract void mo8177h(Context context, Intent intent);
}
