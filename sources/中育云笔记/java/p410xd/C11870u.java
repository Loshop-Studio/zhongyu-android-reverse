package p410xd;

import kotlin.coroutines.InterfaceC9945d;
import sd.AbstractC11106e0;
import sd.AbstractC11134l0;
import sd.InterfaceC11125j;
import sd.InterfaceC11146o0;
import sd.InterfaceC11163t0;

/* renamed from: xd.u */
/* loaded from: classes6.dex */
public final class C11870u extends AbstractC11106e0 implements InterfaceC11146o0 {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11146o0 f28129c;

    /* renamed from: d */
    public final AbstractC11106e0 f28130d;

    /* renamed from: e */
    public final String f28131e;

    /* JADX WARN: Multi-variable type inference failed */
    public C11870u(AbstractC11106e0 abstractC11106e0, String str) {
        InterfaceC11146o0 interfaceC11146o0 = abstractC11106e0 instanceof InterfaceC11146o0 ? (InterfaceC11146o0) abstractC11106e0 : null;
        this.f28129c = interfaceC11146o0 == null ? AbstractC11134l0.m24749a() : interfaceC11146o0;
        this.f28130d = abstractC11106e0;
        this.f28131e = str;
    }

    @Override // sd.InterfaceC11146o0
    /* renamed from: c */
    public InterfaceC11163t0 mo24710c(long j10, Runnable runnable, InterfaceC9945d interfaceC9945d) {
        return this.f28129c.mo24710c(j10, runnable, interfaceC9945d);
    }

    @Override // sd.InterfaceC11146o0
    /* renamed from: d */
    public void mo24711d(long j10, InterfaceC11125j interfaceC11125j) {
        this.f28129c.mo24711d(j10, interfaceC11125j);
    }

    @Override // sd.AbstractC11106e0
    public void dispatch(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        this.f28130d.dispatch(interfaceC9945d, runnable);
    }

    @Override // sd.AbstractC11106e0
    public void dispatchYield(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        this.f28130d.dispatchYield(interfaceC9945d, runnable);
    }

    @Override // sd.AbstractC11106e0
    public boolean isDispatchNeeded(InterfaceC9945d interfaceC9945d) {
        return this.f28130d.isDispatchNeeded(interfaceC9945d);
    }

    @Override // sd.AbstractC11106e0
    public String toString() {
        return this.f28131e;
    }
}
