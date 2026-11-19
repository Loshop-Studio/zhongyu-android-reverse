package p440zd;

import kotlin.coroutines.InterfaceC9945d;
import p410xd.AbstractC11856l;
import sd.AbstractC11106e0;

/* renamed from: zd.j */
/* loaded from: classes6.dex */
public final class C12049j extends AbstractC11106e0 {

    /* renamed from: c */
    public static final C12049j f28431c = new C12049j();

    @Override // sd.AbstractC11106e0
    public void dispatch(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        C12041b.f28415i.m26671k(runnable, true, false);
    }

    @Override // sd.AbstractC11106e0
    public void dispatchYield(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        C12041b.f28415i.m26671k(runnable, true, true);
    }

    @Override // sd.AbstractC11106e0
    public AbstractC11106e0 limitedParallelism(int i10, String str) {
        AbstractC11856l.m26301a(i10);
        return i10 >= AbstractC12048i.f28428d ? AbstractC11856l.m26302b(this, str) : super.limitedParallelism(i10, str);
    }

    @Override // sd.AbstractC11106e0
    public String toString() {
        return "Dispatchers.IO";
    }
}
