package p177z0;

import java.util.HashMap;
import java.util.Map;
import p085f1.C2520r;
import p169x0.AbstractC3445n;
import p169x0.InterfaceC3451t;

/* renamed from: z0.a */
/* loaded from: classes.dex */
public class C3506a {

    /* renamed from: d */
    static final String f12288d = AbstractC3445n.m10503f("DelayedWorkTracker");

    /* renamed from: a */
    final C3507b f12289a;

    /* renamed from: b */
    private final InterfaceC3451t f12290b;

    /* renamed from: c */
    private final Map<String, Runnable> f12291c = new HashMap();

    /* renamed from: z0.a$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2520r f12292a;

        a(C2520r c2520r) {
            this.f12292a = c2520r;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3445n.m10501c().mo10504a(C3506a.f12288d, String.format("Scheduling work %s", this.f12292a.f10165a), new Throwable[0]);
            C3506a.this.f12289a.mo58f(this.f12292a);
        }
    }

    public C3506a(C3507b c3507b, InterfaceC3451t interfaceC3451t) {
        this.f12289a = c3507b;
        this.f12290b = interfaceC3451t;
    }

    /* renamed from: a */
    public void m10680a(C2520r c2520r) {
        Runnable runnableRemove = this.f12291c.remove(c2520r.f10165a);
        if (runnableRemove != null) {
            this.f12290b.mo10517b(runnableRemove);
        }
        a aVar = new a(c2520r);
        this.f12291c.put(c2520r.f10165a, aVar);
        this.f12290b.mo10516a(c2520r.m8447a() - System.currentTimeMillis(), aVar);
    }

    /* renamed from: b */
    public void m10681b(String str) {
        Runnable runnableRemove = this.f12291c.remove(str);
        if (runnableRemove != null) {
            this.f12290b.mo10517b(runnableRemove);
        }
    }
}
