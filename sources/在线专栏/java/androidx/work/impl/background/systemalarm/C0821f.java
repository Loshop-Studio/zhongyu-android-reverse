package androidx.work.impl.background.systemalarm;

import android.content.Context;
import p085f1.C2520r;
import p169x0.AbstractC3445n;
import p173y0.InterfaceC3490e;

/* renamed from: androidx.work.impl.background.systemalarm.f */
/* loaded from: classes.dex */
public class C0821f implements InterfaceC3490e {

    /* renamed from: b */
    private static final String f4821b = AbstractC3445n.m10503f("SystemAlarmScheduler");

    /* renamed from: a */
    private final Context f4822a;

    public C0821f(Context context) {
        this.f4822a = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m4228a(C2520r c2520r) {
        AbstractC3445n.m10501c().mo10504a(f4821b, String.format("Scheduling work with workSpecId %s", c2520r.f10165a), new Throwable[0]);
        this.f4822a.startService(C0817b.m4197f(this.f4822a, c2520r.f10165a));
    }

    @Override // p173y0.InterfaceC3490e
    /* renamed from: b */
    public void mo56b(String str) {
        this.f4822a.startService(C0817b.m4198g(this.f4822a, str));
    }

    @Override // p173y0.InterfaceC3490e
    /* renamed from: e */
    public boolean mo57e() {
        return true;
    }

    @Override // p173y0.InterfaceC3490e
    /* renamed from: f */
    public void mo58f(C2520r... c2520rArr) {
        for (C2520r c2520r : c2520rArr) {
            m4228a(c2520r);
        }
    }
}
