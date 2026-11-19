package sd;

import p309qc.C10786q;

/* renamed from: sd.a2 */
/* loaded from: classes6.dex */
public final class RunnableC11092a2 implements Runnable {

    /* renamed from: c */
    public final AbstractC11106e0 f26770c;

    /* renamed from: d */
    public final InterfaceC11125j f26771d;

    public RunnableC11092a2(AbstractC11106e0 abstractC11106e0, InterfaceC11125j interfaceC11125j) {
        this.f26770c = abstractC11106e0;
        this.f26771d = interfaceC11125j;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f26771d.mo20501C(this.f26770c, C10786q.f26013a);
    }
}
