package kotlinx.coroutines;

import p075h6.InterfaceC5631c;

/* renamed from: kotlinx.coroutines.z0 */
/* loaded from: classes4.dex */
public final class C6019z0 extends C5961g {

    /* renamed from: i */
    public final C5871c1 f9532i;

    public C6019z0(C5871c1 c5871c1, InterfaceC5631c interfaceC5631c) {
        super(1, interfaceC5631c);
        this.f9532i = c5871c1;
    }

    @Override // kotlinx.coroutines.C5961g
    /* renamed from: s */
    public final Throwable mo5582s(C5871c1 c5871c1) {
        Throwable thM5430c;
        C5871c1 c5871c12 = this.f9532i;
        c5871c12.getClass();
        Object obj = C5871c1.f9288a.get(c5871c12);
        return (!(obj instanceof C5868b1) || (thM5430c = ((C5868b1) obj).m5430c()) == null) ? obj instanceof C5989p ? ((C5989p) obj).f9486a : c5871c1.mo5457f() : thM5430c;
    }

    @Override // kotlinx.coroutines.C5961g
    /* renamed from: z */
    public final String mo5588z() {
        return "AwaitContinuation";
    }
}
